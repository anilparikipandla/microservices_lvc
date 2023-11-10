package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.Calendar;

@SpringBootApplication
@EnableScheduling
public class SchedulingServiceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SchedulingServiceApplication.class, args);
		SpringApplication app = new SpringApplication(SchedulingServiceApplication.class);
		app.run(args);
	}
	
	@Scheduled(initialDelay=1000, fixedRate=10000)
	public void run() {
		System.out.println("Current time is: "+ Calendar.getInstance().getTime());
	}

}
