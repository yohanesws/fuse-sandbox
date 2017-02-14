package com.redhat.fuse.sandbox.ws;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SubcriberBalanceWSClient {
	private static final Logger LOG = LoggerFactory.getLogger(SubcriberBalanceWSClient.class);
	
	@Test
    public void sendRequest() throws Exception {
		String res;
        /*
         * Set up the URL connection to the web service address
         */
        URLConnection connection = new URL("http://localhost:9010/ws/subscriber").openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        
        /*
         * We have prepared a SOAP request in an XML file, so we send the contents of that file to our web service...
         */
        OutputStream os = connection.getOutputStream();
        InputStream fis = SubcriberBalanceWSClient.class.getResourceAsStream("/payloadBalance.xml");
        copyInputStream(fis, os);
        
        /*
         * ... and afterwards, we just read the SOAP response message that is sent back by the server.
         */
        InputStream is = connection.getInputStream();
        System.out.println("the response is ====> ");
        res = getStringFromInputStream(is);
        System.out.println(res);
        Assert.assertTrue(res.contains("0815"));
	}
	/**
     * Helper method to copy bytes from an InputStream to an OutputStream.
     */
    private void copyInputStream(InputStream in, OutputStream out) throws Exception {
    	int c = 0;
    	try {
    		while ((c = in.read()) != -1) {
    			out.write(c);
    		}
    	} finally {
    		in.close();
    	}
    }
    
    /**
     * Helper method to read bytes from an InputStream and return them as a String.
     */
    private String getStringFromInputStream(InputStream in) throws Exception {
    	ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	copyInputStream(in, bos);
    	bos.close();
    	return bos.toString();
    }
}
