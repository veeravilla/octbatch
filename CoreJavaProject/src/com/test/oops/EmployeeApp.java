package com.test.oops;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee emp2 = new Employee(999,"Rama",4500);
		
		Employee emp1 = new Employee(999,"Rama",4500);
		
		if(emp2.equals(emp1)){
			System.out.println(" Equal ()");
		}else{
			System.out.println("Not Equal ()..");
		}
		

	}

}
