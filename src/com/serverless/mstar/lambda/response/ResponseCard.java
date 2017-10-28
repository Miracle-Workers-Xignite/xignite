
package com.serverless.mstar.lambda.response;

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
    "version",
    "contentType",
    "genericAttachments"
})
public class ResponseCard {

    @JsonProperty("version")
    private Integer version;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("genericAttachments")
    private List<GenericAttachment> genericAttachments = null;

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("genericAttachments")
    public List<GenericAttachment> getGenericAttachments() {
        return genericAttachments;
    }

    @JsonProperty("genericAttachments")
    public void setGenericAttachments(List<GenericAttachment> genericAttachments) {
        this.genericAttachments = genericAttachments;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("version", version).append("contentType", contentType).append("genericAttachments", genericAttachments).toString();
    }

}
