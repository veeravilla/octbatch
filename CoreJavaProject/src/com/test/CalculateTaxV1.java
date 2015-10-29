package com.test;

public class CalculateTaxV1 {

	public static void main(String[] args) {
		
		System.out.println(" Main Start");
		
		System.out.println(" Employee A  Salary : " + getNetSalary(5000));
		System.out.println(" Employee B Salary : " + getNetSalary(4545));
		System.out.println(" Employee C  Salary : " + getNetSalary(3236));
		
		System.out.println(" Main Stop ");
	}
	
	public static int getNetSalary(int salary){
		int fedTax = getFedTax(salary);
		int stateTax = getStateTax(salary);
		int netSalary=  salary - (fedTax+stateTax);
		return netSalary;
	}
	
	public static int getFedTax(int salary){
		int fedTax = (salary* 30/100);
		return fedTax;
	}

	public static int getStateTax(int salary){
		int stateTax = (salary* 8/100);
		return stateTax;
	}
	
}
