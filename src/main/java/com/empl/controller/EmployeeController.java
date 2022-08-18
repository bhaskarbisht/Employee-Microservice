package com.empl.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empl.model.Employee;
import com.empl.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid") Long eid) {
		Employee employee=employeeservice.getEmployee(eid);
		
		List records= this.restTemplate.getForObject("http://localhost:8090/record/emp/"+eid, List.class);
		employee.setRecords(records);
		return employee;
	}
}
