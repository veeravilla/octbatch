package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListExmaple1 {

	public static void main(String[] args) {
		List<String> nameList =  new ArrayList<String>();
		// Add
		nameList.add("Rama");
		nameList.add("Tim");
		nameList.add("Jhon");
		nameList.add("Steve");
		nameList.add("zhon");
		
		List<String> searchList =  new ArrayList<String>();
		// Add
		searchList.add("Rama");
		searchList.add("Tim");
		searchList.add("Jhon");
		
		System.out.println("Before Sort " + nameList);
		
		Collections.sort(nameList);
		
		System.out.println("After Sort " + nameList);

		if(nameList.contains("Jhon")){
			System.out.println("Element Found  !!");
		}else{
			System.out.println("Not Found");
		}
		
		if(nameList.containsAll(searchList)){
			System.out.println("All Elements Found  !!");
		}else
			System.out.println("Not found");
	}

}
