package com.test.oops.v4;

public class Honda extends Car implements SportsCar {

	@Override
	public void start() {
		System.out.println("Honda # Start");
		
	}


	@Override
	public void move() {
		System.out.println("Honda # Move");
	}

}
