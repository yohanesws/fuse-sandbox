package com.redhat.fuse.sandbox.ws;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.fuse.sandbox.model.Balance;
import com.redhat.fuse.sandbox.model.Profile;
@WebService(endpointInterface = "com.redhat.fuse.demo.ws.SubscriberWS")
public class SubscriberWSImpl implements SubscriberWS {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SubscriberWSImpl.class);

	@Override
	@WebResult(name = "Profile")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public Profile getSubscriberProfile(String msisdn) {

		LOGGER.info("getSubscriberProfile", msisdn);
		
		Profile profile = new Profile();
		profile.setMsisdn(msisdn);
		profile.setProfileGroup("PRE");
		profile.setProfileNo("00001");
		return profile;
	}

	@Override
	@WebResult(name = "Balance")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public Balance getSubcriberBalance(String msisdn) {
		
		LOGGER.info("getSubcriberBalance", msisdn);
		
		Balance balance = new Balance();
		balance.setBalance(new BigDecimal("150000"));
		balance.setMsisdn(msisdn);
		return balance;
	}

}
