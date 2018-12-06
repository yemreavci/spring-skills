package com.yea.enterprise.database.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IEmployeeEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.Employee;

@Repository
@Transactional
public class EmployeeServiceEMImpl extends GenericBaseJPAImpl<Employee>implements IEmployeeEMDAO{

}