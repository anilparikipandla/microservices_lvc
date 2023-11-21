package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
//	vishwanath b Ramachandra Rao
//	6363063645
//	vishymails@gmail.com

	public HomeResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public String home() {
		return ("<h1> Welcome to Security Demo</h1>");
	}
	
	
	@GetMapping("/user")
	public String user() {
		return ("<h1> Welcome to Security Demo - User!</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1> Welcome to Security Demo - Admin!</h1>");
	}
	

}
