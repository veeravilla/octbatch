package com.test.oops;

public final class Student {

	private int sno;
	private String sname;
	private String course;

	public int getSno() {
		return sno;
	}

	
	public String getSname() {
		return sname;
	}

	

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course="
				+ course + "]";
	}


	public String getCourse() {
		return course;
	}

	
	public Student(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}

}
