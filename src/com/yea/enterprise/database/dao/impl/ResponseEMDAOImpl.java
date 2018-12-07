package com.yea.enterprise.database.dao.impl;

import org.springframework.stereotype.Repository;
import com.yea.enterprise.database.dao.IResponseEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.Response;

@Repository("responseOrderDaoImpl")
public class ResponseEMDAOImpl extends GenericBaseJPAImpl<Response>implements IResponseEMDAO {
	
}
