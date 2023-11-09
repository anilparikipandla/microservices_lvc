package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/servicename")
	public String getServiceName() {
		return "Welcome to Feign Client";
	}

	
	@GetMapping("/serviceaddress")
	public String getServiceAddress() {
		return "Oracle - India";
	}
	
	@GetMapping("servicedetails")
	public String getServiceDetails() {
		return "Spring Boot Feign Client demo";
	}
}
