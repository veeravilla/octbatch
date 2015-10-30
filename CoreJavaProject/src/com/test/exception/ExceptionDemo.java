package com.test.exception;

import com.test.oops.Employee;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Main - Start");
		
		//Step1
		int result = 5/0;
		System.out.println(" 1. Result " + result);
		
		//Step2
		String name =null;
		System.out.println("2. Upper Case " + name.toUpperCase());
		
		//Step3
		int []data={56,78,90,89,90};
		System.out.println("3. 4 th Elements " + data[4]);
		
		//Step4
		Employee emp  = new Employee(89, "Rama", 5600);
		System.out.println("4. Emp Name " + emp.getEname());
		
		System.out.println("Main - End");

	}

}
