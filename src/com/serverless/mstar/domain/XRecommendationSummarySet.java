package com.serverless.mstar.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Date", "Currency", "TargetPrice", "Recommendation", "RecommendationScore",
		"NumberOfBuyRecommendations", "NumberOfOverweightRecommendations", "NumberOfHoldRecommendations",
		"NumberOfUnderweightRecommendations", "NumberOfSellRecommendations", "TotalNumberOfRecommendations",
		"NumberOfUnreportedRecommendations", "LastUpdated" })
public class XRecommendationSummarySet {

	@JsonProperty("Date")
	private String date;
	@JsonProperty("Currency")
	private String currency;
	@JsonProperty("TargetPrice")
	private String targetPrice;
	@JsonProperty("Recommendation")
	private String recommendation;
	@JsonProperty("RecommendationScore")
	private String recommendationScore;
	@JsonProperty("NumberOfBuyRecommendations")
	private String numberOfBuyRecommendations;
	@JsonProperty("NumberOfOverweightRecommendations")
	private String numberOfOverweightRecommendations;
	@JsonProperty("NumberOfHoldRecommendations")
	private String numberOfHoldRecommendations;
	@JsonProperty("NumberOfUnderweightRecommendations")
	private String numberOfUnderweightRecommendations;
	@JsonProperty("NumberOfSellRecommendations")
	private String numberOfSellRecommendations;
	@JsonProperty("TotalNumberOfRecommendations")
	private String totalNumberOfRecommendations;
	@JsonProperty("NumberOfUnreportedRecommendations")
	private String numberOfUnreportedRecommendations;
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

	@JsonProperty("Currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("Currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("TargetPrice")
	public String getTargetPrice() {
		return targetPrice;
	}

	@JsonProperty("TargetPrice")
	public void setTargetPrice(String targetPrice) {
		this.targetPrice = targetPrice;
	}

	@JsonProperty("Recommendation")
	public String getRecommendation() {
		return recommendation;
	}

	@JsonProperty("Recommendation")
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	@JsonProperty("RecommendationScore")
	public String getRecommendationScore() {
		return recommendationScore;
	}

	@JsonProperty("RecommendationScore")
	public void setRecommendationScore(String recommendationScore) {
		this.recommendationScore = recommendationScore;
	}

	@JsonProperty("NumberOfBuyRecommendations")
	public String getNumberOfBuyRecommendations() {
		return numberOfBuyRecommendations;
	}

	@JsonProperty("NumberOfBuyRecommendations")
	public void setNumberOfBuyRecommendations(String numberOfBuyRecommendations) {
		this.numberOfBuyRecommendations = numberOfBuyRecommendations;
	}

	@JsonProperty("NumberOfOverweightRecommendations")
	public String getNumberOfOverweightRecommendations() {
		return numberOfOverweightRecommendations;
	}

	@JsonProperty("NumberOfOverweightRecommendations")
	public void setNumberOfOverweightRecommendations(String numberOfOverweightRecommendations) {
		this.numberOfOverweightRecommendations = numberOfOverweightRecommendations;
	}

	@JsonProperty("NumberOfHoldRecommendations")
	public String getNumberOfHoldRecommendations() {
		return numberOfHoldRecommendations;
	}

	@JsonProperty("NumberOfHoldRecommendations")
	public void setNumberOfHoldRecommendations(String numberOfHoldRecommendations) {
		this.numberOfHoldRecommendations = numberOfHoldRecommendations;
	}

	@JsonProperty("NumberOfUnderweightRecommendations")
	public String getNumberOfUnderweightRecommendations() {
		return numberOfUnderweightRecommendations;
	}

	@JsonProperty("NumberOfUnderweightRecommendations")
	public void setNumberOfUnderweightRecommendations(String numberOfUnderweightRecommendations) {
		this.numberOfUnderweightRecommendations = numberOfUnderweightRecommendations;
	}

	@JsonProperty("NumberOfSellRecommendations")
	public String getNumberOfSellRecommendations() {
		return numberOfSellRecommendations;
	}

	@JsonProperty("NumberOfSellRecommendations")
	public void setNumberOfSellRecommendations(String numberOfSellRecommendations) {
		this.numberOfSellRecommendations = numberOfSellRecommendations;
	}

	@JsonProperty("TotalNumberOfRecommendations")
	public String getTotalNumberOfRecommendations() {
		return totalNumberOfRecommendations;
	}

	@JsonProperty("TotalNumberOfRecommendations")
	public void setTotalNumberOfRecommendations(String totalNumberOfRecommendations) {
		this.totalNumberOfRecommendations = totalNumberOfRecommendations;
	}

	@JsonProperty("NumberOfUnreportedRecommendations")
	public String getNumberOfUnreportedRecommendations() {
		return numberOfUnreportedRecommendations;
	}

	@JsonProperty("NumberOfUnreportedRecommendations")
	public void setNumberOfUnreportedRecommendations(String numberOfUnreportedRecommendations) {
		this.numberOfUnreportedRecommendations = numberOfUnreportedRecommendations;
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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("date", date).append("currency", currency)
				.append("targetPrice", targetPrice).append("recommendation", recommendation)
				.append("recommendationScore", recommendationScore)
				.append("numberOfBuyRecommendations", numberOfBuyRecommendations)
				.append("numberOfOverweightRecommendations", numberOfOverweightRecommendations)
				.append("numberOfHoldRecommendations", numberOfHoldRecommendations)
				.append("numberOfUnderweightRecommendations", numberOfUnderweightRecommendations)
				.append("numberOfSellRecommendations", numberOfSellRecommendations)
				.append("totalNumberOfRecommendations", totalNumberOfRecommendations)
				.append("numberOfUnreportedRecommendations", numberOfUnreportedRecommendations)
				.append("lastUpdated", lastUpdated).append("additionalProperties", additionalProperties).toString();
	}

}
