package com.serverless.mstar.lambda.response;

public class EIDialogAction {

	
	private String type;
	private Message message;
	
	public EIDialogAction(String type,Message message){
		this.type=type;
		this.message=message;
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

    


}
