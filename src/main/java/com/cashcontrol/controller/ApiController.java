package com.cashcontrol.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cc")
public class ApiController {
	@RequestMapping("/test/")
	public String test() {
		 return "ANAND";
	}

}
