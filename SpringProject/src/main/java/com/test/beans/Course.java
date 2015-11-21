package com.test.beans;

public class Course {
	
	private String cid;
	private String cName;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + "]";
	}
	

}
