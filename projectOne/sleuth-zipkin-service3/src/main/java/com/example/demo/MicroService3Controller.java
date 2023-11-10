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
public class MicroService3Controller {

	public MicroService3Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/microservice3")
	public String method3() {
		LOG.info("Inside Method 3");
		String baseUrl = "http://localhost:8084/microservice4";
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		LOG.info("This response is received by method3: "+response);
				
		return response;
	}

}
