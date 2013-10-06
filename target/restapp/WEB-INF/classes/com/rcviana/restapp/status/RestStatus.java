package com.rcviana.restapp.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path('/v1/status/*')
public class RestStatus {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	
}
