package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Student;
import com.test.carapp.Car;
import com.test.carapp.CarApp;

public class SpringCarApp {

	public static void main(String[] args) {
		// Load Configurations // Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"carApplicationContextWithAnnotations.xml");

		CarApp carApp = springContainer.getBean("carApp", CarApp.class);
		
		carApp.getCar().start();
		carApp.getCar().move();
		carApp.getCar().stop();
		
		Car car = springContainer.getBean("nissan", Car.class);
		car.start();
		car.stop();
		car.move();
		
		

	}

}
