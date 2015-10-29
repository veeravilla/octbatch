package com.test.util;

import java.util.Comparator;

import com.test.oops.StduentApp;

public class SNameSort implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}

}
