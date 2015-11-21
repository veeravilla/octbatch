package com.test.exception;

public class DataLayer {
	
	public int getEmpSalary(int eno,String ename) throws DataException{
		//TODO: DB Logic
		//step1
		if(eno < 0){
			throwDBException("V101", "Employee number is -Ve.");
		}
		
		//step2
		if(ename == null){
			throwDBException("DATA_EMPTY", "Name can't be NULL");
		}
		
		return 5000;
	}

	private void throwDBException(String errCode,String errMsg) throws DataException {
		DataException dException = new DataException(errCode,errMsg);
		throw dException;
	}

}
