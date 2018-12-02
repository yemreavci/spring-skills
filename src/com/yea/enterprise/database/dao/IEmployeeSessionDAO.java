package com.yea.enterprise.database.dao;

import com.yea.enterprise.database.model.Employee;

public interface IEmployeeSessionDAO {
	
	  public void persistEmployee(Employee employee);
	  
	  public Employee findEmployeeById(String id);
	  
	  public void updateEmployee(Employee employee);
	  
	  public void deleteEmployee(Employee employee);
	  
}