package com.redhat.fuse.sandbox;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.helpers.IOUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


public class SubscriberRSClient {

	private static final Logger LOG = LoggerFactory.getLogger(SubscriberRSClient.class);
	
	@Test
    public void sendBalanceRequest() throws Exception {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
        WebTarget target = client.target("http://172.16.1.4:9000/cxf/rs/subscriber/balance/0815888888");

        Response a = target.request(MediaType.APPLICATION_JSON).get();
        a.bufferEntity();

        String payLoadStr = null;
        try {
            payLoadStr = IOUtils.toString(a.readEntity(InputStream.class));
        } catch (final IOException e1) {
            LOG.error(e1.getMessage());
        }

        LOG.info(payLoadStr);
        
        assertNotNull("There is a response", payLoadStr);
        assertTrue(payLoadStr.contains("0815888888"));
	}
	
	@Test
    public void sendProfileRequest() throws Exception {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
        WebTarget target = client.target("http://172.16.1.4:9000/cxf/rs/subscriber/profile/0815888888");

        Response a = target.request(MediaType.APPLICATION_JSON).get();
        a.bufferEntity();

        String payLoadStr = null;
        try {
            payLoadStr = IOUtils.toString(a.readEntity(InputStream.class));
        } catch (final IOException e1) {
            LOG.error(e1.getMessage());
        }

        LOG.info(payLoadStr);
        
        assertNotNull("There is a response", payLoadStr);
        assertTrue(payLoadStr.contains("0815888888"));
	}


}
