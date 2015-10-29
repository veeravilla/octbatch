package com.test.oops;

public class Pen {
	
	String inkColor;
	
	static int count;
	
	public void write(){
		System.out.println(" Using inkcolor " + inkColor);
	}
	
	public static int getCount(){
/*		Pen p = new Pen();
		p.inkColor ="Green";
		p.write();*/
		return count;
	}

}
