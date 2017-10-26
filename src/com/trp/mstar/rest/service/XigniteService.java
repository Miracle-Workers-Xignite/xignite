package com.trp.mstar.rest.service;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.trp.mstar.domain.ExchangeResult;
import com.trp.mstar.domain.Exchanges;

public class XigniteService {

	
	RestTemplate restTemplate=new RestTemplate();
	
	public ExchangeResult getExchanges(){
		return this.restTemplate.getForObject("https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",ExchangeResult.class);
		
		
	}
	
	public String getExchangesAsStr(){
		return this.restTemplate.getForObject("https://factsetestimates.xignite.com/xFactSetEstimates.json/ListExchanges?&_token=AE4A02E0271A4E77B78B314AEE9A132D",String.class);
		
		
	}
	
	public static void main(String s[]){
		System.out.println("exchanges r "+new XigniteService().getExchanges());
	}
	
}
