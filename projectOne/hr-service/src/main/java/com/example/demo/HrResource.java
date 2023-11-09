package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrResource {
	// We Have changed the HR Service and Pathology service from Eureka to standalone. and used it for routing the API Gateway Pattern.

	public HrResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Employee> employees = Arrays.asList(
			new Employee("E1", "Ram", "Kumar", "MedTech"),
			new Employee("E2", "Raj", "Kumar", "Surgery"),
			new Employee("E3", "Rajes", "Kumar", "Dentistry"));
	
	@GetMapping("/employees")
	public EmployeeList getEmployees() {
		EmployeeList employeeList = new EmployeeList();
		employeeList.setEmployees(employees);
		return employeeList;
	}
	
	@GetMapping("employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		Employee e = employees.stream()
				.filter(employee -> id.equals(employee.getId()))
				.findAny()
				.orElse(null);
		return e;
	}

}
