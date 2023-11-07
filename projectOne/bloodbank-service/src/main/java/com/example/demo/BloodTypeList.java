package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

public class BloodTypeList {

	public BloodTypeList() {
		// TODO Auto-generated constructor stub
	}

	
	private List<BloodType> bloodTypes;
	
	public List<BloodType> getBloodTypes(){
		return bloodTypes;
	}

	public void setBloodTypes(List<BloodType> bloodTypes) {
		this.bloodTypes = bloodTypes;		
	}

	
}
