package com.test.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<Student> stuSet = new TreeSet<Student>(new SNameSort());//new TreeSet<Student>();//new HashSet<Student>();
		stuSet.add(new Student(999, "MCA", "Jhon"));
		stuSet.add(new Student(999, "MCA", "Jhon"));
		stuSet.add(new Student(999, "MCA", "Jhon"));
		stuSet.add(new Student(999, "MCA", "Jhon"));
		stuSet.add(new Student(999, "MCA", "Jhon"));
		stuSet.add(new Student(456, "MS", "Tim"));
		System.out.println("Size " + stuSet.size());
		System.out.println(stuSet);
		

	}

}
