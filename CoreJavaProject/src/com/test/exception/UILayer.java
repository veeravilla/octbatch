package com.test.exception;

public class UILayer {
	
	public int getEmployeeSalary(int eno,String ename) throws UIException{
		try{
			BusinessLayer businessLayer = new BusinessLayer();
			return businessLayer.getEmpSalary(eno, ename);
			//UI Logic
		}catch(BusinessException be){
			throw new UIException(be.getErrCode(), be.getErrMsg());
		}
	}

}
