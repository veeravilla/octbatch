package com.test.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerApp {

	public static void main(String[] args)  throws Exception{
		
		
		FileInputStream fin =  new FileInputStream("light.ser");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fin);
		
		Light light = (Light)objectInputStream.readObject();
		
		fin.close();
		
		light.printStatus();
	}

}
