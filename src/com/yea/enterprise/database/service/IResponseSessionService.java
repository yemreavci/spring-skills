package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.Response;

public interface IResponseSessionService {
	  public void persistResponse(Response response);
	  public Response findResponseById(String id);
	  public void updateResponse(Response response);
	  public void deleteResponse(Response response);
}
