package com.test.beans;

public class Student {
	private int sno;
	private String sname;
	private Course course;
	private Address address;

	public Student(int sno, String sname, Course course, Address address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.address = address;
	}

	public Student() {
		super();
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", address=" + address + "]";
	};

}
