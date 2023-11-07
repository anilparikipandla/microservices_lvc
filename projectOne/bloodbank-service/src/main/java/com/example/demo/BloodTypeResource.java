package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bloodstore")
public class BloodTypeResource {

	public BloodTypeResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<BloodType> bloodTypes = Arrays.asList(
			new BloodType("O+", true),
			new BloodType("O-", true),
			new BloodType("AB-", false));
	
	@GetMapping("/bloodtypes")
	public BloodTypeList getBloodTypes() {
		BloodTypeList bloodGroupOrder = new BloodTypeList();
		bloodGroupOrder.setBloodTypes(bloodTypes);
		return bloodGroupOrder;
	}

}
