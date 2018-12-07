package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IResponseEMDAO;
import com.yea.enterprise.database.model.Response;
import com.yea.enterprise.database.service.IResponseService;

@Service("responseServiceImpl")
public class ResponseServiceSessionImpl implements IResponseService{
	@Autowired
	IResponseEMDAO responseEmDAO;
	
	@Transactional
	public void persistResponse(Response response) {
		responseEmDAO.save(response);
		
	}

	@Transactional
	public void updateResponse(Response response) {
		responseEmDAO.save(response);
		
	}
	@Transactional
	public Response findResponseById(Long id) {
		return responseEmDAO.findOne(id);
	}

	@Transactional
	public void deleteResponse(Response response) {
		
	}

}
