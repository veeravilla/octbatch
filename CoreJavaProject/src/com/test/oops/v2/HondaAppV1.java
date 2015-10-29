package com.test.oops.v2;

public class HondaAppV1 {

	public static void main(String[] args) {
		
		if(args[0].equals("Accord")){
			Accord accordObj = new Accord();
			accordObj.start();
			accordObj.stop();
			accordObj.move();
		}else if(args[0].equals("Civic")){
			Civic civicObj = new Civic();
			civicObj.start();
			civicObj.stop();
			civicObj.move();
		}else{
			System.out.println("Invalid Parameter / UnSupported Honda Car.");
		}
		
		

	}

}
