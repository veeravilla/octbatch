package com.test.oops;

public class EmployeeAppV1 {

	public static void main(String[] args) {
		Employee emp1 =  new Employee(999,"Rama",4500);
		
		Employee emp2 = new Employee(999,"Rama",4500);
	
		/*if(emp1 == emp2){ // Not Working
			System.out.println(" Equal ..");
		}else{
			System.out.println(" Not Equal ..");
		}*/
		
		if(emp1.equals(emp2)){ // Work
			System.out.println(" Equal () ..");
		}else{
			System.out.println(" Not Equal () ..");
		}
		
		Pen p1 = new Pen();
		if(emp1.equals(p1)){ // Not Working
			System.out.println(" Equal () ..");
		}else{
			System.out.println(" Not Equal () ..");
		}

	}

}
