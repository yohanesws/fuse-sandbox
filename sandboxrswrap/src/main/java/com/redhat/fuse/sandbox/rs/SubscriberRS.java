package com.redhat.fuse.sandbox.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/subscriber/")
@Consumes({"application/xml","application/json"})
@Produces({"application/xml","application/json"})
public class SubscriberRS {
	@GET
	@Path("/balance/{msisdn}")
	public com.redhat.fuse.sandbox.ws.Balance getSubcriberBalance(
			@PathParam("msisdn") java.lang.String arg0){
				return null;
		
	}
	@GET
	@Path("/profile/{msisdn}")
	public com.redhat.fuse.sandbox.ws.Profile getSubscriberProfile(
			@PathParam("msisdn") java.lang.String arg0){
				return null;
		
	}
}
