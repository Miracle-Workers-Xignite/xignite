package com.serverless.mstar.lambda.response;

import java.util.Map;

public class ESDialogAction {

	private String type;
	private String intentName;
	private Message message;
	
	private String slotToElicit;
	private Map<String,String> slots;
	
	
	public ESDialogAction(String type,String intentName,Message message,String slotToElicit,Map<String,String> slots){
		
		this.type=type;
		this.intentName=intentName;
		this.message=message;
		this.slotToElicit=slotToElicit;
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
	 * @return the intentName
	 */
	public String getIntentName() {
		return intentName;
	}


	/**
	 * @param intentName the intentName to set
	 */
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}


	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}


	/**
	 * @return the slotToElicit
	 */
	public String getSlotToElicit() {
		return slotToElicit;
	}


	/**
	 * @param slotToElicit the slotToElicit to set
	 */
	public void setSlotToElicit(String slotToElicit) {
		this.slotToElicit = slotToElicit;
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
