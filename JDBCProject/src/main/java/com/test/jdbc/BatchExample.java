package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExample {

	public static void main(String[] args) throws Exception{
		Connection dbConnection =  null;
		try{
			dbConnection = DBUtil.getDBConnection();
			dbConnection.setAutoCommit(false);
			
			Statement stmt = dbConnection.createStatement();
			
			stmt.addBatch("INSERT INTO Student VALUES (8765,'Tim','MS',9090);");
			stmt.addBatch("INSERT INTO Student VALUES (6543,'Kiran','MS',3214);");
			stmt.addBatch("INSERT INTO Student VALUES (1234,'Kiran','MS',3214);");
			stmt.executeBatch();
			
			dbConnection.commit(); // Save
		}catch(Exception ex){
			ex.printStackTrace();
			dbConnection.rollback();
		}

	}

}
