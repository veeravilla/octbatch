package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class DBConnectionTest {

	public static void main(String[] args) throws Exception {
		/*Properties dbProperties = new Properties();

		//Class Path
		dbProperties.load(DBConnectionTest.class.getResourceAsStream("database.properties"));
		System.out.println(dbProperties);
		
		//Load Driver Class Name
		Class.forName(dbProperties.getProperty("driverClassName"));
		
		//Connection
		Connection connection = DriverManager.getConnection(dbProperties.getProperty("dbURL"),
				dbProperties.getProperty("username"),dbProperties.getProperty("password"));*/
		
		Connection connection  = DBUtil.getDBConnection();
		
		Connection connection1  = DBUtil.getDBConnection();
		
		Connection connection2  = DBUtil.getDBConnection();
		
		System.out.println(connection);
		//DB Operations
		
		Statement stmt = connection.createStatement();
		
		//Create Table
		//stmt.execute("CREATE TABLE Persons ( PersonID int, LastName varchar(255), FirstName varchar(255),Address varchar(255),City varchar(255));");
		
		//int result = stmt.executeUpdate("INSERT INTO Persons VALUES (2000,'Jhon','Smith','Plymouth','NJ');");
		
		//System.out.println(result + " New Record Added in the DB");
		
		//int result = stmt.executeUpdate("DELETE From Persons where PersonID = 2000");
		
		//System.out.println(result + "  Records Deleted");
		
		int result = stmt.executeUpdate("UPDATE Persons set LastName='TIM' where PersonID = 2000");
		
		System.out.println(result + "  Records Updated");
		
		connection.close();
	}

}
