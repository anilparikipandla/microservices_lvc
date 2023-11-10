package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class MyController {

	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	MessageSource messageSource;
	
	@GetMapping("/")
	public String index(Locale locale) {
		return messageSource.getMessage("error.notfound", null, locale);
	}

	// request http://localhost:8080/
	// Headers - Accept-Language=es-ES
	// or Headers - Accept-Language=ab-AB
}
