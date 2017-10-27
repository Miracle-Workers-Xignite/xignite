package com.serverless.mstar.domain.globalnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.serverless.mstar.domain.BaseAPIDomainObject;

public class GlobalNewsTodaysMarketHeadlines extends BaseAPIDomainObject {

	@JsonProperty("Headlines")
	private List<Headlines> Headlines;

	public List<Headlines> getHeadlines() {
		return Headlines;
	}

	public void setHeadlines(List<Headlines> headlines) {
		Headlines = headlines;
	}

}
