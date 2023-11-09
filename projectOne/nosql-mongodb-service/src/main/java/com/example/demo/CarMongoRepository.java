package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CarMongoRepository extends CrudRepository<Car, String>{
	
}
