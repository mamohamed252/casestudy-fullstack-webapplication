package com.SuperHero_Mohamed_Mohamed.entity;

import java.util.List;

public class ApiMap {

	private Integer apiID;
	private List<Finding> findingApi;
	
	
	
	public ApiMap() {
		super();
		this.apiID=1;
	}

	public ApiMap(Integer apiID, List<Finding> findingApi) {
		super();
		this.apiID = apiID;
		this.findingApi = findingApi;
	}
	
	public Integer getApiID() {
		return apiID;
	}
	public void setApiID(Integer apiID) {
		this.apiID = apiID;
	}
	public List<Finding> getFindingApi() {
		return findingApi;
	}
	public void setFindingApi(List<Finding> findingApi) {
		this.findingApi = findingApi;
	}
	
	
	
}
