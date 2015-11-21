package com.test.carapp;

import org.springframework.stereotype.Component;

@Component("bmw")
//<bean id="bmw" class="com.test.carapp.BMW"/>
public class BMW implements Car {

	public void start() {
		System.out.println("BMW # Start");
		
	}

	public void stop() {
		System.out.println("BMW # Stop");
		
	}

	public void move() {
		System.out.println("BMW # Move");
	}

}
