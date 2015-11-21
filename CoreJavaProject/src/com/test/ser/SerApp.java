package com.test.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerApp {

	public static void main(String[] args)  throws Exception{
		Light light = new Light();
		light.lightOn();
		light.printStatus();
		
		FileOutputStream fout =  new FileOutputStream("light.ser");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
		
		objectOutputStream.writeObject(light);
		
		objectOutputStream.close();
		fout.close();
	}

}
