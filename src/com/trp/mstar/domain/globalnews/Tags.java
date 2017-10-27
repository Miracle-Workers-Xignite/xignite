package com.trp.mstar.domain.globalnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags {

	@JsonProperty("TagType")
	private String TagType;
	@JsonProperty("TagValues")
	private List<String> TagValues;
	public String getTagType() {
		return TagType;
	}
	public void setTagType(String tagType) {
		TagType = tagType;
	}
	public List<String> getTagValues() {
		return TagValues;
	}
	public void setTagValues(List<String> tagValues) {
		TagValues = tagValues;
	}
	
	

}
