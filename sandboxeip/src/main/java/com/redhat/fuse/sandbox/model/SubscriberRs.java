package com.redhat.fuse.sandbox.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SubscriberRs implements Serializable{
	@Override
	public String toString() {
		return "SubscriberRs [balance=" + balance + ", msisdn=" + msisdn + ", profileNo=" + profileNo
				+ ", profileGroup=" + profileGroup + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -4117378607480062413L;
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
