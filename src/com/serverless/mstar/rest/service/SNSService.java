package com.serverless.mstar.rest.service;

import java.util.Date;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.PublishRequest;
import com.serverless.mstar.domain.BuyOrder;

public class SNSService {

	
	public void publish(BuyOrder buyOrder){
		AmazonSNSClient service = new AmazonSNSClient();

        // Create a topic
        CreateTopicRequest createReq = new CreateTopicRequest()
            .withName("FinBOT");
        
        System.out.println(" request is "+ createReq);
        
         CreateTopicResult createRes = service.createTopic(createReq);
         PublishRequest publishReq = new PublishRequest()
                 //.withTopicArn(createRes.getTopicArn())
                 .withPhoneNumber("+14109138228")
                 .withMessage("Order Placed for stock name "+buyOrder.getStockname()+" quantity "+buyOrder.getQuantity()+" Date is " + new Date());
         
         System.out.println("publish request is "+publishReq);
         service.publish(publishReq);
   }
	
	
}
