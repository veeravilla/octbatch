package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	
	private static Properties dbProperties = new Properties();
	
	private static 	BasicDataSource ds = new BasicDataSource();
	
	static{
		try{
			//Class Path
			dbProperties.load(DBConnectionTest.class.getResourceAsStream("database.properties"));
			ds.setUrl(dbProperties.getProperty("dbURL"));
			ds.setUsername(dbProperties.getProperty("username"));
			ds.setPassword(dbProperties.getProperty("password"));
			ds.setInitialSize(20);
			System.out.println(dbProperties);
		}catch(Exception ex){
			System.out.println(" Failed to load DB Operations.");
		}
		
	}
	
	public static Connection getDBConnection() throws Exception{
		return ds.getConnection();
	}
	
	
	
	/*public static Connection getDBConnection() throws Exception{
		//Load Driver Class Name
		Class.forName(dbProperties.getProperty("driverClassName"));
		
		//Connection
		Connection connection = DriverManager.getConnection(dbProperties.getProperty("dbURL"),
				dbProperties.getProperty("username"),dbProperties.getProperty("password"));
		
		return connection;
	}*/

}
