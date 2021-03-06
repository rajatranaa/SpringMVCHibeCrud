package com.rana.springMVC.service;

import java.util.ArrayList;
import java.util.List;

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
		
		employee.setName(employeeDto.getName());
		employee.setPhoneNo(employeeDto.getPhone());
		employee.setEmail(employeeDto.getEmail());
		employee.setPass(employeeDto.getPassword());
	//	employee.setSalary((employeeDto.getSalary()));
	//	employee.setEducation(employeeDto.getEducation());
		
		return employeeDao.saveEmployee(employee);
	}


	public EmployeeDto getEmployeeByEmailId(EmployeeDto employeDto) throws Exception {
		
		Employee emp = new Employee();
		try {
			 emp = 	employeeDao.getEmployeeByEmailId(employeDto.getEmail());
			   if(emp != null  && emp.getPass() != null) {
				 if(employeDto.getPassword().equalsIgnoreCase(emp.getPass())) {
					System.out.println("Login succesfull"+emp.getName()+"   "+emp.getEmail());
					employeDto.setFirstName(emp.getName());
					employeDto.setPhone(emp.getPhoneNo());
					employeDto.setStatus(1);
					
				}
				 else {
					 System.out.println("Login failed");
					 employeDto.setStatus(0);
				 }
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return employeDto;
	}
	
		
	}

