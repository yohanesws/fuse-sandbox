package com.redhat.fuse.sandbox.processor;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubcriberRsApiPorcessor  implements Processor  {
	private static final Logger LOG = LoggerFactory.getLogger(SubcriberRsApiPorcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.setPattern(ExchangePattern.InOut);
		Message inMessage = exchange.getIn();
		inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
		String operation = inMessage.getHeader("Operation",String.class);
		LOG.info("get header operation"+operation);
		inMessage.setHeader(CxfConstants.OPERATION_NAME, operation);
		String msisdn = inMessage.getBody(String.class);
		inMessage.setHeader("key", "value");
		// setup the accept content type
        inMessage.setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json");
		inMessage.setBody(msisdn);
		
	}

}
