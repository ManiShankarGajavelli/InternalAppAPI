package com.cnsi.interanalAppAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appdetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long appid;
	private String appname;
	
	private String appurl;
	public Long getAppid() {
		return appid;
	}
	public void setAppid(Long appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getAppurl() {
		return appurl;
	}
	public void setAppurl(String appurl) {
		this.appurl = appurl;
	}
	public Appdetails(String appname, String appurl) {
		super();
		this.appname = appname;
		this.appurl = appurl;
	}
	
	public Appdetails() {
		super();
	}
	
}
