package com.redhat.fuse.sandbox.model;

import java.util.List;

public class SubscriberRq {
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
