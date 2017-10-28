
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
    "title",
    "subTitle",
    "imageUrl",
    "attachmentLinkUrl",
    "buttons"
})
public class GenericAttachment {

    @JsonProperty("title")
    private String title;
    @JsonProperty("subTitle")
    private String subTitle;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("attachmentLinkUrl")
    private String attachmentLinkUrl;
    @JsonProperty("buttons")
    private List<Button> buttons = null;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subTitle")
    public String getSubTitle() {
        return subTitle;
    }

    @JsonProperty("subTitle")
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("attachmentLinkUrl")
    public String getAttachmentLinkUrl() {
        return attachmentLinkUrl;
    }

    @JsonProperty("attachmentLinkUrl")
    public void setAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    @JsonProperty("buttons")
    public List<Button> getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("subTitle", subTitle).append("imageUrl", imageUrl).append("attachmentLinkUrl", attachmentLinkUrl).append("buttons", buttons).toString();
    }

}
