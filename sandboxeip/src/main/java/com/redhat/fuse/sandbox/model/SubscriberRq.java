package com.redhat.fuse.sandbox.model;

import java.io.Serializable;
import java.util.List;

public class SubscriberRq implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 942527514800512057L;
	private String msisdn;
	private List<String> inquiry;
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public List<String> getInquiry() {
		return inquiry;
	}
	public void setInquiry(List<String> inquiry) {
		this.inquiry = inquiry;
	}
}
