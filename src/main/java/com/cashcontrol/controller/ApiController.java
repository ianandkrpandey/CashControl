package com.cashcontrol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cc")
public class ApiController {
	@GetMapping("/welcome/")
	public String test() {
		 return "Application is Running...";
	}


}
