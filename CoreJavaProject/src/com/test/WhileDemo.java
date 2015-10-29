package com.test;

public class WhileDemo {

	public static void main(String[] args) {
		int counter =18;
		
		System.out.println(" While Demo ");
		while(counter<=10){
			if(counter%2 == 0)
				System.out.println(counter);
			counter++;//counter = counter + 1;
		}
		
		System.out.println(" Do - While");
		do{
			if(counter%2 == 0)
				System.out.println(counter);
			counter++;//counter = counter + 1;
		}while(counter<=10);
		
		counter = 20;
		System.out.println("For Loop");
		for(;;){
			System.out.println(counter);
			counter++;
		}
		
		

	}

}
