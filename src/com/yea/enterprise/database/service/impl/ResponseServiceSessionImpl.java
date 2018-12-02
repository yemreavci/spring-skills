package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IResponseSessionDAO;
import com.yea.enterprise.database.model.Response;
import com.yea.enterprise.database.service.IResponseSessionService;

@Service("responseServiceImpl")
public class ResponseServiceSessionImpl implements IResponseSessionService{
	@Autowired
	IResponseSessionDAO responseSessionDAO;
	
	@Transactional
	public void persistResponse(Response response) {
		responseSessionDAO.persistResponse(response);
		
	}

	@Transactional
	public void updateResponse(Response response) {
		responseSessionDAO.updateResponse(response);
		
	}
	@Transactional
	public Response findResponseById(String id) {
		return responseSessionDAO.findResponseById(id);
	}

	@Transactional
	public void deleteResponse(Response response) {
		responseSessionDAO.deleteResponse(response);
		
	}

}
