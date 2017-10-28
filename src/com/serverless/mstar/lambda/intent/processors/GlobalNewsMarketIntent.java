package com.serverless.mstar.lambda.intent.processors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.amazonaws.services.lambda.runtime.events.LexEvent.CurrentIntent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.ExchangeResult;
import com.serverless.mstar.domain.Exchanges;
import com.serverless.mstar.domain.globalnews.GlobalNewsTodaysSecurityHeadlines;
import com.serverless.mstar.domain.globalnews.GlobalNewsTopMarketHeadlines;
import com.serverless.mstar.domain.globalnews.GlobalNewsTopSecurityHeadlines;
import com.serverless.mstar.domain.globalnews.Headline;
import com.serverless.mstar.domain.globalnews.Headlines;
import com.serverless.mstar.lambda.response.DelegateDialogAction;
import com.serverless.mstar.lambda.response.DelegateResponse;
import com.serverless.mstar.lambda.response.DialogAction;
import com.serverless.mstar.lambda.response.ESDialogAction;
import com.serverless.mstar.lambda.response.ElicitSlotResponse;
import com.serverless.mstar.lambda.response.GenericAttachment;
import com.serverless.mstar.lambda.response.LexResponse;
import com.serverless.mstar.lambda.response.Message;
import com.serverless.mstar.lambda.response.ResponseCard;
import com.serverless.mstar.rest.service.XigniteService;


public class GlobalNewsMarketIntent extends IntentProcessor {

	@Override
	protected Object validate(LexEvent lexEvent) {
		
		System.out.println("from validate "
				+ lexEvent.getCurrentIntent().getSlots());

		Map<String, String> slots = lexEvent.getCurrentIntent().getSlots();
		if (slots.get("securityName") != null
				&& !(slots.get("securityName").equalsIgnoreCase("JCP"))) {

			System.out.println("from if returning ElicitSlot");
			Message message = new Message("PlainText",
					"please enter a valid security Name "
							+ slots.get("securityName") + " is not a valid type ");
			ESDialogAction esd = new ESDialogAction("ElicitSlot", lexEvent
					.getCurrentIntent().getName(), message, "securityName", slots);
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
		
		//String securityName = slots.get("securityName");
		
		
		StringBuilder sb=new StringBuilder();
		
		String resp=new XigniteService().getGlobalNewsTopMarketHeadlinesAsStr();
		ObjectMapper mapper=new ObjectMapper();
		
		GlobalNewsTopMarketHeadlines er= mapper.readValue(resp,GlobalNewsTopMarketHeadlines.class);
		
		
		
		System.out.println("Outcome is "+ resp );
		
		ResponseCard respCard = new ResponseCard();
		respCard.setVersion(1);
		respCard.setContentType("application/vnd.amazonaws.card.generic");
		
		List<GenericAttachment> genAttach = new ArrayList<GenericAttachment>();
		GenericAttachment ga = null;
		String imageURL = null;
		
		for(Headlines e:er.getHeadlines()){
			sb.append(e.getTitle()).append(" ");
			ga = new GenericAttachment();
			ga.setTitle(e.getTitle());
			ga.setSubTitle(e.getTitle());
			
			if(e.getImages() != null && e.getImages().size() > 0){
				imageURL = e.getImages().get(0).toString();
			}
			else {
				imageURL = "https://techbuyersguru.com/sites/default/files/pictures/TBGgraphics/icon-news.png";
			}
			ga.setImageUrl(imageURL);
			ga.setAttachmentLinkUrl(e.getUrl());
			ga.setButtons(null);
			
			genAttach.add(ga);
		}
		
		respCard.setGenericAttachments(genAttach);
		
		DialogAction dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText","Top Market Headlines are: "+sb.toString()));
		
		dialogAction.setResponseCard(respCard);
		
		return  new LexResponse(dialogAction, lexEvent.getSessionAttributes());

	}

}
