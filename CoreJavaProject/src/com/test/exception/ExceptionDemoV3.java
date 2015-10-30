package com.test.exception;

import java.io.FileInputStream;

import com.test.oops.Employee;

public class ExceptionDemoV3 {

	public static void main(String[] args) {
		System.out.println("Main - Start");
		
		
		try{ //50 - 3EXp - 47
			//Step1
			int result = 5/5; //AE
			System.out.println(" 1. Result " + result);
			
			//Step2
			String name ="Rama"; //NE
			System.out.println("2. Upper Case " + name.toUpperCase());
			
			//Step3
			int []data={56,78,90,78,56};//ArrayInEX
			System.out.println("3. 4 th Elements " + data[4]);
			
			//step4
			FileInputStream fileInputStream = new FileInputStream("data");
			fileInputStream.read();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}catch(Exception ex){
			System.out.println("Common Logic .. Unexpected Exception");
			ex.printStackTrace();
		}
		
		//Step4
		Employee emp  = new Employee(89, "Rama", 5600);
		System.out.println("4. Emp Name " + emp.getEname());
		
		System.out.println("Main - End");

	}

}
