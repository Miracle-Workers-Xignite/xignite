package com.serverless.mstar.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseAPIDomainObject {

	@JsonProperty("Outcome")
	private String Outcome;
	@JsonProperty("Message")
	private String Message;
	@JsonProperty("Identity")
	private String Identity;
	@JsonProperty("Delay")
	private double Delay;

	public BaseAPIDomainObject() {
		super();
	}

	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return Outcome;
	}

	/**
	 * @param outcome
	 *            the outcome to set
	 */
	public void setOutcome(String outcome) {
		Outcome = outcome;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}

	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return Identity;
	}

	/**
	 * @param identity
	 *            the identity to set
	 */
	public void setIdentity(String identity) {
		Identity = identity;
	}

	/**
	 * @return the delay
	 */
	public double getDelay() {
		return Delay;
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(double delay) {
		Delay = delay;
	}

}