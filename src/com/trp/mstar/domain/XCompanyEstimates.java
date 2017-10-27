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
"Company",
"EstimatesSets"
})
public class XCompanyEstimates {

@JsonProperty("Outcome")
private String outcome;
@JsonProperty("Message")
private Object message;
@JsonProperty("Identity")
private Object identity;
@JsonProperty("Delay")
private Integer delay;
@JsonProperty("Company")
private XCompany company;
@JsonProperty("EstimatesSets")
private List<XEstimatesSet> estimatesSets = null;
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

@JsonProperty("Company")
public XCompany getCompany() {
return company;
}

@JsonProperty("Company")
public void setCompany(XCompany company) {
this.company = company;
}

@JsonProperty("EstimatesSets")
public List<XEstimatesSet> getEstimatesSets() {
return estimatesSets;
}

@JsonProperty("EstimatesSets")
public void setEstimatesSets(List<XEstimatesSet> estimatesSets) {
this.estimatesSets = estimatesSets;
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
