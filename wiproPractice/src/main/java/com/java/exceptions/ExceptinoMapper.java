package com.java.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.java.model.ErrorMessage;

@Provider
public class ExceptinoMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		// TODO Auto-generated method stub
		ErrorMessage er = new ErrorMessage("ex.getMessage()","404","https:ggogle.com");
		return Response.status(Status.NOT_FOUND).entity(er).build();
	}

}
