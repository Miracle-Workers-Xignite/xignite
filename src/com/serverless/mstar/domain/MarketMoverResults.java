package com.serverless.mstar.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MarketMoverResults {
	 @JsonProperty("Outcome")
	 private String Outcome;
	 @JsonProperty("Message")
	 private String Message;
	 @JsonProperty("Identity")
	 private String Identity;
	 @JsonProperty("Delay")
	 private double Delay;
	 @JsonProperty("MarketMoverType")
	 private String MarketMoverType;
	 @JsonProperty("NumberOfMarketMovers")
	 private int NumberOfMarketMovers;
	 @JsonProperty("Exchanges")
	 private String Exchanges;
	 @JsonProperty("InstrumentClass")
	 private String InstrumentClass;
	 @JsonProperty("Movers")
	 private List<MarketMovers> Movers;
	public String getOutcome() {
		return Outcome;
	}
	public void setOutcome(String outcome) {
		Outcome = outcome;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public double getDelay() {
		return Delay;
	}
	public void setDelay(double delay) {
		Delay = delay;
	}
	public String getMarketMoverType() {
		return MarketMoverType;
	}
	public void setMarketMoverType(String marketMoverType) {
		MarketMoverType = marketMoverType;
	}
	public int getNumberOfMarketMovers() {
		return NumberOfMarketMovers;
	}
	public void setNumberOfMarketMovers(int numberOfMarketMovers) {
		NumberOfMarketMovers = numberOfMarketMovers;
	}
	public String getExchanges() {
		return Exchanges;
	}
	public void setExchanges(String exchanges) {
		Exchanges = exchanges;
	}
	public String getInstrumentClass() {
		return InstrumentClass;
	}
	public void setInstrumentClass(String instrumentClass) {
		InstrumentClass = instrumentClass;
	}
	public List<MarketMovers> getMovers() {
		return Movers;
	}
	public void setMovers(List<MarketMovers> movers) {
		Movers = movers;
	}
}
