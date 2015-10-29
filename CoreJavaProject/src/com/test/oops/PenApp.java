package com.test.oops;

public class PenApp {

	public static void main(String[] args) {
		
		System.out.println("Static Data " + Pen.getCount());
		
		Pen.count = 10; 
		
		//Create a Object
		Pen gPenObj = new Pen();
		
		Pen bPenObj = new Pen();
		
		Pen rPenObj = new Pen();
		
		gPenObj.inkColor="Green";
		bPenObj.inkColor="Blue";
		rPenObj.inkColor="Red";
		
		
		gPenObj.write();
		
		
		
		rPenObj.write();
		
		bPenObj.write();
		
		System.out.println(" Obj " + gPenObj.count);
		
		System.out.println(" RObj " + rPenObj.getCount());

	}

}
