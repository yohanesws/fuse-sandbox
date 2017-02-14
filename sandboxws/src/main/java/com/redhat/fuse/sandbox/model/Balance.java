package com.redhat.fuse.sandbox.model;

import java.math.BigDecimal;

public class Balance {
	private BigDecimal balance;
	private String msisdn;
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
