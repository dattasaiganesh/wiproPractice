package com.java.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import ch.qos.logback.core.status.Status;

public class GenericExpression implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		// TODO Auto-generated method stub
		return Response.status(Status.ERROR).entity(ex).build();
	}

}
