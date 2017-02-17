package com.redhat.fuse.sandbox.processor;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriberRsHttpAPiProcessor implements Processor {
	private static final Logger LOG = LoggerFactory.getLogger(SubscriberRsHttpAPiProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.setPattern(ExchangePattern.InOut);
		Message inMessage = exchange.getIn();
		String operation = inMessage.getHeader("Operation",String.class);
		LOG.info("get header operation"+operation);
		String msisdn = inMessage.getBody(String.class);
		inMessage.setHeader(Exchange.HTTP_METHOD, "GET");
		inMessage.setHeader(Exchange.HTTP_PATH, "/subscriber/"+operation+"/"+msisdn);
		inMessage.setHeader("key", "value");
		inMessage.setBody(null);
	}

}
