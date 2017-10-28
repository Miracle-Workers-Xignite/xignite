package com.serverless.mstar.lambda.response;

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
    "type",
    "fulfillmentState",
    "message",
    "responseCard"
})
public class DialogAction {

    @JsonProperty("type")
    private String type;
    @JsonProperty("fulfillmentState")
    private String fulfillmentState;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("responseCard")
    private ResponseCard responseCard;
    
    public DialogAction(String type, String fulfillmentState, Message message) {

        this.type = type;
        this.fulfillmentState = fulfillmentState;
        this.message = message;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("fulfillmentState")
    public String getFulfillmentState() {
        return fulfillmentState;
    }

    @JsonProperty("fulfillmentState")
    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("responseCard")
    public ResponseCard getResponseCard() {
        return responseCard;
    }

    @JsonProperty("responseCard")
    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("fulfillmentState", fulfillmentState).append("message", message).append("responseCard", responseCard).toString();
    }

}
