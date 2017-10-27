package com.serverless.mstar.domain.globalnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headlines {

	@JsonProperty("Securities")
	private List<Securities> Securities;
	@JsonProperty("Title")
	private String Title;
	@JsonProperty("Date")
	private String Date;
	@JsonProperty("Time")
	private String Time;
	@JsonProperty("UTCOffset")
	private Integer UTCOffset;
	@JsonProperty("Source")
	private String Source;
	@JsonProperty("Url")
	private String Url;
	@JsonProperty("Images")
	private List<String> Images;
	@JsonProperty("Tags")
	private List<Tags> Tags;

	public List<Securities> getSecurities() {
		return Securities;
	}

	public void setSecurities(List<Securities> securities) {
		Securities = securities;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}
}
