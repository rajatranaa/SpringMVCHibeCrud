package com.rana.springMVC.service;

import com.rana.springMVC.dto.EmployeeDto;
import com.rana.springMVC.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(EmployeeDto employeDto) throws Exception;
	
	public Employee getEmployeeByEmailId(EmployeeDto employeDto) throws Exception;

}
