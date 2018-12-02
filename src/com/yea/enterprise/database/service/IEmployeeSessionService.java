package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.Employee;

public interface IEmployeeSessionService {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}