package com.test.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		
		String envName = System.getProperty("app.env.name");
		
		Properties properties = new Properties();
		//properties.load(new FileInputStream("C:\\Oct2015\\workspace\\CoreJavaProject\\src\\com\\test\\util\\app-dev.properties"));

		System.out.println("Loading Env : " + envName);
		//Class Path
		properties.load(PropertiesExample.class.getResourceAsStream("app-"+envName+".properties"));
		System.out.println(properties);
		
		System.out.println("DB IP  " + properties.get("dbip"));
		System.out.println("LDap " +properties.get("ldapid"));
		System.out.println("User Name" +properties.get("dbusername"));
		System.out.println("PAssword" + properties.get("dbpassword"));
		
		
	}

}
