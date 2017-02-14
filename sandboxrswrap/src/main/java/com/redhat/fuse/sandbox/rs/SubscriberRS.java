package com.redhat.fuse.sandbox.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/subscriber/")
public class SubscriberRS {
	@GET
	@Path("/balance/{msisdn}")
	@Produces(MediaType.APPLICATION_JSON)
	public com.redhat.fuse.sandbox.ws.Balance getSubcriberBalance(
			@PathParam("msisdn") java.lang.String arg0){
				return null;
		
	}
	@GET
	@Path("/profile/{msisdn}")
	@Produces(MediaType.APPLICATION_JSON)
	public com.redhat.fuse.sandbox.ws.Profile getSubscriberProfile(
			@PathParam("msisdn") java.lang.String arg0){
				return null;
		
	}
}
