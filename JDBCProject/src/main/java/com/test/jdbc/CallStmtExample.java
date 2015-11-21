package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallStmtExample {

	public static void main(String[] args)  throws Exception{
		Connection dbConnection = DBUtil.getDBConnection();
		CallableStatement cstmt = dbConnection.prepareCall("{call addStudent}");
		cstmt.executeUpdate();
	}

}
