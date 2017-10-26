package com.trp.mstar.lambda;

import java.io.InputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.trp.mstar.parser.MstarXMLParser;


public class LambdaParser implements RequestHandler<S3Event,String>{

	private AmazonS3 s3= AmazonS3ClientBuilder.standard().build();
	
	@Override
	public String handleRequest(S3Event input, Context context) {
      context.getLogger().log("Received events");
      String bucket=input.getRecords().get(0).getS3().getBucket().getName();
      String key=input.getRecords().get(0).getS3().getObject().getKey();
      context.getLogger().log("bucket Name is "+bucket+" key is "+key);
      
      S3Object response=s3.getObject(new GetObjectRequest(bucket,key));
      try(InputStream s3stream=response.getObjectContent()){
      MstarXMLParser.parse(s3stream, s3, key, bucket);
      }
      catch(Exception e){
    	  e.printStackTrace();
      }
      
		return null;
	}

}
