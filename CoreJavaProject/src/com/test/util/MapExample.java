package com.test.util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Student,String> dataMap = new HashMap<Student, String>();//new Hashtable<Student, String>();
		
		dataMap.put(new Student(890, "MS", "Rama"), "Rama");//HardCode
		dataMap.put(new Student(123, "MS", "Steve"), null);
		dataMap.put(new Student(345, "MS", "Jhon"), "Jhon");
		dataMap.put(null, "Ken");
		
		System.out.println(dataMap);
		
		String name = dataMap.get(new Student(890, "MS", "Rama"));
		
		System.out.println("Name "  + name);
		
		

	}

}
