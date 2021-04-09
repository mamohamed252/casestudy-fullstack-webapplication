package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SuperHero_Mohamed_Mohamed.entity.ApiMap;
import com.SuperHero_Mohamed_Mohamed.service.FindingService;

@RestController
@RequestMapping("/api")
public class MapApiController {

	@Autowired
	FindingService findingS;
	
	@GetMapping
	@CrossOrigin
	@ResponseStatus
	public @ResponseBody ApiMap getFinding(){
		ApiMap getApi = new ApiMap();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		getApi.setFindingApi(findingS.getAllFinding());
		return getApi;
	}
}
