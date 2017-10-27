package com.serverless.mstar.domain.globalnews;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Securities {

	@JsonProperty("CIK")
	private String CIK;
	@JsonProperty("CUSIP")
	private String CUSIP;
	@JsonProperty("Symbol")
	private String Symbol;
	@JsonProperty("ISIN")
	private String ISIN;
	@JsonProperty("Valoren")
	private String Valoren;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Market")
	private String Market;
	@JsonProperty("MarketIdentificationCode")
	private String MarketIdentificationCode;
	@JsonProperty("MostLiquidExchange")
	private String MostLiquidExchange;
	@JsonProperty("CategoryOrIndustry")
	private String CategoryOrIndustry;

	public String getCIK() {
		return CIK;
	}

	public void setCIK(String cIK) {
		CIK = cIK;
	}

	public String getCUSIP() {
		return CUSIP;
	}

	public void setCUSIP(String cUSIP) {
		CUSIP = cUSIP;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getValoren() {
		return Valoren;
	}

	public void setValoren(String valoren) {
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

	public String getMostLiquidExchange() {
		return MostLiquidExchange;
	}

	public void setMostLiquidExchange(String mostLiquidExchange) {
		MostLiquidExchange = mostLiquidExchange;
	}

	public String getCategoryOrIndustry() {
		return CategoryOrIndustry;
	}

	public void setCategoryOrIndustry(String categoryOrIndustry) {
		CategoryOrIndustry = categoryOrIndustry;
	}

}
