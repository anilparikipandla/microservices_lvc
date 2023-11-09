package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cars")
public class Car {
	// this is not a table this represents a record.
	// we are not using constructor here because html is used for construction it is not direct construction for collections.

	public Car() {
		
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String make;
	private String model;
	private String description;
	private Integer year;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	

}
