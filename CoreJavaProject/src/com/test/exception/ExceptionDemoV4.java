package com.test.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.test.oops.Employee;

public class ExceptionDemoV4 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		System.out.println("Main - Start");

		// Step1
		int result = 5 / 0; // AE
		System.out.println(" 1. Result " + result);

		// Step2
		String name = null; // NE
		System.out.println("2. Upper Case " + name.toUpperCase());

		// Step3
		int[] data = { 56, 78, 90 };// ArrayInEX
		System.out.println("3. 4 th Elements " + data[4]);

		//try{
			// step4
			FileInputStream fileInputStream = new FileInputStream("data"); //FileNotFoundException
			fileInputStream.read(); //IOException
		//}catch(Exception ex){
			//ex.printStackTrace();
		//}
	
		// Step4
		Employee emp = new Employee(89, "Rama", 5600);
		System.out.println("4. Emp Name " + emp.getEname());

		System.out.println("Main - End");

	}

}
