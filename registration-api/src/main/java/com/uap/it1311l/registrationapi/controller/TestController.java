package com.uap.it1311l.registrationapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String testApi()
	{
		return "test passed";
	}
	
}
