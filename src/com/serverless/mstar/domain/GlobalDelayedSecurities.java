package com.serverless.mstar.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalDelayedSecurities {
	@JsonProperty("CIK")
	private int CIK;
	@JsonProperty("CUSIP")
	private int CUSIP;
	@JsonProperty("Symbol")
	private String Symbol;
	@JsonProperty("ISIN")
	private int ISIN;
	@JsonProperty("Valoren")
	private int Valoren;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Market")
	private String Market;
	@JsonProperty("MarketIdentificationCode")
	private String MarketIdentificationCode;
	@JsonProperty("Outcome")
	private boolean MostLiquidExchange;
	@JsonProperty("CategoryOrIndustry")
	private String CategoryOrIndustry;
	public int getCIK() {
		return CIK;
	}
	public void setCIK(int cIK) {
		CIK = cIK;
	}
	public int getCUSIP() {
		return CUSIP;
	}
	public void setCUSIP(int cUSIP) {
		CUSIP = cUSIP;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public int getISIN() {
		return ISIN;
	}
	public void setISIN(int iSIN) {
		ISIN = iSIN;
	}
	public int getValoren() {
		return Valoren;
	}
	public void setValoren(int valoren) {
		Valoren = valoren;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMarket() {
		return Market;
	}
	public void setMarket(String market) {
		Market = market;
	}
	public String getMarketIdentificationCode() {
		return MarketIdentificationCode;
	}
	public void setMarketIdentificationCode(String marketIdentificationCode) {
		MarketIdentificationCode = marketIdentificationCode;
	}
	public boolean isMostLiquidExchange() {
		return MostLiquidExchange;
	}
	public void setMostLiquidExchange(boolean mostLiquidExchange) {
		MostLiquidExchange = mostLiquidExchange;
	}
	public String getCategoryOrIndustry() {
		return CategoryOrIndustry;
	}
	public void setCategoryOrIndustry(String categoryOrIndustry) {
		CategoryOrIndustry = categoryOrIndustry;
	}

}
