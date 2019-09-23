package com.poc.cashcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Import({ com.cashcontrol.controller.ApiController.class })
public class CashcontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashcontrolApplication.class, args);
	}

}
