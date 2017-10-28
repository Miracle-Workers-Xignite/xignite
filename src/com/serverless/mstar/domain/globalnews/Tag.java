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
    "TagType",
    "TagValues"
})
public class Tag {

    @JsonProperty("TagType")
    private String tagType;
    @JsonProperty("TagValues")
    private List<String> tagValues = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TagType")
    public String getTagType() {
        return tagType;
    }

    @JsonProperty("TagType")
    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    @JsonProperty("TagValues")
    public List<String> getTagValues() {
        return tagValues;
    }

    @JsonProperty("TagValues")
    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
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
        return new ToStringBuilder(this).append("tagType", tagType).append("tagValues", tagValues).append("additionalProperties", additionalProperties).toString();
    }

}
