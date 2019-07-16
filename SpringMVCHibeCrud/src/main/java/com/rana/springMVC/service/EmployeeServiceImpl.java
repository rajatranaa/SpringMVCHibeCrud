package com.rana.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rana.springMVC.dao.EmployeeDao;
import com.rana.springMVC.dto.EmployeeDto;
import com.rana.springMVC.model.Employee;



@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) throws Exception {
		
		Employee emp = new Employee();
		
		emp.setAge(10);
		emp.setEmployeeId(employee.getEmployeeId());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setSalary(employee.getSalary());
		emp.setEducation(employee.getEducation());
		
		return employeeDao.saveEmployee(emp);
	}
	
		
	}

