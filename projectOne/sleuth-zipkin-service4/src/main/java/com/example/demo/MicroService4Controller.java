package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import brave.sampler.Sampler;

@RestController
public class MicroService4Controller {

	public MicroService4Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/microservice4")
	public String method4() {
		LOG.info("Inside Method 4");
		return "Zipkin and Sleuth demo for Oracle India";
	}

}
