package com.redhat.fuse.sandbox.rs;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.redhat.fuse.sandbox.model.SubscriberRq;

public class SubcriberCompositeClient {
	private static final Logger LOG = LoggerFactory.getLogger(SubcriberCompositeClient.class);
	@Test
	public void callRs(){
		List<String> inquriy = new ArrayList<String>();
		inquriy.add("profile");
		inquriy.add("balance");
		SubscriberRq rq = new SubscriberRq();
		rq.setMsisdn("09777171717");
		rq.setInquiry(inquriy);
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
        WebTarget target = client.target("http://127.0.0.1:8190/cxf/composite/subscriber");
        target.request(MediaType.APPLICATION_JSON).post(Entity.json(rq), SubscriberRq.class);
        assertTrue(true);
	}
}
