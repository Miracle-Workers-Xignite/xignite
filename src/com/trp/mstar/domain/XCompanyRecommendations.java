package com.trp.mstar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
"RecommendationSummarySet"
})
public class XCompanyRecommendations {

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
@JsonProperty("RecommendationSummarySet")
private List<XRecommendationSummarySet> recommendationSummarySet = null;
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

@JsonProperty("RecommendationSummarySet")
public List<XRecommendationSummarySet> getRecommendationSummarySet() {
return recommendationSummarySet;
}

@JsonProperty("RecommendationSummarySet")
public void setRecommendationSummarySet(List<XRecommendationSummarySet> recommendationSummarySet) {
this.recommendationSummarySet = recommendationSummarySet;
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
return new ToStringBuilder(this).append("outcome", outcome).append("message", message).append("identity", identity).append("delay", delay).append("company", company).append("recommendationSummarySet", recommendationSummarySet).append("additionalProperties", additionalProperties).toString();
}

}

