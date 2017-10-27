package com.trp.mstar.domain;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Outcome",
"Message",
"Identity",
"Delay",
"EstimateType",
"ReportType",
"Currency",
"EstimateFiscalPeriod",
"EstimateFiscalPeriodEndDate",
"Estimates"
})
public class XEstimatesSet {

@JsonProperty("Outcome")
private String outcome;
@JsonProperty("Message")
private Object message;
@JsonProperty("Identity")
private Object identity;
@JsonProperty("Delay")
private Integer delay;
@JsonProperty("EstimateType")
private String estimateType;
@JsonProperty("ReportType")
private String reportType;
@JsonProperty("Currency")
private String currency;
@JsonProperty("EstimateFiscalPeriod")
private String estimateFiscalPeriod;
@JsonProperty("EstimateFiscalPeriodEndDate")
private String estimateFiscalPeriodEndDate;
@JsonProperty("Estimates")
private List<XEstimate> estimates = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

@JsonProperty("EstimateType")
public String getEstimateType() {
return estimateType;
}

@JsonProperty("EstimateType")
public void setEstimateType(String estimateType) {
this.estimateType = estimateType;
}

@JsonProperty("ReportType")
public String getReportType() {
return reportType;
}

@JsonProperty("ReportType")
public void setReportType(String reportType) {
this.reportType = reportType;
}

@JsonProperty("Currency")
public String getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(String currency) {
this.currency = currency;
}

@JsonProperty("EstimateFiscalPeriod")
public String getEstimateFiscalPeriod() {
return estimateFiscalPeriod;
}

@JsonProperty("EstimateFiscalPeriod")
public void setEstimateFiscalPeriod(String estimateFiscalPeriod) {
this.estimateFiscalPeriod = estimateFiscalPeriod;
}

@JsonProperty("EstimateFiscalPeriodEndDate")
public String getEstimateFiscalPeriodEndDate() {
return estimateFiscalPeriodEndDate;
}

@JsonProperty("EstimateFiscalPeriodEndDate")
public void setEstimateFiscalPeriodEndDate(String estimateFiscalPeriodEndDate) {
this.estimateFiscalPeriodEndDate = estimateFiscalPeriodEndDate;
}

@JsonProperty("Estimates")
public List<XEstimate> getEstimates() {
return estimates;
}

@JsonProperty("Estimates")
public void setEstimates(List<XEstimate> estimates) {
this.estimates = estimates;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}