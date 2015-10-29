package com.test.oops.v3;

public class CarApp {

	public static void main(String[] args)  throws Exception{
		Car carRef = null;
		
		/*if(args[0].equals("BMW")){
			carRef= new BMW();
		}else if(args[0].equals("Nissan")){
			carRef = new Nissan();
		}else{
			carRef = new Honda();
		}*/
		
		Class classObj =	Class.forName(args[0]); // Load Class into the JVM
		Object obj = classObj.newInstance();
		if(obj instanceof Car){
			carRef = (Car) obj;
			carRef.start();
			carRef.move();
			carRef.stop();
		}else{
			System.out.println(" Not a CAR Object");
		}
		
		if(obj instanceof SportsCar){
			System.out.println(" it is a Sports Car .. Common Logic");
		}
		
		

	}

}
