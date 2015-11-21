package com.test.beans;

public class Employee {

	private int eno;
	private String ename;
	private int salary;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary="
				+ salary + "]";
	}

	public Employee(int eno, String ename) {
		System.out.println(" Emp Constructor  ");
		this.eno = eno;
		this.ename = ename;
	}

	public Employee() {
		super();
	}

}
