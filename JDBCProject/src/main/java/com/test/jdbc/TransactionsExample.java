package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class TransactionsExample {

	public static void main(String[] args) throws Exception  {
		Connection dbConnection =  null;
		try{
			dbConnection = DBUtil.getDBConnection();
			dbConnection.setAutoCommit(false);
			
			Statement stmt = dbConnection.createStatement();
			
			//Unit of Work
			//Operation1
			stmt.executeUpdate("INSERT INTO Student VALUES (2555,'Tim','MS',9090);");
			
			//Operation2
			stmt.executeUpdate("INSERT INTO Student VALUES (2555,'Raj','Md',2345);");
			
			dbConnection.commit(); // Save
		}catch(Exception ex){
			ex.printStackTrace();
			dbConnection.rollback();
		}

	}

}
