package com.test;

public class IfExample {

	public static void main(String[] args) {
		
		System.out.println("Big " + getBigNumber(56, 34));
		
		System.out.println(" Big " + getBigNumber(23,89,999));

	}

	public static int getBigNumber(int a,int b){ // Method OVer Loading
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static int getBigNumber(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("A is Big");
			return a; 
		}
		else if(b>c){
			System.out.println(" B is Big");
			return b;
		}else{
			System.out.println("C is Big");
			return c;
		}
	}
}
