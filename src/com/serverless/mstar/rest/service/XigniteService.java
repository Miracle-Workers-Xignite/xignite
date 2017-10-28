package com.serverless.mstar.rest.service;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.BaseAPIDomainObject;
import com.serverless.mstar.domain.ExchangeResult;
import com.serverless.mstar.domain.XCompanyRecommendations;
import com.serverless.mstar.domain.globalnews.GlobalNewsListSectors;

public class XigniteService {

	RestTemplate restTemplate = new RestTemplate();

	public ExchangeResult getExchanges() {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				ExchangeResult.class);

	}

	public String getExchangesAsStr() {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);

	}

	// Global News- list Sectors - String
	public String getGlobalNewsListSectorsAsStr() {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/ListSectors?&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);

	}

	// Global News- Today's Market Headlines - String
	public String getGlobalNewsTodaysMarketHeadlinesAsStr() {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTodaysMarketHeadlines?&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);

	}

	
	
	// GlobalNewsTodaysSecurityHeadlinesAsStr
	public String getGlobalNewsTodaysSecurityHeadlinesAsStr(String securityName) {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTodaysSecurityHeadlines?IdentifierType=Symbol&Identifier="+securityName+"&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);
	}

	// GlobalNewsTopSecurityHeadlinesAsStr
	public String getGlobalNewsTopSecurityHeadlinesAsStr(String securityName) {
		return this.restTemplate.getForObject(
				"https://globalnews.xignite.com/xGlobalNews.json/GetTopSecurityHeadlines?IdentifierType=Symbol&Identifier="+securityName+"&Count=3&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);
	}
	
	public String getTopMoversAsStr(String exchangename) {
		return this.restTemplate.getForObject(
				"https://globalquotes.xignite.com/v3/xGlobalQuotes.json/GetTopMarketMovers?MarketMoverType=PercentGainers&NumberOfMarketMovers=3&Exchanges="+exchangename+"&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);
	}
	
	public String getEstimatesAsStr(String companyList) {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/GetLatestEstimates?IdentifierType=Symbol&Identifiers="+companyList+"&EstimateTypes=EPS,Sales&ReportType=Annual&UpdatedSince=&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);
	}

	public String getRecommendationsAsStr(String companyList) {
		return this.restTemplate.getForObject(
				"https://factsetestimates.xignite.com/xFactSetEstimates.json/GetLatestRecommendationSummaries?IdentifierType=Symbol&Identifiers="+companyList+"&UpdatedSince=&_token=AE4A02E0271A4E77B78B314AEE9A132D",
				String.class);
	}
		
		
	public static void main(String s[]) {
		XigniteService svc = new XigniteService();
		String str = "";
		System.out.println("str is = \n" + str);
		ObjectMapper mapper = new ObjectMapper();
		// List<XCompanyEstimates> resList =
		// mapper.readValue(str,List<XCompanyEstimates>.class>);
		XCompanyRecommendations[] myObjects = null;
		try {
			myObjects = mapper.readValue(str, XCompanyRecommendations[].class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (myObjects != null) {
			System.out.println(myObjects.toString());
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
