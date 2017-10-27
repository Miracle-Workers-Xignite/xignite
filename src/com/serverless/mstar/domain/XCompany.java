package com.serverless.mstar.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Name", "Symbol", "CIK", "CUSIP", "SEDOL", "ISIN", "FactSetSecurityID", "FactSetIssuerID",
		"Valoren", "Market", "MarketIdentificationCode", "PrimaryMarket", "PrimaryMarketIdentificationCode", "Sector",
		"Industry", "StatementTemplate" })
public class XCompany {

	@JsonProperty("Name")
	private String name;
	@JsonProperty("Symbol")
	private String symbol;
	@JsonProperty("CIK")
	private String cIK;
	@JsonProperty("CUSIP")
	private String cUSIP;
	@JsonProperty("SEDOL")
	private String sEDOL;
	@JsonProperty("ISIN")
	private String iSIN;
	@JsonProperty("FactSetSecurityID")
	private String factSetSecurityID;
	@JsonProperty("FactSetIssuerID")
	private String factSetIssuerID;
	@JsonProperty("Valoren")
	private String valoren;
	@JsonProperty("Market")
	private String market;
	@JsonProperty("MarketIdentificationCode")
	private String marketIdentificationCode;
	@JsonProperty("PrimaryMarket")
	private String primaryMarket;
	@JsonProperty("PrimaryMarketIdentificationCode")
	private String primaryMarketIdentificationCode;
	@JsonProperty("Sector")
	private String sector;
	@JsonProperty("Industry")
	private String industry;
	@JsonProperty("StatementTemplate")
	private String statementTemplate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("Symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("CIK")
	public String getCIK() {
		return cIK;
	}

	@JsonProperty("CIK")
	public void setCIK(String cIK) {
		this.cIK = cIK;
	}

	@JsonProperty("CUSIP")
	public String getCUSIP() {
		return cUSIP;
	}

	@JsonProperty("CUSIP")
	public void setCUSIP(String cUSIP) {
		this.cUSIP = cUSIP;
	}

	@JsonProperty("SEDOL")
	public String getSEDOL() {
		return sEDOL;
	}

	@JsonProperty("SEDOL")
	public void setSEDOL(String sEDOL) {
		this.sEDOL = sEDOL;
	}

	@JsonProperty("ISIN")
	public String getISIN() {
		return iSIN;
	}

	@JsonProperty("ISIN")
	public void setISIN(String iSIN) {
		this.iSIN = iSIN;
	}

	@JsonProperty("FactSetSecurityID")
	public String getFactSetSecurityID() {
		return factSetSecurityID;
	}

	@JsonProperty("FactSetSecurityID")
	public void setFactSetSecurityID(String factSetSecurityID) {
		this.factSetSecurityID = factSetSecurityID;
	}

	@JsonProperty("FactSetIssuerID")
	public String getFactSetIssuerID() {
		return factSetIssuerID;
	}

	@JsonProperty("FactSetIssuerID")
	public void setFactSetIssuerID(String factSetIssuerID) {
		this.factSetIssuerID = factSetIssuerID;
	}

	@JsonProperty("Valoren")
	public String getValoren() {
		return valoren;
	}

	@JsonProperty("Valoren")
	public void setValoren(String valoren) {
		this.valoren = valoren;
	}

	@JsonProperty("Market")
	public String getMarket() {
		return market;
	}

	@JsonProperty("Market")
	public void setMarket(String market) {
		this.market = market;
	}

	@JsonProperty("MarketIdentificationCode")
	public String getMarketIdentificationCode() {
		return marketIdentificationCode;
	}

	@JsonProperty("MarketIdentificationCode")
	public void setMarketIdentificationCode(String marketIdentificationCode) {
		this.marketIdentificationCode = marketIdentificationCode;
	}

	@JsonProperty("PrimaryMarket")
	public String getPrimaryMarket() {
		return primaryMarket;
	}

	@JsonProperty("PrimaryMarket")
	public void setPrimaryMarket(String primaryMarket) {
		this.primaryMarket = primaryMarket;
	}

	@JsonProperty("PrimaryMarketIdentificationCode")
	public String getPrimaryMarketIdentificationCode() {
		return primaryMarketIdentificationCode;
	}

	@JsonProperty("PrimaryMarketIdentificationCode")
	public void setPrimaryMarketIdentificationCode(String primaryMarketIdentificationCode) {
		this.primaryMarketIdentificationCode = primaryMarketIdentificationCode;
	}

	@JsonProperty("Sector")
	public String getSector() {
		return sector;
	}

	@JsonProperty("Sector")
	public void setSector(String sector) {
		this.sector = sector;
	}

	@JsonProperty("Industry")
	public String getIndustry() {
		return industry;
	}

	@JsonProperty("Industry")
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@JsonProperty("StatementTemplate")
	public String getStatementTemplate() {
		return statementTemplate;
	}

	@JsonProperty("StatementTemplate")
	public void setStatementTemplate(String statementTemplate) {
		this.statementTemplate = statementTemplate;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("symbol", symbol).append("cIK", cIK)
				.append("cUSIP", cUSIP).append("sEDOL", sEDOL).append("iSIN", iSIN)
				.append("factSetSecurityID", factSetSecurityID).append("factSetIssuerID", factSetIssuerID)
				.append("valoren", valoren).append("market", market)
				.append("marketIdentificationCode", marketIdentificationCode).append("primaryMarket", primaryMarket)
				.append("primaryMarketIdentificationCode", primaryMarketIdentificationCode).append("sector", sector)
				.append("industry", industry).append("statementTemplate", statementTemplate)
				.append("additionalProperties", additionalProperties).toString();
	}

}
