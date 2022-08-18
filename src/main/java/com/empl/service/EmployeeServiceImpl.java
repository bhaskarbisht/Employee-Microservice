package com.empl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empl.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	List<Employee> list=List.of(
			new Employee(112L,"bhaskar bisht","78787777877"),
			new Employee(113L,"peter parker","78787777877"),
			new Employee(114L,"salman khan","78787777877"),
			new Employee(115L,"sharuk khan ","78787777877"),
			new Employee(116L,"tony stark ","78787777877"),
			new Employee(117L,"scarlet johanson","78787777877")
			);

	@Override
	public Employee getEmployee(Long id) {
		return list.stream().filter(employee->employee.getEid().equals(id)).findAny().orElse(null);
	}

}
