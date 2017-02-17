package com.redhat.fuse.sandbox.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.redhat.fuse.sandbox.model.SubscriberRq;
import com.redhat.fuse.sandbox.model.SubscriberRs;
@Path("/")
public interface SubscriberComposite {

	@POST
	@Path("/subscriber")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SubscriberRs getSubscriber(SubscriberRq request);
}
