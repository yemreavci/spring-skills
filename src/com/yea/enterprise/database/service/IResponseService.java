package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.Response;

public interface IResponseService {
	  public void persistResponse(Response response);
	  public Response findResponseById(Long id);
	  public void updateResponse(Response response);
	  public void deleteResponse(Response response);
}
