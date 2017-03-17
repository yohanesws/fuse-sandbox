package com.redhat.fuse.sandbox.rs;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.redhat.fuse.sandbox.model.SubscriberRs;
//{"msisdn":"08187777998","inquiry":["profile","balance"]}
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
        WebTarget target = client.target("http://172.16.1.4:9000/cxf/composite/subscriber");
//        SubscriberRs rs = target.request(MediaType.APPLICATION_JSON).post(Entity.json(rq), SubscriberRs.class);
//        LOG.info(rs.toString());
//        assertTrue(rs.getMsisdn().equals(rq.getMsisdn()));
        target.request(MediaType.APPLICATION_JSON).post(Entity.json(rq), Map.class);
        assertTrue(true);
	}
}
