package com.serverless.mstar.lambda.response;

public class EIResponse {
	
	private EIDialogAction dialogAction;

	/**
	 * @return the dialogAction
	 */
	public EIDialogAction getDialogAction() {
		return dialogAction;
	}

	/**
	 * @param dialogAction the dialogAction to set
	 */
	public void setDialogAction(EIDialogAction dialogAction) {
		this.dialogAction = dialogAction;
	}
	
	
	 public EIResponse(EIDialogAction eid){
		this.dialogAction=eid;
	}

}
