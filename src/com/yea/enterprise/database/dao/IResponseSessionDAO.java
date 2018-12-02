package com.yea.enterprise.database.dao;


import com.yea.enterprise.database.model.Response;

public interface IResponseSessionDAO {
	  public void persistResponse(Response response);
	  public Response findResponseById(String id);
	  public void updateResponse(Response response);
	  public void deleteResponse(Response response);

}
