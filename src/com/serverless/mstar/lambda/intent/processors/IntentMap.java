package com.serverless.mstar.lambda.intent.processors;



import java.util.HashMap;
import java.util.Map;


public class IntentMap {
	
	private static Map<String,IntentProcessor> procesorMap=new HashMap<>();
	
	static{
		
		procesorMap.put("MarketPerformance",new ExchangeIntent());
		procesorMap.put("GlobalNewsIntent",new GlobalNewsIntent());
		procesorMap.put("XEstimatesIntent",new XEstimatesIntent());
		procesorMap.put("XRecommendationIntent",new XRecommendationsIntent());
		procesorMap.put("GlobalNewsMarketIntent",new GlobalNewsMarketIntent());
		procesorMap.put("BuyIntent", new BuyIntent());
	    
	}
	
	public static synchronized IntentProcessor getProcessor(String key){
		return procesorMap.get(key);
	}
	
	public static boolean containsIntent(String intentName){
		return procesorMap.containsKey(intentName);
	}

}
