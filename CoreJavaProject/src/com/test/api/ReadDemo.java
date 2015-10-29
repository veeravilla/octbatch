package com.test.api;

import java.io.FileInputStream;

public class ReadDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fInputStream = new FileInputStream("C:\\Oct2015\\workspace\\CoreJavaProject\\src\\com\\test\\api\\test.txt");
		int result;
		while ((result = fInputStream.read()) != -1) {
			System.out.print((char)result);
		}
		fInputStream.close();
	}

}
