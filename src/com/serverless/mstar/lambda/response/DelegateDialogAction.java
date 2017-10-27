package com.serverless.mstar.lambda.response;

import java.util.Map;

public class DelegateDialogAction {
	

	
	private String type;
	
	private Map<String,String> slots;

	
	public DelegateDialogAction(String type,Map<String,String> slots){
		this.type=type;
		this.slots=slots;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the slots
	 */
	public Map<String, String> getSlots() {
		return slots;
	}

	/**
	 * @param slots the slots to set
	 */
	public void setSlots(Map<String, String> slots) {
		this.slots = slots;
	}

	
}
