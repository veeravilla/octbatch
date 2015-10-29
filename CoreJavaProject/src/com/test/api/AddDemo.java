package com.test.api;

public class AddDemo {

	public static void main(String[] args) {
		System.out.println(" Ouptut " +  args[0] + args[1]);
		
		int  aValue = Integer.parseInt(args[0]);
		int  bValue = Integer.parseInt(args[1]);
		
		System.out.println( " Result " + (aValue+bValue));

		int sResult = Math.max(56,78);
		System.out.println("MAx Numebr " + sResult);
	}
	

}
