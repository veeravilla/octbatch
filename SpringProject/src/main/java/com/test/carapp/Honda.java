package com.test.carapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("honda")

public class Honda implements Car{

	public void start() {
		System.out.println("Honda # Start");
		
	}

	public void stop() {
		System.out.println("Honda # Stop");
		
	}

	public void move() {
		System.out.println("Honda # Move");
	}

}
