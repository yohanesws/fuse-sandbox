package com.redhat.fuse.sandbox.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="profile")
public class Profile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7925664707701075734L;
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
