package com.redhat.fuse.sandbox.ws;

import javax.jws.WebService;

import com.redhat.fuse.sandbox.model.Balance;
import com.redhat.fuse.sandbox.model.Profile;

@WebService
public interface SubscriberWS {
	Profile getSubscriberProfile(String msisdn);
	Balance getSubcriberBalance(String msisdn);

}
