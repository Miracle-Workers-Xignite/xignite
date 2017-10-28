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
    "Headlines"
})
public class GlobalNewsTopMarketHeadlines {

    @JsonProperty("Outcome")
    private String outcome;
    @JsonProperty("Message")
    private Object message;
    @JsonProperty("Identity")
    private String identity;
    @JsonProperty("Delay")
    private Double delay;
    @JsonProperty("Headlines")
    private List<Headlines> headlines = null;
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
    public String getIdentity() {
        return identity;
    }

    @JsonProperty("Identity")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @JsonProperty("Delay")
    public Double getDelay() {
        return delay;
    }

    @JsonProperty("Delay")
    public void setDelay(Double delay) {
        this.delay = delay;
    }


    @JsonProperty("Headlines")
    public List<Headlines> getHeadlines() {
        return headlines;
    }

    @JsonProperty("Headlines")
    public void setHeadlines(List<Headlines> headlines) {
        this.headlines = headlines;
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
        return new ToStringBuilder(this).append("outcome", outcome).append("message", message).append("identity", identity).append("delay", delay).append("headlines", headlines).append("additionalProperties", additionalProperties).toString();
    }

}
