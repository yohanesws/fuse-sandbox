package com.redhat.fuse.sandbox.model;

public class Profile {
	private String profileNo;
	private String profileGroup;
	private String msisdn;
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
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
}
