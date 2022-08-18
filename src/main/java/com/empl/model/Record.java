package com.empl.model;

public class Record {

	private Long cId;
	private String email;
	private String companyName;
	private Long eid;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public Record(Long cId, String email, String companyName, Long eid) {
		super();
		this.cId = cId;
		this.email = email;
		this.companyName = companyName;
		this.eid = eid;
	}
	public Record() {
		super();
	}
	
	
}
