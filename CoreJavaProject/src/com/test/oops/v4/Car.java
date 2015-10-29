package com.test.oops.v4;

public abstract class Car {
	
	public void start(){
		System.out.println("Car # Start");
	}
	
	public void stop(){
		System.out.println("Car # Stop");
	}
	
	public abstract void move();
}
