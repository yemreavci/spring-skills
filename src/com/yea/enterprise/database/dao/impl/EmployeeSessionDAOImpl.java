package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IEmployeeSessionDAO;
import com.yea.enterprise.database.model.Employee;

@Repository("employeeDAO")
public class EmployeeSessionDAOImpl implements IEmployeeSessionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	public Employee findEmployeeById(String id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);

	}
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

}