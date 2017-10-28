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
	"Securities",
    "Title",
    "Date",
    "Time",
    "UTCOffset",
    "Source",
    "Url",
    "Images",
    "Tags"
})
public class Headlines {

	@JsonProperty("Securities")
	private List<Securities> securities = null;
    
	public List<Securities> getSecurities() {
		return securities;
	}

	public void setSecurities(List<Securities> securities) {
		this.securities = securities;
	}


	@JsonProperty("Title")
    private String title;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Time")
    private String time;
    @JsonProperty("UTCOffset")
    private Integer uTCOffset;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("Images")
    private List<Object> images = null;
    @JsonProperty("Tags")
    private List<Tag> tags = null;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("UTCOffset")
    public Integer getUTCOffset() {
        return uTCOffset;
    }

    @JsonProperty("UTCOffset")
    public void setUTCOffset(Integer uTCOffset) {
        this.uTCOffset = uTCOffset;
    }

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("Url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("Url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("Images")
    public List<Object> getImages() {
        return images;
    }

    @JsonProperty("Images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("date", date).append("time", time).append("uTCOffset", uTCOffset).append("source", source).append("url", url).append("images", images).append("tags", tags).toString();
    }

}
