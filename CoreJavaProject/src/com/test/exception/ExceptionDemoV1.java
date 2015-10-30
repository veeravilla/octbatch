package com.test.exception;

import com.test.oops.Employee;

public class ExceptionDemoV1 {

	public static void main(String[] args) {
		System.out.println("Main - Start");
		
		//Step1
		try{
			int result = 5/0;
			System.out.println(" 1. Result " + result);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		
		
		//Step2
		try{
			String name =null;
			System.out.println("2. Upper Case " + name.toUpperCase());
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
		
		
		//Step3
		try{
			int []data={56,78,90};
			System.out.println("3. 4 th Elements " + data[4]);
		}catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}
		
		
		//Step4
		Employee emp  = new Employee(89, "Rama", 5600);
		System.out.println("4. Emp Name " + emp.getEname());
		
		System.out.println("Main - End");

	}

}
