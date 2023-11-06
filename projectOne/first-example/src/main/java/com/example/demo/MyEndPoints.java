package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {
	
	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservice Example";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome, "+name+"!";
	}
	
	@RequestMapping(path="/secondpathvar/{name}")
	public String sayhellopath(@PathVariable String name) {
		return "path Definitions: "+name;
	}
	
	@GetMapping(path="/secondsamplebean")
	public SecondSampleBean secondSampleBean() {
		return new SecondSampleBean(" This is a sample Message");
	}

}
