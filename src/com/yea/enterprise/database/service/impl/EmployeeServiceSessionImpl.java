package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IEmployeeSessionDAO;
import com.yea.enterprise.database.model.Employee;
import com.yea.enterprise.database.service.IEmployeeSessionService;

@Service("employeeService")
public class EmployeeServiceSessionImpl implements IEmployeeSessionService{

	@Autowired
	IEmployeeSessionDAO employeeSessionDAO;
	
	@Transactional
	public void persistEmployee(Employee employee) {
		employeeSessionDAO.persistEmployee(employee);
		
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		employeeSessionDAO.updateEmployee(employee);
		
	}
	@Transactional
	public Employee findEmployeeById(String id) {
		return employeeSessionDAO.findEmployeeById(id);
	}

	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeSessionDAO.deleteEmployee(employee);
		
	}

}