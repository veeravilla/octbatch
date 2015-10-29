package com.test.oops.v3;

public class Honda implements Car,SportsCar {

	@Override
	public void start() {
		System.out.println("Honda # Start");
		
	}

	@Override
	public void stop() {
		System.out.println("Honda # Stop");
		
	}

	@Override
	public void move() {
		System.out.println("Honda # Move");
	}

}
