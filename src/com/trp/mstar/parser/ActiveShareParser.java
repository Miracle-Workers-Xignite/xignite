package com.trp.mstar.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.trp.mstar.builder.ASInvVehicleBuilder;
import com.trp.mstar.domain.ASInvVehicle;

public class ActiveShareParser {

	public static void main(String[] args) throws IOException {

		String fName = "ActiveShareSample";

		try (Scanner scnr = new Scanner(new FileInputStream(new File(
				"C://develop//XMJ//data//" + fName + ".csv")), "UTF-8")
				.useDelimiter("</InvestmentVehicle>");
				FileWriter fw = new FileWriter(new File(
						"C://develop//XMJ//data//" + fName + "csv_js.json"))) {

			StringBuilder sb = new StringBuilder(1024);

			scnr.forEachRemaining(ActiveShareParser::parse);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void parse(String line) {

		List<ASInvVehicle> asInvVehicle = new ASInvVehicleBuilder().withLine(
				line).build();
		asInvVehicle.forEach(ActiveShareParser::convertToJSON);

	}

	private static void convertToJSON(ASInvVehicle asInvVehicle) {

		System.out.println(asInvVehicle);

	}

}
