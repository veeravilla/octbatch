package com.test.exception;

public class ExpDemoApp {

	public static void main(String[] args) {
		try{
			UILayer uiLayer = new UILayer();
			int salary = uiLayer.getEmployeeSalary(566, "Jhon");
			System.out.println(" Salary " + salary);
		}catch(UIException uiException){
			uiException.printStackTrace();
			System.out.println("Failed Due to  " + uiException.getErrCode() + " : " + uiException.getErrMsg());
		}finally{
			System.out.println("Execute Always!!!!!");
		}
	}

}
