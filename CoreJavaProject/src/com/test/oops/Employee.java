package com.test.oops;

public class Employee implements Comparable<Employee> {

		//Instance Variables
		private int eno;
		private int salary;
		private String ename;
		
		public void showPayStub(){
			System.out.println(" Eno  " + eno);
			System.out.println(" Ename " + ename);
			System.out.println(" Net Salary " + (salary-(salary*30/1000)));
		}
		
		//Zero Argument Constructor
		public Employee(){
			System.out.println(" Default Constructor / Emp Obj is Created...");
		}
		
		//Parameterized Constructor
		public Employee(int enumber,String ename,int salary){
			System.out.println(" Param Constructor / Emp Obj is Created...");
			eno=enumber;
			this.ename=ename;
			this.salary=salary;
		}
		
		
		public void setEno(int eno){ //Write
			//B.L / History
			this.eno=eno;
		}
		
		public int getEno(){ //Read
			//B.L
			return eno;
		}

		public int getSalary() {
			return salary;
		}

		@Override
		public boolean equals(Object obj) {
			System.out.println(" Employee Equals () ... ");
			if(obj instanceof Employee){
				Employee emp = (Employee) obj; //type Casting
				if(this.eno == emp.getEno() && this.ename.equals(emp.getEname()) && this.salary == emp.getSalary()){
					return true;
				}
			}
			return false;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		@Override //Default
		public int compareTo(Employee emp) {
			if(this.eno == emp.getEno()){
				return 0;
			}else if(this.eno < emp.getEno()){
				return -1;
			}else{
				return 1;
			}
		}

		@Override
		public String toString() {
			return "Employee [eno=" + eno + ", salary=" + salary + ", ename="
					+ ename + "]";
		}
		
		
}
