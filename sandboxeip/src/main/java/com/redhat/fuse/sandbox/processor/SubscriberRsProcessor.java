package com.redhat.fuse.sandbox.processor;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

public class SubscriberRsProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.setPattern(ExchangePattern.InOut);
		Message inMessage = exchange.getIn();
		inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
		String operation = inMessage.getHeader("Operation",String.class);
		String msisdn = inMessage.getBody(String.class);
		MessageContentsList req = new MessageContentsList();
		req.add(operation);
		req.add(msisdn);
		inMessage.setBody(req);
	}

}
