package com.boot.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class BootController {
	
	@GetMapping("/welcome")
	public String welcomeRequest()
	{
		System.out.println("Nitin");
		return "Saurabh";
	}

}
