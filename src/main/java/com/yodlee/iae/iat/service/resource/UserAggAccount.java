package com.yodlee.iae.iat.service.resource;

import java.util.Date;

public class UserAggAccount {

	private Integer memsiteaccid;
	
	private String sitename;
	
	private String agent;
	
	private Integer cacheitemid;
	
	private Integer suminfoid;
	
	private String errorcode;
	
	private Integer siteid;
	
	private Date lastupdateattempt;
	
	private Integer numSuccRefresh;
	
	private Date lastSuccRefresh;
	
	private Integer memitemid;
	
	private Boolean isdisable;
	
	private Date nextupdate;
	
	private Boolean inactiveind;
	
	private Integer memaccid;
	
	private Integer memid;
	
	private Date memidcreatedon;

	public Integer getMemsiteaccid() {
		return memsiteaccid;
	}

	public void setMemsiteaccid(Integer memsiteaccid) {
		this.memsiteaccid = memsiteaccid;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Integer getCacheitemid() {
		return cacheitemid;
	}

	public void setCacheitemid(Integer cacheitemid) {
		this.cacheitemid = cacheitemid;
	}

	public Integer getSuminfoid() {
		return suminfoid;
	}

	public void setSuminfoid(Integer suminfoid) {
		this.suminfoid = suminfoid;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public Date getLastupdateattempt() {
		return lastupdateattempt;
	}

	public void setLastupdateattempt(Date lastupdateattempt) {
		this.lastupdateattempt = lastupdateattempt;
	}

	public Integer getNumSuccRefresh() {
		return numSuccRefresh;
	}

	public void setNumSuccRefresh(Integer numSuccRefresh) {
		this.numSuccRefresh = numSuccRefresh;
	}

	public Date getLastSuccRefresh() {
		return lastSuccRefresh;
	}

	public void setLastSuccRefresh(Date lastSuccRefresh) {
		this.lastSuccRefresh = lastSuccRefresh;
	}

	public Integer getMemitemid() {
		return memitemid;
	}

	public void setMemitemid(Integer memitemid) {
		this.memitemid = memitemid;
	}

	public Boolean getIsdisable() {
		return isdisable;
	}

	public void setIsdisable(Boolean isdisable) {
		this.isdisable = isdisable;
	}

	public Date getNextupdate() {
		return nextupdate;
	}

	public void setNextupdate(Date nextupdate) {
		this.nextupdate = nextupdate;
	}

	public Boolean getInactiveind() {
		return inactiveind;
	}

	public void setInactiveind(Boolean inactiveind) {
		this.inactiveind = inactiveind;
	}

	public Integer getMemaccid() {
		return memaccid;
	}

	public void setMemaccid(Integer memaccid) {
		this.memaccid = memaccid;
	}

	public Integer getMemid() {
		return memid;
	}

	public void setMemid(Integer memid) {
		this.memid = memid;
	}

	public Date getMemidcreatedon() {
		return memidcreatedon;
	}

	public void setMemidcreatedon(Date memidcreatedon) {
		this.memidcreatedon = memidcreatedon;
	}

	public UserAggAccount(Integer memsiteaccid, String sitename, String agent, Integer cacheitemid, Integer suminfoid,
			String errorcode, Integer siteid, Date lastupdateattempt, Integer numSuccRefresh, Date lastSuccRefresh,
			Integer memitemid, Boolean isdisable, Date nextupdate, Boolean inactiveind, Integer memaccid, Integer memid,
			Date memidcreatedon) {
		super();
		this.memsiteaccid = memsiteaccid;
		this.sitename = sitename;
		this.agent = agent;
		this.cacheitemid = cacheitemid;
		this.suminfoid = suminfoid;
		this.errorcode = errorcode;
		this.siteid = siteid;
		this.lastupdateattempt = lastupdateattempt;
		this.numSuccRefresh = numSuccRefresh;
		this.lastSuccRefresh = lastSuccRefresh;
		this.memitemid = memitemid;
		this.isdisable = isdisable;
		this.nextupdate = nextupdate;
		this.inactiveind = inactiveind;
		this.memaccid = memaccid;
		this.memid = memid;
		this.memidcreatedon = memidcreatedon;
	}

	public UserAggAccount() {
		super();
	}
	
	
}
