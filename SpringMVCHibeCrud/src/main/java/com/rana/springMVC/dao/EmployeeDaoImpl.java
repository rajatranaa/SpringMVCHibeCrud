package com.rana.springMVC.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.rana.springMVC.model.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	@Transactional(rollbackFor = { Exception.class })
	public Employee saveEmployee(Employee employee)  throws Exception{
		
		Session session = this.sessionFactory.getCurrentSession();
		try {
			if (employee != null) {
				session.saveOrUpdate(employee);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return employee;
	}
}
