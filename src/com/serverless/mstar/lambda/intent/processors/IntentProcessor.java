package com.serverless.mstar.lambda.intent.processors;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public abstract class IntentProcessor {
	
	public Object process(LexEvent lexEvent) throws JsonParseException, JsonMappingException, IOException{
		if(lexEvent.getInvocationSource().equals("DialogCodeHook"))
			return validate(lexEvent);
		else
			return fullFill(lexEvent);
	}

	protected abstract Object validate(LexEvent lexEvent);

	protected abstract Object fullFill(LexEvent lexEvent) throws JsonParseException, JsonMappingException, IOException;
	

}
