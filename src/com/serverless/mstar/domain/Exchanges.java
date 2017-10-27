package com.serverless.mstar.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exchanges {

	@JsonProperty("MarketIdentificationCode")
	private String MarketIdentificationCode;
	@JsonProperty("Market")
	private String Market;
	@JsonProperty("Region")
	private String Region;
	/**
	 * @return the marketIdentificationCode
	 */
	public String getMarketIdentificationCode() {
		return MarketIdentificationCode;
	}
	/**
	 * @param marketIdentificationCode the marketIdentificationCode to set
	 */
	public void setMarketIdentificationCode(String marketIdentificationCode) {
		MarketIdentificationCode = marketIdentificationCode;
	}
	/**
	 * @return the market
	 */
	public String getMarket() {
		return Market;
	}
	/**
	 * @param market the market to set
	 */
	public void setMarket(String market) {
		Market = market;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return Region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		Region = region;
	}
	
	
	
	
	
}
