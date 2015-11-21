package com.test.ser;

import java.io.Serializable;

public class Light implements Serializable{
	
	private boolean status;
	
	public Light(){
		status = false;
	}
	
	public void lightOn(){
		status = true;
	}
	
	public void lightOff(){
		status = false;
	}
	
	public void printStatus(){
		System.out.println(" Light is " + ((status) ? " On " : " Off "));
	}

}
