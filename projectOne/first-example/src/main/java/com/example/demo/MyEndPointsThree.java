package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPointsThree {

	public MyEndPointsThree() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	ExampleProperties props;
	
	@RequestMapping("/greetothers")
	public String greet(@RequestParam String details) {
		return props.getGreeting()+", "+details+"!";
	}

}
