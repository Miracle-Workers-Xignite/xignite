package com.trp.mstar.rest.service;

import org.springframework.web.client.RestTemplate;

import com.trp.mstar.domain.BaseAPIDomainObject;
import com.trp.mstar.domain.ExchangeResult;
import com.trp.mstar.domain.globalnews.GlobalNewsListSectors;
import com.trp.mstar.domain.globalnews.GlobalNewsTodaysMarketHeadlines;

public class XigniteService {

	
	RestTemplate restTemplate=new RestTemplate();
	
	public ExchangeResult getExchanges(){
		return this.restTemplate.getForObject("https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",ExchangeResult.class);
		
		
	}
	
	public String getExchangesAsStr(){
		return this.restTemplate.getForObject("https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",String.class);
		
		
	}
	
	//Global News-  list Sectors - GlobalNewsListSectors
	public BaseAPIDomainObject getGlobalNewsListSectors(){
		return this.restTemplate.getForObject("https://globalnews.xignite.com/xGlobalNews.json/ListSectors?&_token=AE4A02E0271A4E77B78B314AEE9A132D",GlobalNewsListSectors.class);
		
		
	}
	
	//Global News-  list Sectors - String
	public String getGlobalNewsListSectorsAsStr(){
		return this.restTemplate.getForObject("https://globalnews.xignite.com/xGlobalNews.json/ListSectors?&_token=AE4A02E0271A4E77B78B314AEE9A132D",String.class);
		
		
	}
	
	//Global News-  Today's Market Headlines - GlobalNewsTodaysMarketHeadlines
		public GlobalNewsTodaysMarketHeadlines getGlobalNewsTodaysMarketHeadlines(){
			return this.restTemplate.getForObject("https://globalnews.xignite.com/xGlobalNews.json/GetTodaysMarketHeadlines?&_token=AE4A02E0271A4E77B78B314AEE9A132D",GlobalNewsTodaysMarketHeadlines.class);
			
			
		}
	
	//Global News-  Today's Market Headlines - String
	public String getGlobalNewsTodaysMarketHeadlinesAsStr(){
		return this.restTemplate.getForObject("https://globalnews.xignite.com/xGlobalNews.json/GetTodaysMarketHeadlines?&_token=AE4A02E0271A4E77B78B314AEE9A132D",String.class);
		
		
	}
	
	public static void main(String s[]){
		System.out.println("exchanges r "+new XigniteService().getGlobalNewsTodaysMarketHeadlinesAsStr());
	}
	
}
