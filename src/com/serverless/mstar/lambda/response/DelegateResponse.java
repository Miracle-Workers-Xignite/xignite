package com.serverless.mstar.lambda.response;

public class DelegateResponse {

	private DelegateDialogAction dialogAction;
	
	public DelegateResponse(DelegateDialogAction dialogAction){
		this.dialogAction=dialogAction;
	}

	/**
	 * @return the dialogAction
	 */
	public DelegateDialogAction getDialogAction() {
		return dialogAction;
	}

	/**
	 * @param dialogAction the dialogAction to set
	 */
	public void setDialogAction(DelegateDialogAction dialogAction) {
		this.dialogAction = dialogAction;
	}
	
	
	
}
