package com.serverless.mstar.lambda.globalnews;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.amazonaws.services.lambda.runtime.events.LexEvent.CurrentIntent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.globalnews.GlobalNewsListSectors;
import com.serverless.mstar.lambda.response.DialogAction;
import com.serverless.mstar.lambda.response.DialogAction_old;
import com.serverless.mstar.lambda.response.LexResponse;
import com.serverless.mstar.lambda.response.Message;
import com.serverless.mstar.rest.service.XigniteService;

public class LexHandlerGlobalNews implements RequestHandler<LexEvent, Object> {

	@Override
	public Object handleRequest(LexEvent input, Context context) {
		// TODO Auto-generated method stub

		LexResponse lex = null;
		try {
			System.out.println("from request Handler");
			System.out.println("Intent is " + input.getCurrentIntent());

			CurrentIntent ci = input.getCurrentIntent();

			Map<String, String> slots = ci.getSlots();

			// ExchangeResult er= new XigniteService().getExchanges();

			StringBuilder sb = new StringBuilder();

			String resp = new XigniteService().getGlobalNewsListSectorsAsStr();
			ObjectMapper mapper = new ObjectMapper();

			GlobalNewsListSectors er = mapper.readValue(resp, GlobalNewsListSectors.class);

			System.out.println("Outcome is " + resp);

			for (int i = 0; i < er.getSectors().size(); i++) {
				sb.append(er.getSectors().get(i)).append("\n");
			}

			DialogAction dialogAction = new DialogAction("Close", "Fulfilled",
					new Message("PlainText", "Response from Lambda slot1 are " + sb.toString()));

			lex = new LexResponse(dialogAction, input.getSessionAttributes());
			// return response;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lex;
	}

}