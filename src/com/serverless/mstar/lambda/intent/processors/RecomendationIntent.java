package com.serverless.mstar.lambda.intent.processors;

import com.amazonaws.services.lambda.runtime.events.LexEvent;

public class RecomendationIntent extends IntentProcessor{

	@Override
	protected Object validate(LexEvent lexEvent) {
		return lexEvent;
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object fullFill(LexEvent lexEvent) {
		return lexEvent;
		// TODO Auto-generated method stub
		
	}


}
