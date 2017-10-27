package com.serverless.mstar.lambda.intent.processors;

import java.io.IOException;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.amazonaws.services.lambda.runtime.events.LexEvent.CurrentIntent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.ExchangeResult;
import com.serverless.mstar.domain.Exchanges;
import com.serverless.mstar.lambda.response.DelegateDialogAction;
import com.serverless.mstar.lambda.response.DelegateResponse;
import com.serverless.mstar.lambda.response.DialogAction;
import com.serverless.mstar.lambda.response.ESDialogAction;
import com.serverless.mstar.lambda.response.ElicitSlotResponse;
import com.serverless.mstar.lambda.response.LexResponse;
import com.serverless.mstar.lambda.response.Message;
import com.serverless.mstar.rest.service.XigniteService;


public class FlowerIntent extends IntentProcessor {

	@Override
	protected Object validate(LexEvent lexEvent) {
		
		System.out.println("from validate "
				+ lexEvent.getCurrentIntent().getSlots());

		Map<String, String> slots = lexEvent.getCurrentIntent().getSlots();
		if (slots.get("FlowerType") != null
				&& !(slots.get("FlowerType").equalsIgnoreCase("rose"))) {

			System.out.println("from if returning ElicitSlot");
			Message message = new Message("PlainText",
					"please enter a valid FlowerType "
							+ slots.get("FlowerType") + " is not a valid type ");
			ESDialogAction esd = new ESDialogAction("ElicitSlot", lexEvent
					.getCurrentIntent().getName(), message, "FlowerType", slots);
			return new ElicitSlotResponse(esd);

		} else {

			System.out.println("returning Delegate");

			return new DelegateResponse(new DelegateDialogAction("Delegate",
					slots));
		}

	}

	@Override
	protected Object fullFill(LexEvent lexEvent) throws JsonParseException, JsonMappingException, IOException {
        
		
		CurrentIntent ci=lexEvent.getCurrentIntent();

		
		Map<String,String> slots= ci.getSlots();
		
		
		StringBuilder sb=new StringBuilder();
		
		String resp=new XigniteService().getExchangesAsStr();
		ObjectMapper mapper=new ObjectMapper();
		
		ExchangeResult er= mapper.readValue(resp,ExchangeResult.class);
		
		
		
		System.out.println("Outcome is "+ resp );
		
		for(Exchanges e:er.getExchangeDescriptions()){
			sb.append(e.getMarket()).append(" ");
		}
		
		DialogAction dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText","Response from Lambda slot1 is "+slots.get("FlowerType")+"Exchanes are "+sb.toString()));
		
	     
		
		return  new LexResponse(dialogAction, lexEvent.getSessionAttributes());

	}

}
