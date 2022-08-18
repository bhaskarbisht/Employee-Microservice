package com.empl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empl.model.Employee;
import com.empl.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeservice;
	
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid") Long eid) {
		Employee employee=employeeservice.getEmployee(eid);
		return employee;
	}
}
