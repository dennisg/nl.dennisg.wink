package nl.dennisg.wink.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class DefaultResource {
	
	@GET
	 public Response index() {
		return Response.ok("OK").build();
	}
	
	
	@GET
	@Path("data")
	 public Response data() {
		return Response.ok("DATA").build();
	}

}
