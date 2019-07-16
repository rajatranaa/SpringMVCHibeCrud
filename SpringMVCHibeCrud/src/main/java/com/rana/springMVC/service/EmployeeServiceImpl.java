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

	public Employee saveEmployee(EmployeeDto employeeDto) throws Exception {
		
		Employee employee = new Employee();
		
		employee.setAge(employeeDto.getAge());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setSalary((employeeDto.getSalary()));
		employee.setEducation(employeeDto.getEducation());
		
		return employeeDao.saveEmployee(employee);
	}
	
		
	}

