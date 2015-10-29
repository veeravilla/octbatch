package com.test.util;

public class Student implements Comparable<Student> {

	private int sno;
	private String course;
	private String name;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	/*@Override
	public int hashCode() {
		int hash =  sno + this.name.hashCode();
		System.out.println("Student # Hash  " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Student # Equals ");
		if(obj instanceof Student){
			Student stu = (Student) obj;
			if(sno == stu.getSno() && name.equals(stu.getName())){
				System.out.println(" Equal ");
				return true;
			}
		}
		System.out.println(" Not Equal ");
		return false;
	}*/

	public String getCourse() {
		return course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int sno, String course, String name) {
		super();
		this.sno = sno;
		this.course = course;
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", course=" + course + ", name=" + name
				+ "]";
	}

	@Override
	public int compareTo(Student student) {
		if(this.sno == student.getSno()){
			return 0;
		}else if(sno < student.getSno()){
			return -1;
		}else
			return 1;
	}

}
