package com.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import com.test.oops.Employee;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> nameList = new Vector<String>();//new ArrayList<String>();
		
		//Add
		
		nameList.add("Rama");
		nameList.add("Tim");
		nameList.add("Jhon");
		nameList.add("Steve");
		nameList.add("zhon");
		
		//Old
		for(int i=0;i<nameList.size();i++){
			System.out.println(nameList.get(i));
			if(nameList.get(i).equals("Tim")){ // Not Allow
				nameList.add("New Element");
			}
		}
		
		System.out.println("==============================");
		//Read Elements // Read  Only
		for(String name: nameList){
			System.out.println(" Name ::  " + name.toUpperCase());
			
			/*if(name.equals("Tim")){ // Not Allow
				nameList.add("New Element");
			}*/
		}
		
		System.out.println("==============================");
		Iterator<String> iterator = nameList.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.println(name);
			if(name.equals("Tim")){
				iterator.remove();
			}
		}
		
		System.out.println("============================");
		ListIterator<String> listIterator = nameList.listIterator();
		while(listIterator.hasNext()){
			String name = listIterator.next();
			System.out.println(name);
			if(name.equals("Jhon")){
				listIterator.remove();
			}else{
				listIterator.add("Raj 1");
			}
		}
		
		System.out.println("======================== Backward ");
		while(listIterator.hasPrevious()){
			String name = listIterator.previous();
			System.out.println(name);
		}
		
		
		
		
		
	}

}
