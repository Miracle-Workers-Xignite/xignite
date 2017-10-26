package com.trp.mstar.lambda;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.amazonaws.services.lambda.runtime.events.LexEvent.CurrentIntent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trp.mstar.domain.ExchangeResult;
import com.trp.mstar.domain.Exchanges;
import com.trp.mstar.lambda.response.DialogAction;
import com.trp.mstar.lambda.response.LexResponse;
import com.trp.mstar.lambda.response.Message;
import com.trp.mstar.rest.service.XigniteService;


public class LexHandler implements RequestHandler<LexEvent,Object>{

	@Override
	public Object handleRequest(LexEvent input, Context context) {
		// TODO Auto-generated method stub
		
		LexResponse lex=null;
		try{
		System.out.println("from request Handler");
		System.out.println("Intent is "+input.getCurrentIntent());
		
	
		
		CurrentIntent ci=input.getCurrentIntent();
		
		Map<String,String> slots= ci.getSlots();
		
		//ExchangeResult er= new XigniteService().getExchanges();
		
		StringBuilder sb=new StringBuilder();
		
		String resp=new XigniteService().getExchangesAsStr();
		ObjectMapper mapper=new ObjectMapper();
		
		ExchangeResult er= mapper.readValue(resp,ExchangeResult.class);
		
		
		
		System.out.println("Outcome is "+ resp );
		
		for(Exchanges e:er.getExchangeDescriptions()){
			sb.append(e.getMarket()).append(" ");
		}
		
		DialogAction dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText","Response from Lambda slot1 is "+slots.get("FlowerType")+"Exchanes are "+sb.toString()));
		
	     
		
		lex= new LexResponse(dialogAction, input.getSessionAttributes());
	    //    return response;
		}catch(Exception e){System.out.println(e.getMessage());}
	    return lex;
	}

}



/*  try {
response= new ObjectMapper().writeValueAsString(new LexResponse(dialogAction, input.getSessionAttributes()));
System.out.println("from Handler ======");
System.out.println("response is "+response);
} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/