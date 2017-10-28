package com.serverless.mstar.domain.globalnews;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CIK",
    "CUSIP",
    "Symbol",
    "ISIN",
    "Valoren",
    "Name",
    "Market",
    "MarketIdentificationCode",
    "MostLiquidExchange",
    "CategoryOrIndustry"
})
public class Security {

    @JsonProperty("CIK")
    private String cIK;
    @JsonProperty("CUSIP")
    private String cUSIP;
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("ISIN")
    private String iSIN;
    @JsonProperty("Valoren")
    private String valoren;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Market")
    private String market;
    @JsonProperty("MarketIdentificationCode")
    private String marketIdentificationCode;
    @JsonProperty("MostLiquidExchange")
    private Boolean mostLiquidExchange;
    @JsonProperty("CategoryOrIndustry")
    private String categoryOrIndustry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("Symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("ISIN")
    public String getISIN() {
        return iSIN;
    }

    @JsonProperty("ISIN")
    public void setISIN(String iSIN) {
        this.iSIN = iSIN;
    }

    @JsonProperty("Valoren")
    public String getValoren() {
        return valoren;
    }

    @JsonProperty("Valoren")
    public void setValoren(String valoren) {
        this.valoren = valoren;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("MostLiquidExchange")
    public Boolean getMostLiquidExchange() {
        return mostLiquidExchange;
    }

    @JsonProperty("MostLiquidExchange")
    public void setMostLiquidExchange(Boolean mostLiquidExchange) {
        this.mostLiquidExchange = mostLiquidExchange;
    }

    @JsonProperty("CategoryOrIndustry")
    public String getCategoryOrIndustry() {
        return categoryOrIndustry;
    }

    @JsonProperty("CategoryOrIndustry")
    public void setCategoryOrIndustry(String categoryOrIndustry) {
        this.categoryOrIndustry = categoryOrIndustry;
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
        return new ToStringBuilder(this).append("cIK", cIK).append("cUSIP", cUSIP).append("symbol", symbol).append("iSIN", iSIN).append("valoren", valoren).append("name", name).append("market", market).append("marketIdentificationCode", marketIdentificationCode).append("mostLiquidExchange", mostLiquidExchange).append("categoryOrIndustry", categoryOrIndustry).append("additionalProperties", additionalProperties).toString();
    }

}
