package com.serverless.mstar.lambda;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.serverless.mstar.lambda.intent.processors.IntentMap;
import com.serverless.mstar.lambda.response.EIDialogAction;
import com.serverless.mstar.lambda.response.EIResponse;
import com.serverless.mstar.lambda.response.Message;


public class LexHandler implements RequestHandler<LexEvent,Object>{

	@Override
	public Object handleRequest(LexEvent input, Context context) {
		Object resp=null;
		System.out.println("from request Handler");
		System.out.println("Intent is "+input.getCurrentIntent());
		String intentName=input.getCurrentIntent().getName();
		try {
			if(IntentMap.containsIntent(intentName))
			resp= IntentMap
			               .getProcessor(intentName)
			               .process(input);
			else
				resp=new EIResponse(new EIDialogAction("ElicitIntent", new Message("PlainText","I am sorry I did not get you")));
				
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return resp;
	}
}

	