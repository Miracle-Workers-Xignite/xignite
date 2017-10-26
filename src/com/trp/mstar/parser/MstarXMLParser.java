package com.trp.mstar.parser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trp.mstar.domain.InvVehicle;

public class MstarXMLParser {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	public static String TEST_XML_STRING = "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

	public static void main(String[] args) throws IOException {

		String fName = "Mstar";

	/*	try (Scanner scnr = new Scanner(new FileInputStream(new File(
				"C://develop//XMJ//data//" + fName + ".xml")), "UTF-8")
				.useDelimiter("</InvestmentVehicle>");
				FileWriter fw = new FileWriter(new File(
						"C://develop//XMJ//data//" + fName + "op_js.json"))) {

			StringBuilder sb = new StringBuilder(1024);
            
			
			
			AtomicInteger ac=new AtomicInteger(0);
			
			scnr.forEachRemaining(line -> convertToJSON(
					new StringBuilder(1024)
							.append(line)
							.append("</InvestmentVehicle>")
							.substring(
									line.indexOf("<Operation>"),
									line.indexOf("</Operation>")
											+ "</Operation>".length()), fw,ac.incrementAndGet()));

		} catch (FileNotFoundException je) {
			System.out.println(je.toString());
		}
		*/
		 AmazonS3 s3= new AmazonS3Client();
		
		parse(new FileInputStream(new File("C://develop//XMJ//data//" + fName + ".xml")),s3,"test1","test1");
	}
	
	public static void parse(InputStream is,AmazonS3 s3,String fileName,String bucketName){
		StringBuilder container = new StringBuilder(1000);
	
		try (Scanner scnr = new Scanner(is)
				.useDelimiter("</InvestmentVehicle>")) {

			
           
			
			
			AtomicInteger ac=new AtomicInteger(0);
			
			scnr.forEachRemaining(line -> convertToJSON(
					new StringBuilder(1024)
							.append(line)
							.append("</InvestmentVehicle>")
							.substring(
									line.indexOf("<Operation>"),
									line.indexOf("</Operation>")
											+ "</Operation>".length()),s3,bucketName,fileName,ac.incrementAndGet(),container));
			
			System.out.println("after for Each");
			System.out.println(container.toString());
			
			

		} catch (Exception je) {
			System.out.println(je.toString());
			System.out.println("from exception" +container.toString());
			writeToS3(container, s3, bucketName, fileName+"end");
			
		}
	}
		
		
	
	
	private static   void convertToJSON(String sb,AmazonS3 s3,String bucketName,String fileName,int id,StringBuilder container) {

		JSONObject xmlJSONObj;
		try {

			

			InvVehicle iv = parse(XML.toJSONObject(sb));

			

			String jsonIvString = new ObjectMapper().writeValueAsString(iv);

		


			StringBuilder sb1=new StringBuilder();
			sb1.append("{\"index\":{\"_index\":\"product\",\"_type\":\"iv\",\"_id\":").append(id).append("}}\n");
			
			container.append(sb1);
		    container.append(jsonIvString).append("\n");
		    if(id%1000==0){
		    	System.out.println("from convertToJSON");
		    	writeToS3(container,s3,bucketName,fileName+id);
		    	
				container.setLength(0);
				
		    }
		    	

		}
		
		
		catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);
			System.out.println(container.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		

		
		
	}
	

	private static void writeToS3(StringBuilder container, AmazonS3 s3,
			String bucketName, String fileName) {
		System.out.println("file id is "+fileName);
		   ObjectMetadata obj= new ObjectMetadata();
		   obj.setContentLength(container.toString().getBytes().length);
		   s3.putObject(bucketName,fileName+"_op.json",new ByteArrayInputStream(container.toString().getBytes()), obj);
		
	}

	private static void convertToJSON(String sb, FileWriter fw,int id) {

		
		JSONObject xmlJSONObj;
		try {

			xmlJSONObj = XML.toJSONObject(sb);

			InvVehicle iv = parse(xmlJSONObj);

			ObjectMapper mapper = new ObjectMapper();

			String jsonIvString = mapper.writeValueAsString(iv);

			System.out.println("Investment Vehicle is " + jsonIvString);
			String jsonPrettyPrintString = xmlJSONObj
					.toString(PRETTY_PRINT_INDENT_FACTOR);

			// System.out.println(jsonPrettyPrintString);

			StringBuilder sb1=new StringBuilder();
			sb1.append("{\"index\":{\"_index\":\"product\",\"_type\":\"iv\",\"_id\":").append(id).append("}}\n");
			
			fw.write(sb1.toString());
			fw.write(jsonIvString);
			fw.write("\n");
			fw.flush();

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	private static InvVehicle parse(JSONObject xmlJSONObj) throws JSONException {

		InvVehicle iv = new InvVehicle();
		
		JSONObject opr = xmlJSONObj.getJSONObject("Operation");
		
		
		iv.setFundId(opr.getString("FundId"));
		iv.setFundLegalName(opr.getString("FundLegalName"));
		iv.setFundNetAssets(Long.parseLong(opr.getString("FundNetAssets")));

		iv.setActualManagementFee(Double.parseDouble(opr.getJSONObject(
				"ManagementFee").getString("ActualManagementFee")));
		iv.setGlobalCategoryAssetClass(opr.getJSONObject(
				"GlobalCategoryAssetClass").getString("Name"));
		iv.setGlobalCategoryName(opr.getString("GlobalCategoryName"));
		
		iv.setRegistrationCompany(opr.getJSONObject("CompanyRegistrations").getJSONObject("RegistrationCompany").getString("content"));
        iv.setMorningstarCategory(opr.getJSONObject("MorningstarCategory").getString("Name"));
		return iv;
	}

}
