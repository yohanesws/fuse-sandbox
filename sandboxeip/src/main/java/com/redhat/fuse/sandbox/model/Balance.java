package com.redhat.fuse.sandbox.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="balance")
public class Balance implements Serializable{
	@Override
	public String toString() {
		return "Balance [balance=" + balance + ", msisdn=" + msisdn + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7468495785781062150L;
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
