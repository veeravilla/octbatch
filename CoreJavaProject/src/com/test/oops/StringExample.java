package com.test.oops;

public class StringExample {

	public static void main(String[] args) {
		String s1="Rama";
		String s2="Rama";
		String s3 = new String("Rama");
		
		if(s1.equals(s3)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
	}

}
