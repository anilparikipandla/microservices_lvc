package com.example.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}
	
	@Autowired
	private BookRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(DatabaseServiceApplication.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("DB APPLICATION STARTED - RECORDS ARE GETTING CREATED...");
		
		repository.save(new Book("Spark"));
		repository.save(new Book("pySpark"));
		repository.save(new Book("python"));
		repository.save(new Book("Scala"));
		repository.save(new Book("GoLang"));
		repository.save(new Book("JavaScript"));
		repository.save(new Book("Java"));
		
		log.info("RECORD CREATION SUCCESSFUL");		
		
		System.out.println("Find all records");		
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("Find record by id");
		repository.findById(5L).ifPresent(x -> System.out.println(x));
		
		System.out.println("Find records by name");		
		repository.findByName("Spark").forEach(x -> System.out.println(x));
		
		System.out.println("Update record by id");
		repository.findById(153L).ifPresent(x -> {
			System.out.println(x);
			x.setName("This is a newly updated record");
			repository.save(x);
		});
		
//		System.out.println("Delete record by Id");
//		Book bookToDelete = repository.findById(55L).get();
//		System.out.println("Book to delete: "+bookToDelete.getName());
//		repository.delete(bookToDelete);
		
//		System.out.println("Delete record by Name");
//		repository.findByName("Java").forEach(x -> {
//			System.out.println("Deleting record :"+x.getName());
//			repository.delete(x);
//		});
		
//		System.out.println("default Delete by Id");
//		repository.deleteById(106L);
//		
//		System.out.println("default Delete All by Id");
//		repository.deleteAllById(Arrays.asList(104L, 105L, 106L, 107L));
//		
//		System.out.println("default Delete by Name");
//		repository.deleteAll(repository.findByName("Python"));
		
		
		

	}

}
