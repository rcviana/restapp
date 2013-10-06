package com.rcviana.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Robson Viana
 * @version 0.1
 */
@Path("/v1/status/*")
public class Status {

	private static final String VERSION = "0.1";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getStatus() {
		return "<h1>Java Web Service is up ...</h1>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/version")
	public String getVersion() {
		return "<h1>Version : " + VERSION + "</h1>";
	}
}
