package com.serverless.mstar.lambda.intent.processors;



import java.util.HashMap;
import java.util.Map;


public class IntentMap {
	
	private static Map<String,IntentProcessor> procesorMap=new HashMap<>();
	
	static{
		
		procesorMap.put("OrderFlowers",new FlowerIntent());
		procesorMap.put("MarketPerformance",new ExchangeIntent());
	    
	}
	
	public static synchronized IntentProcessor getProcessor(String key){
		return procesorMap.get(key);
	}
	
	public static boolean containsIntent(String intentName){
		return procesorMap.containsKey(intentName);
	}

}
