package nl.dennisg.wink.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/site")
public class SiteResource {
	
	@GET
	 public Response index() {
		return Response.ok("SITE").build();
	}
}
