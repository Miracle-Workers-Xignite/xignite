package com.serverless.mstar.lambda.intent.processors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.events.LexEvent;
import com.amazonaws.services.lambda.runtime.events.LexEvent.CurrentIntent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.mstar.domain.XCompanyEstimates;
import com.serverless.mstar.domain.XEstimate;
import com.serverless.mstar.domain.XEstimatesSet;
import com.serverless.mstar.lambda.response.DelegateDialogAction;
import com.serverless.mstar.lambda.response.DelegateResponse;
import com.serverless.mstar.lambda.response.DialogAction;
import com.serverless.mstar.lambda.response.ESDialogAction;
import com.serverless.mstar.lambda.response.ElicitSlotResponse;
import com.serverless.mstar.lambda.response.LexResponse;
import com.serverless.mstar.lambda.response.Message;
import com.serverless.mstar.rest.service.XigniteService;

public class XEstimatesIntent extends IntentProcessor{

	
	@Override
	protected Object validate(LexEvent lexEvent) {
		
		System.out.println("from validate "
				+ lexEvent.getCurrentIntent().getSlots());

		Map<String, String> slots = lexEvent.getCurrentIntent().getSlots();
		if (slots.get("Company") == null || slots.get("Company").trim().equalsIgnoreCase("")) {

			System.out.println("from if returning ElicitSlot");
			Message message = new Message("PlainText",
					"Please enter a valid Company symbol ");
			ESDialogAction esd = new ESDialogAction("ElicitSlot", lexEvent
					.getCurrentIntent().getName(), message, "Company", slots);
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
		
		
		String resp=new XigniteService().getEstimatesAsStr(slots.get("Company"));
		ObjectMapper mapper=new ObjectMapper();
		
		XCompanyEstimates[] myObjects = null;
		try {
			myObjects = mapper.readValue(resp, XCompanyEstimates[].class);
			if(myObjects!=null && myObjects.length>0) {
				for(XCompanyEstimates ce:myObjects){
					sb.append("Company: "+ce.getCompany().getName()).append(" , Esitmate Type: ");
					for(int y = 0; y<ce.getEstimatesSets().size();y++) {
						XEstimatesSet estSet = ce.getEstimatesSets().get(y);
						sb.append(estSet.getEstimateType()+" , Estimate: ");
						for (XEstimate est:estSet.getEstimates()) {
							if(y==(ce.getEstimatesSets().size()-1)) {
								sb.append(est.getValue());
							}else {
								sb.append(est.getValue()+" ");
							}
							
						}
						
					}
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Outcome is "+ resp );
		
		
		
		DialogAction dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText","Response from Lambda slot1 is "+slots.get("Company")+"\nEstimates are "+sb.toString()));
		
		Map<String,String> sAttributes=new HashMap<>();
		sAttributes.put("CompanyAttr",slots.get("Company"));
		
		return  new LexResponse(dialogAction, sAttributes);

	}


}
