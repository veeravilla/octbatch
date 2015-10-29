package com.test.oops.v3;

public class BMW implements Car,SportsCar {

	@Override
	public void start() {
		System.out.println("BMW # Start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW # Stop");
		
	}

	@Override
	public void move() {
		System.out.println("BMW # Move");
	}

}
