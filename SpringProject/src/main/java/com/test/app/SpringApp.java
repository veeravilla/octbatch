package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Employee;
import com.test.beans.ReferenceData;
import com.test.beans.Student;
import com.test.carapp.Car;

public class SpringApp {
	
	public static void main(String s[]){
		//Load Configurations // Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("collectionsApplicationContextWithAnnotations.xml");
		
		ReferenceData referenceData = springContainer.getBean("referenceData",ReferenceData.class);
		
		System.out.println(referenceData);
		
		Car car= referenceData.getCar();
		car.move();
		
	}

}
