package com.serverless.mstar.domain.globalnews;

import java.util.HashMap;
import java.util.List;
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
    "Outcome",
    "Message",
    "Identity",
    "Delay",
    "Symbol",
    "Name",
    "SEDOL",
    "Currency",
    "Exchange",
    "ActiveDate",
    "InactiveDate",
    "HomeTradingPlace",
    "Active",
    "AlternateSecurityIdentifiers",
    "CustomAttributes",
    "DataProvider"
})
public class SecuritiesResult {

    @JsonProperty("Outcome")
    private String outcome;
    @JsonProperty("Message")
    private Object message;
    @JsonProperty("Identity")
    private Object identity;
    @JsonProperty("Delay")
    private Integer delay;
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("SEDOL")
    private String sEDOL;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Exchange")
    private String exchange;
    @JsonProperty("ActiveDate")
    private Object activeDate;
    @JsonProperty("InactiveDate")
    private Object inactiveDate;
    @JsonProperty("HomeTradingPlace")
    private Boolean homeTradingPlace;
    @JsonProperty("Active")
    private Boolean active;
    @JsonProperty("AlternateSecurityIdentifiers")
    private List<AlternateSecurityIdentifier> alternateSecurityIdentifiers = null;
    @JsonProperty("CustomAttributes")
    private List<CustomAttribute> customAttributes = null;
    @JsonProperty("DataProvider")
    private String dataProvider;

    @JsonProperty("Outcome")
    public String getOutcome() {
        return outcome;
    }

    @JsonProperty("Outcome")
    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @JsonProperty("Message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("Identity")
    public Object getIdentity() {
        return identity;
    }

    @JsonProperty("Identity")
    public void setIdentity(Object identity) {
        this.identity = identity;
    }

    @JsonProperty("Delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("Delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @JsonProperty("Symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("SEDOL")
    public String getSEDOL() {
        return sEDOL;
    }

    @JsonProperty("SEDOL")
    public void setSEDOL(String sEDOL) {
        this.sEDOL = sEDOL;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("Exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("Exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("ActiveDate")
    public Object getActiveDate() {
        return activeDate;
    }

    @JsonProperty("ActiveDate")
    public void setActiveDate(Object activeDate) {
        this.activeDate = activeDate;
    }

    @JsonProperty("InactiveDate")
    public Object getInactiveDate() {
        return inactiveDate;
    }

    @JsonProperty("InactiveDate")
    public void setInactiveDate(Object inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    @JsonProperty("HomeTradingPlace")
    public Boolean getHomeTradingPlace() {
        return homeTradingPlace;
    }

    @JsonProperty("HomeTradingPlace")
    public void setHomeTradingPlace(Boolean homeTradingPlace) {
        this.homeTradingPlace = homeTradingPlace;
    }

    @JsonProperty("Active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("Active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("AlternateSecurityIdentifiers")
    public List<AlternateSecurityIdentifier> getAlternateSecurityIdentifiers() {
        return alternateSecurityIdentifiers;
    }

    @JsonProperty("AlternateSecurityIdentifiers")
    public void setAlternateSecurityIdentifiers(List<AlternateSecurityIdentifier> alternateSecurityIdentifiers) {
        this.alternateSecurityIdentifiers = alternateSecurityIdentifiers;
    }

    @JsonProperty("CustomAttributes")
    public List<CustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    @JsonProperty("CustomAttributes")
    public void setCustomAttributes(List<CustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    @JsonProperty("DataProvider")
    public String getDataProvider() {
        return dataProvider;
    }

    @JsonProperty("DataProvider")
    public void setDataProvider(String dataProvider) {
        this.dataProvider = dataProvider;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("outcome", outcome).append("message", message).append("identity", identity).append("delay", delay).append("symbol", symbol).append("name", name).append("sEDOL", sEDOL).append("currency", currency).append("exchange", exchange).append("activeDate", activeDate).append("inactiveDate", inactiveDate).append("homeTradingPlace", homeTradingPlace).append("active", active).append("alternateSecurityIdentifiers", alternateSecurityIdentifiers).append("customAttributes", customAttributes).append("dataProvider", dataProvider).toString();
    }

}
