package com.serverless.mstar.rest.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.BaseAPIDomainObject;
import com.serverless.mstar.domain.BuyOrder;
import com.serverless.mstar.domain.ExchangeResult;
import com.serverless.mstar.domain.XCompanyRecommendations;
import com.serverless.mstar.domain.globalnews.GlobalNewsListSectors;
import com.serverless.mstar.domain.globalnews.SecuritiesResult;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.util.Base64;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class XigniteService {

	RestTemplate restTemplate = new RestTemplate();
	String _token = System.getenv().get("xtoken").toString();
	
	public ExchangeResult getExchanges() {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token="+_token,
				ExchangeResult.class);

	}

	public String getExchangesAsStr() {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token="+_token,
				String.class);

	}

	// Global News- list Sectors - String
	public String getGlobalNewsListSectorsAsStr() {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/ListSectors?&_token="+_token,
				String.class);

	}

	// Global News- Today's Market Headlines - String
	public String getGlobalNewsTodaysMarketHeadlinesAsStr() {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTodaysMarketHeadlines?&_token="+_token,
				String.class);

	}

	
	
	// GlobalNewsTodaysSecurityHeadlinesAsStr
	public String getGlobalNewsTodaysSecurityHeadlinesAsStr(String securityName) {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTodaysSecurityHeadlines?IdentifierType=Symbol&Identifier="+securityName+"&_token="+_token,
				String.class);
	}

	// GlobalNewsTopSecurityHeadlinesAsStr
	public String getGlobalNewsTopSecurityHeadlinesAsStr(String securityName) {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTopSecurityHeadlines?IdentifierType=Symbol&Identifier="+securityName+"&Count=3&_token="+_token,
				String.class);
	}
	
	public String getTopMoversAsStr(String exchangename) {
		return this.restTemplate.getForObject(
				"https://globalquotes.xignite.com/v3/xGlobalQuotes.json/GetTopMarketMovers?MarketMoverType=PercentGainers&NumberOfMarketMovers=3&Exchanges="+exchangename+"&_token="+_token,
				String.class);
	}
	
	public String getEstimatesAsStr(String companyList) {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/GetLatestEstimates?IdentifierType=Symbol&Identifiers="+companyList+"&EstimateTypes=EPS,Sales&ReportType=Annual&UpdatedSince=&_token="+_token,
				String.class);
	}

	public String getRecommendationsAsStr(String companyList) {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/GetLatestRecommendationSummaries?IdentifierType=Symbol&Identifiers="+companyList+"&UpdatedSince=&_token="+_token,
				String.class);
	}
	
	public String getGlobalNewsTopMarketHeadlinesAsStr() {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTopMarketHeadlines?Count=3&_token="+_token,
				String.class);
	}
	
	public String getGetSecuritiesAsStr(String securityName) {
		return this.restTemplate.getForObject(
				"https://globalmaster.xignite.com/xglobalmaster.json/GetSecurities?IdentifierType=Symbol&Identifiers="+securityName+"&AsOfDate=10/27/2017&_token="+_token,
				String.class);
		
	}
	
	public void saveToDynamo(BuyOrder buyOrder){
		try {
			
			String order=new ObjectMapper().writeValueAsString(buyOrder);
			System.out.println("order JSON is "+order);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(order,headers);

			String ans=this.restTemplate.postForObject("https://fpdv1komk2.execute-api.us-east-1.amazonaws.com/prod/portfolio", entity,String.class);
			System.out.println("Answer is "+ans);
			
			//System.out.println("ststus is "+entity.getStatusCode());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
	public static void main(String s[]) {
		XigniteService svc = new XigniteService();
		String str = "";
		System.out.println("str is = \n" + str);
		ObjectMapper mapper = new ObjectMapper();
		// List<XCompanyEstimates> resList =
		// mapper.readValue(str,List<XCompanyEstimates>.class>);
		
		String sName = "TROW";
		SecuritiesResult[] myObjects = null;
		//List<SecuritiesResult> er = null;
		try {
			//List<SecuritiesResult> er=new ObjectMapper().readValue(new XigniteService().getGetSecuritiesAsStr("TROW"),List.class);
			myObjects = new ObjectMapper().readValue(new XigniteService().getGetSecuritiesAsStr(sName),SecuritiesResult[].class);
			
				
				if(myObjects!=null && myObjects.length>0) {
					for(SecuritiesResult ce:myObjects){
						if(ce.getOutcome() != null && ce.getOutcome().toString().equalsIgnoreCase("Success")){
							System.out.println("valid security: "+sName);
							break;
						}
						
					}
				}
				
				System.out.println(myObjects[0].getOutcome().toString());
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (myObjects != null) {
			System.out.println(myObjects.length);
		}
		// List<XCompanyEstimates> myObjects = mapper.readValue(str, new
		// TypeReference<List<XCompanyEstimates>>(){});
	}

	

	/*
	 * public static void main(String s[]){
	 * System.out.println("exchanges r "+new
	 * XigniteService().getGlobalNewsTodaysMarketHeadlinesAsStr()); }
	 */

}
