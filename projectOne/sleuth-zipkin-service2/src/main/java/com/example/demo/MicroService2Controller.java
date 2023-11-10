package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@RestController
public class MicroService2Controller {

	public MicroService2Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/microservice2")
	public String method2() {
		LOG.info("Inside Method 2");
		String baseUrl = "http://localhost:8083/microservice3";
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		LOG.info("This response is received by method2: "+response);
				
		return response;
	}

}
