package com.serverless.mstar.lambda.response;

public class ElicitSlotResponse {

private ESDialogAction dialogAction;

  public ElicitSlotResponse(ESDialogAction dialogAction){
	  this.dialogAction=dialogAction;
  }

/**
 * @return the dialogAction
 */
public ESDialogAction getDialogAction() {
	return dialogAction;
}

/**
 * @param dialogAction the dialogAction to set
 */
public void setDialogAction(ESDialogAction dialogAction) {
	this.dialogAction = dialogAction;
}
	
}
