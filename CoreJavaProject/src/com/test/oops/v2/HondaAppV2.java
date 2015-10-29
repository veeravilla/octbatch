package com.test.oops.v2;

public class HondaAppV2 {

	public static void main(String[] args) {
		
		Honda hondaObj = new Honda();
		
		if(args[0].equals("Accord")){
			hondaObj = new Accord();
		}else if(args[0].equals("Civic")){
			hondaObj = new Civic();
		}
		
		hondaObj.start();
		hondaObj.move();
		hondaObj.stop();
	}

}
