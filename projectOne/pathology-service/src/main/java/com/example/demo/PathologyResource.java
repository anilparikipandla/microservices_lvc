package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
// We Have changed the HR Service and Pathology service from Eureka to standalone. and used it for routing the API Gateway Pattern.
	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("D1","Astama", "Warm water bath"),
			new Disease("D2","Headache", "Hot water vapour"),
			new Disease("D3","Corona", "Wash ahnds and stay safe"));
	
	@RequestMapping("/diseases")
	public DiseaseList diseases() {
		DiseaseList diseaseList = new DiseaseList();
		diseaseList.setDiseases(diseases);
		return diseaseList;
	}
	
	@RequestMapping("diseases/{id}")
	public Disease getDiesaseById(@PathVariable("id") String id) {
		Disease d = diseases.stream()
				.filter(disease -> id.equals(disease.getId()))
				.findAny()
				.orElse(null);
		return d;
	}
			

}
