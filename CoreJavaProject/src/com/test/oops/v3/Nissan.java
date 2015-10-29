package com.test.oops.v3;

public class Nissan implements Car {

	@Override
	public void start() {
		System.out.println("Nissan # Start");
		
	}

	@Override
	public void stop() {
		System.out.println("Nissan # Stop");
		
	}

	@Override
	public void move() {
		System.out.println("Nissan # Move");
	}

}
