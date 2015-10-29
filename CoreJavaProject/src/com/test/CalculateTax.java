package com.test;

public class CalculateTax {

	public static void main(String[] args) {
		
		System.out.println(" Main Start");
		/*// employee -A
		System.out.println(" Fed Tax  " + (5000* 30/100));
				
		System.out.println(" State Tax  " + (5000* 8/100));
				
		System.out.println(" Net Amount  " + (5000 - (((5000* 30/100)) + ((5000* 8/100)))));
		
		//Employee - B
		System.out.println(" Fed Tax  " + (4500* 30/100));
		
		System.out.println(" State Tax  " + (4500* 8/100));
		
		System.out.println(" Net Amount  " + (4500 - (((4500* 30/100)) + ((4500* 8/100)))));*/
		
		//..
		
	//	calculateFedTax(5000);
		
	//	calculateFedTax(4000);

		calculateFedTax(7000);
		
		System.out.println(" Main Stop ");
	}
	
	public static void  calculateFedTax(int salary){
		// employee -A
		System.out.println(" Fed Tax  " + (salary* 30/100));
				
		System.out.println(" State Tax  " + (salary* 8/100));
				
		System.out.println(" Net Amount  " + (salary - (((salary* 30/100)) + ((salary* 8/100)))));
		
		System.out.println("===================");
	}
	
	public static void  calculateFedTaxV1(int salary){
		// employee -A
		int fedTax = (salary* 30/100);
		int stateTax = (salary* 8/100);
		
		System.out.println(" Fed Tax  " + fedTax);
				
		System.out.println(" State Tax  " + stateTax);
				
		System.out.println(" Net Amount  " + (salary - (fedTax-stateTax)));
		
		System.out.println("===================");
	}

}
