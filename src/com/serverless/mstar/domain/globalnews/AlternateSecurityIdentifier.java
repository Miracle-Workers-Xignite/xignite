
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
    "AlternateIdentifier",
    "IdentifierType",
    "StartDate",
    "EndDate"
})
public class AlternateSecurityIdentifier {

    @JsonProperty("AlternateIdentifier")
    private String alternateIdentifier;
    @JsonProperty("IdentifierType")
    private String identifierType;
    @JsonProperty("StartDate")
    private Object startDate;
    @JsonProperty("EndDate")
    private Object endDate;

    @JsonProperty("AlternateIdentifier")
    public String getAlternateIdentifier() {
        return alternateIdentifier;
    }

    @JsonProperty("AlternateIdentifier")
    public void setAlternateIdentifier(String alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    @JsonProperty("IdentifierType")
    public String getIdentifierType() {
        return identifierType;
    }

    @JsonProperty("IdentifierType")
    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    @JsonProperty("StartDate")
    public Object getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alternateIdentifier", alternateIdentifier).append("identifierType", identifierType).append("startDate", startDate).append("endDate", endDate).toString();
    }

}
