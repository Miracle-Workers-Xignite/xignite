package com.trp.mstar.builder;

import java.util.ArrayList;
import java.util.List;

import com.trp.mstar.domain.ASInvVehicle;

public class ASInvVehicleBuilder {
	
	
	private String line;
	
	public ASInvVehicleBuilder(){
		
	}
	
	
	private ASInvVehicleBuilder(String line){
		this.line=line;
	}
	
	public ASInvVehicleBuilder withLine(String line){
		
		return new ASInvVehicleBuilder(line);
	}
	
	
	public List<ASInvVehicle> build(){
	  
		List<ASInvVehicle> asInvVehicles=new ArrayList();
	  
		String[] data=line.split(",");
		ASInvVehicle asInvVehicle=new ASInvVehicle();
		asInvVehicle.setIvName(data[0]);
		
	  return asInvVehicles;
	}
	

}
