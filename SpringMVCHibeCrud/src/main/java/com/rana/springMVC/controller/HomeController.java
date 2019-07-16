package com.rana.springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rana.springMVC.dto.EmployeeDto;
import com.rana.springMVC.model.Employee;
import com.rana.springMVC.service.EmployeeService;

@Controller
public class HomeController {

	
	@Autowired
	EmployeeService  employeeService;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
	 
    @RequestMapping(value= "/saveEmployee", method = RequestMethod.POST)    
    public  ModelAndView saveEmp(EmployeeDto employeDto, HttpServletRequest req ) throws Exception 
    {
    	System.out.println("hello");
     	ModelAndView model = new ModelAndView();
        employeeService.saveEmployee(employeDto);
     	model.setViewName("success");
     	
     	return model;
    }
    
}
