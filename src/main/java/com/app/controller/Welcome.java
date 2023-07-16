package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@GetMapping("/")
	public String welcomeMsg()
	
	{
		return "welcome ashok it....!";
	}

	@GetMapping("/hi")
	
public String hiMsg()
	
	{
		return "welcome hi msg....!";
	}
}
