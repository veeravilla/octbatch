package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.test.oops.Employee;

public class ListExample2 {

	public static void main(String[] args) {
		List<Employee> empList =  new LinkedList<Employee>();//new Vector();//new ArrayList<Employee>();
		empList.add(new Employee(888, "Jhon", 7889));
		empList.add(new Employee(7878, "Steve", 2345));
		empList.add(new Employee(45, "Tim", 134));
		empList.add(new Employee(13, "Raj", 5466));
		
		System.out.println("Before Sort " + empList);
		Collections.sort(empList,new SalarySort());
		
	//	Collections.synchronizedList(empList);
		
		System.out.println("After Sort " + empList);
		
		
		
	}

}
