package com.trp.mstar.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.trp.mstar.domain.Country;
import com.trp.mstar.domain.CountryIndicator;


public class CsvParser {

	public static void parseCSV(String fileName) {

		try (CSVReader reader = new CSVReader(new FileReader(fileName));
				FileWriter fw = new FileWriter(new File(fileName
						+ "_weo_js.json"))) {

			String[] line;
			long id = 0;
			while ((line = reader.readNext()) != null) {
				if (Subjects.isValidCode(line[2])) {
					id = buildCountryIndicator(line, fw, id);

					id++;
				} else
					continue;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static long buildCountryIndicator(String[] line, FileWriter fw,
			long id) throws JsonProcessingException {
		Country country = new Country(line[1],line[3],line[4], line[2], line[7]);
		for (int i = 9; i < 47; i++) {
			CountryIndicator ci;
			try {
				ci = new CountryIndicator(country, Integer.toString(i + 1971),
						parseAmount(line[i], country.getScale()));
				id++;
				System.out.println(ci);
				StringBuilder sb1 = new StringBuilder();
				sb1.append(
						"{\"index\":{\"_index\":\"country\",\"_type\":\"indicator\",\"_id\":")
						.append(id).append("}}\n");
				String jsonIvString = new ObjectMapper().writeValueAsString(ci);
				sb1.append(jsonIvString);
				fw.write(sb1.toString());
				fw.write("\n");
				fw.flush();

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return id;
	}

	private static long parseAmount(String value, String scale)
			throws ParseException {
		if ("".equals(value) || "n/a".equals(value))
			return 0;
		NumberFormat format = NumberFormat.getInstance(Locale.US);
		Number number = format.parse(value);
		long amount = number.longValue();
		if (scale.equalsIgnoreCase("Billions"))
			return amount * 1000000000;
		else if (scale.equalsIgnoreCase("Millions"))
			return amount * 1000000;
		else
			return amount;

	}

	public static void main(String s[]) {

		parseCSV("c://develop//XMJ//data//WEOApr2017all.csv");

	}

}
