package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JerseyBasedServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
//		SpringApplication.run(JerseyBasedServiceApplication.class, args);
		
		new JerseyBasedServiceApplication().configure(new SpringApplicationBuilder(JerseyBasedServiceApplication.class)).run(args);
	}

}
