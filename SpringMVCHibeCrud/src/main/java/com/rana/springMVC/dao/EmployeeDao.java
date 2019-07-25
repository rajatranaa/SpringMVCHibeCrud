package com.rana.springMVC.dao;

import java.util.List;

import com.rana.springMVC.model.Employee;

public interface EmployeeDao {
	
	public Employee saveEmployee(Employee employee) throws Exception;

	public Employee getEmployeeByEmailId(String email);

}
