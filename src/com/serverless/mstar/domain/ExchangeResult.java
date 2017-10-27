package com.serverless.mstar.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeResult {

 @JsonProperty("Outcome")
 private String Outcome;
 @JsonProperty("Message")
 private String Message;
 @JsonProperty("Identity")
 private String Identity;
 @JsonProperty("Delay")
 private double Delay;
 
 @JsonProperty("ExchangeDescriptions")
 private List<Exchanges> ExchangeDescriptions;

/**
 * @return the outcome
 */
public String getOutcome() {
	return Outcome;
}

/**
 * @param outcome the outcome to set
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
 * @param message the message to set
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
 * @param identity the identity to set
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
 * @param delay the delay to set
 */
public void setDelay(double delay) {
	Delay = delay;
}

/**
 * @return the exchangeDescriptions
 */
public List<Exchanges> getExchangeDescriptions() {
	return ExchangeDescriptions;
}

/**
 * @param exchangeDescriptions the exchangeDescriptions to set
 */
public void setExchangeDescriptions(List<Exchanges> exchangeDescriptions) {
	ExchangeDescriptions = exchangeDescriptions;
}


 

}
