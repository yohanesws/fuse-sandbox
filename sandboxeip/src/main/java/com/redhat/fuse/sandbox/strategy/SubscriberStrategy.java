package com.redhat.fuse.sandbox.strategy;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.fuse.sandbox.model.Balance;
import com.redhat.fuse.sandbox.model.Profile;
import com.redhat.fuse.sandbox.model.SubscriberRs;

public class SubscriberStrategy implements AggregationStrategy {

	private static final Logger LOG = LoggerFactory.getLogger(SubscriberStrategy.class);

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// put order together in old exchange by adding the order from new exchange
		 
        if (oldExchange == null) {
            // the first time we aggregate we only have the new exchange,
            // so we just return it
        	newExchange.getOut().setBody(composeResponseObject(newExchange.getIn().getBody(), new SubscriberRs()));
        	LOG.info("new exchange :"+newExchange.getOut().getBody());
            return newExchange;
        }
        SubscriberRs response = (SubscriberRs) oldExchange.getOut().getBody();
        response = composeResponseObject(newExchange.getIn().getBody(), response);
        oldExchange.getOut().setBody(response);
        LOG.info("old exchange :"+oldExchange.getOut().getBody());
		return oldExchange;
	}
	
	private SubscriberRs composeResponseObject (Object body, SubscriberRs response){
		if(body instanceof Profile){
			response.setProfileGroup(((Profile)body).getProfileGroup());
			response.setProfileNo(((Profile)body).getProfileNo());
		}else if (body instanceof Balance){
			response.setBalance(((Balance)body).getBalance());
		}
		return response;
	}

}