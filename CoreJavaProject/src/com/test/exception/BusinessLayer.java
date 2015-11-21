package com.test.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BusinessLayer {
	
	public int getEmpSalary(int eno,String Ename) throws BusinessException{
		int salary;
		try{
			DataLayer dataLayer = new DataLayer();
			salary =  dataLayer.getEmpSalary(eno, Ename);
		}catch(DataException de){
			throw new BusinessException(de.getErrCode(), de.getErrMsg());
		}
		
		//Write Data into a File.
		/*try{
			FileInputStream fin = new FileInputStream("h://test.txt");
		}catch(FileNotFoundException fe){
			throw new BusinessException("B9000", fe.getMessage());
		}*/
		
		return salary;
	}
	

}
