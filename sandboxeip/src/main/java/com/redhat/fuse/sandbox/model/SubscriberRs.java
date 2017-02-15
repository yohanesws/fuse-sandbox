package com.redhat.fuse.sandbox.model;

import java.math.BigDecimal;

public class SubscriberRs {
	private BigDecimal balance;
	private String msisdn;
	private String profileNo;
	private String profileGroup;
	public String getProfileGroup() {
		return profileGroup;
	}
	public void setProfileGroup(String profileGroup) {
		this.profileGroup = profileGroup;
	}
	public String getProfileNo() {
		return profileNo;
	}
	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
}
