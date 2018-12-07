package com.yea.enterprise.database.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IEmployeeEMDAO;
import com.yea.enterprise.database.dao.IQuestionEMDao;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.Employee;
import com.yea.enterprise.database.model.Question;

@Repository("questionDaoImpl")
public class QuestionEMDaoImpl extends GenericBaseJPAImpl<Question>implements IQuestionEMDao{


}
