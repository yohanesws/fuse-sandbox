package com.redhat.fuse.sandbox.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/subscriber/")
public interface SubscriberRS {
	@GET
	@Path("/balance/{msisdn}")
	@Produces(MediaType.APPLICATION_JSON)
	public com.redhat.fuse.sandbox.model.Balance balance(
			@PathParam("msisdn") java.lang.String arg0);
	@GET
	@Path("/profile/{msisdn}")
	@Produces(MediaType.APPLICATION_JSON)
	public com.redhat.fuse.sandbox.model.Profile profile(
			@PathParam("msisdn") java.lang.String arg0);

}
