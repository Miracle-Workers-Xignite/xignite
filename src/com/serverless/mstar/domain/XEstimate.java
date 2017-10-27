package com.serverless.mstar.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Date", "RelativeFiscalPeriod", "Value", "Estimates", "UpRevisions", "DownRevisions", "Low",
		"High", "StandardDeviation", "Median", "LastUpdated" })
public class XEstimate {

	@JsonProperty("Date")
	private String date;
	@JsonProperty("RelativeFiscalPeriod")
	private String relativeFiscalPeriod;
	@JsonProperty("Value")
	private String value;
	@JsonProperty("Estimates")
	private String estimates;
	@JsonProperty("UpRevisions")
	private String upRevisions;
	@JsonProperty("DownRevisions")
	private String downRevisions;
	@JsonProperty("Low")
	private String low;
	@JsonProperty("High")
	private String high;
	@JsonProperty("StandardDeviation")
	private String standardDeviation;
	@JsonProperty("Median")
	private String median;
	@JsonProperty("LastUpdated")
	private String lastUpdated;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Date")
	public String getDate() {
		return date;
	}

	@JsonProperty("Date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("RelativeFiscalPeriod")
	public String getRelativeFiscalPeriod() {
		return relativeFiscalPeriod;
	}

	@JsonProperty("RelativeFiscalPeriod")
	public void setRelativeFiscalPeriod(String relativeFiscalPeriod) {
		this.relativeFiscalPeriod = relativeFiscalPeriod;
	}

	@JsonProperty("Value")
	public String getValue() {
		return value;
	}

	@JsonProperty("Value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("Estimates")
	public String getEstimates() {
		return estimates;
	}

	@JsonProperty("Estimates")
	public void setEstimates(String estimates) {
		this.estimates = estimates;
	}

	@JsonProperty("UpRevisions")
	public String getUpRevisions() {
		return upRevisions;
	}

	@JsonProperty("UpRevisions")
	public void setUpRevisions(String upRevisions) {
		this.upRevisions = upRevisions;
	}

	@JsonProperty("DownRevisions")
	public String getDownRevisions() {
		return downRevisions;
	}

	@JsonProperty("DownRevisions")
	public void setDownRevisions(String downRevisions) {
		this.downRevisions = downRevisions;
	}

	@JsonProperty("Low")
	public String getLow() {
		return low;
	}

	@JsonProperty("Low")
	public void setLow(String low) {
		this.low = low;
	}

	@JsonProperty("High")
	public String getHigh() {
		return high;
	}

	@JsonProperty("High")
	public void setHigh(String high) {
		this.high = high;
	}

	@JsonProperty("StandardDeviation")
	public String getStandardDeviation() {
		return standardDeviation;
	}

	@JsonProperty("StandardDeviation")
	public void setStandardDeviation(String standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	@JsonProperty("Median")
	public String getMedian() {
		return median;
	}

	@JsonProperty("Median")
	public void setMedian(String median) {
		this.median = median;
	}

	@JsonProperty("LastUpdated")
	public String getLastUpdated() {
		return lastUpdated;
	}

	@JsonProperty("LastUpdated")
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
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
