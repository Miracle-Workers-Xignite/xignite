package com.trp.mstar.domain.globalnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trp.mstar.domain.BaseAPIDomainObject;

public class GlobalNewsListSectors extends BaseAPIDomainObject {

 @JsonProperty("Sectors")
 private List<String> Sectors;

public List<String> getSectors() {
	return Sectors;
}

public void setSectors(List<String> sectors) {
	Sectors = sectors;
}

 

}
