package com.trp.mstar.parser;

import java.util.Arrays;

public enum Subjects {
	
	GDP_NOMINAL("NGDPD","GDP Nominal in US dollars"),
	GDP_PERCAPITA("NGDPDPC","Gross domestic product per capita, current prices"),
	CURRENT_ACCOUNT_BALANCE("BCA","Current account Balance"),
	POPULATION("LP","Population");
	

	
	
	private final String description;
	private final String code;
	
	
	Subjects(String code,String description){
		this.code=code;
		this.description=description;
	}
	

   public static boolean isValidCode(String code){
	   
	  return Arrays.stream(Subjects.values()).anyMatch(s->s.code.equals(code));
   }
	
	
   public static void main(String s[]){
	   System.out.println(isValidCode("BCA"));
   }
   
   
   
}
