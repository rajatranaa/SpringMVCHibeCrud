package com.rana.springMVC.service;

import com.rana.springMVC.dto.EmployeeDto;
import com.rana.springMVC.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee) throws Exception;

}
