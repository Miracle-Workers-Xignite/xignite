package com.serverless.mstar.lambda.intent.processors;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.ExchangeResult;
import com.serverless.mstar.domain.Exchanges;
import com.serverless.mstar.domain.MarketMoverResults;
import com.serverless.mstar.domain.MarketMovers;
import com.serverless.mstar.lambda.response.DelegateDialogAction;
import com.serverless.mstar.lambda.response.DelegateResponse;
import com.serverless.mstar.lambda.response.DialogAction;
import com.serverless.mstar.lambda.response.ESDialogAction;
import com.serverless.mstar.lambda.response.ElicitSlotResponse;
import com.serverless.mstar.lambda.response.LexResponse;
import com.serverless.mstar.lambda.response.Message;
import com.serverless.mstar.rest.service.XigniteService;

public class ExchangeIntent extends IntentProcessor{

	


	@Override
	protected Object validate(LexEvent lexEvent) {
		System.out.println("from validate "
				+ lexEvent.getCurrentIntent().getSlots());
		
		ElicitSlotResponse resp=null;
		Map<String, String> slots = lexEvent.getCurrentIntent().getSlots();
		String exchangeName=slots.get("exchangename");
		System.out.println("exchange name is "+exchangeName);	
		
		if (exchangeName!= null && !isValidExchange(exchangeName)) {

				System.out.println("from if returning ElicitSlot");
				Message message = new Message("PlainText",
						"please enter a valid ExchangeName "
								+ exchangeName + " is not a valid Exchange ");
				ESDialogAction esd = new ESDialogAction("ElicitSlot", lexEvent
						.getCurrentIntent().getName(), message, "exchangename", slots);
				
				return new ElicitSlotResponse(esd);

			
           }
			else{
				System.out.println("returning ExchangeIntent delegate "+slots.get("exchangename"));

				return new DelegateResponse(new DelegateDialogAction("Delegate",slots));
				
			}
		
	}

	@Override
	protected Object fullFill(LexEvent lexEvent) {
		
		System.out.println("from fullfill");
		String str=new XigniteService().getTopMoversAsStr(lexEvent.getCurrentIntent().getSlots().get("exchangename"));
		try {
			MarketMoverResults mrs=new ObjectMapper().readValue(str, MarketMoverResults.class);
			 List<MarketMovers> movers= mrs.getMovers();
			 StringBuilder sb=new StringBuilder();
			 sb.append("The top movers by Percent Gain are ");
			 for(MarketMovers m:  movers){
				 sb.append(m.getName()).append(" ")
				 .append("Gained ").append(m.getPercentChangeFromPreviousClose()).append("\n");
				 
			 }
			 
			 DialogAction dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText",sb.toString()));
			 
			 return  new LexResponse(dialogAction, lexEvent.getSessionAttributes());
			 
			 
			 
			 
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	private static boolean isValidExchange(String exchangeName) {
		boolean isValid=false;
		try{
	ExchangeResult er=new ObjectMapper().readValue(new XigniteService().getExchangesAsStr(),ExchangeResult.class);
	isValid= er.getExchangeDescriptions()
	.stream()
	.anyMatch(ed->ed.getMarketIdentificationCode().equalsIgnoreCase(exchangeName));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isValid;
	
	}
	
	
	
	
	
	public static void main(String s[]) throws JsonMappingException, IOException, Exception{
		boolean result=isValidExchange("XNYS");
		System.out.println("result is "+result);
	}

}
