package com.test.jdbc;

import java.util.ArrayList;
import java.util.List;

public class StudentAPP {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
	//	dao.addStudent(new StudentDTO(999, "Tim", "MS", 5600));
		
		/*List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		stuList.add(new StudentDTO(456, "Steve", "MS", 6431));
		stuList.add(new StudentDTO(234, "Tim", "MS", 1234));
		stuList.add(new StudentDTO(795, "Vipul", "MS", 2345));
		stuList.add(new StudentDTO(766, "Jhon", "MS", 5790));
		dao.addStudents(stuList);*/
		
		List<StudentDTO> stuList =  dao.getAllStudents();
		System.out.println(stuList);
	}
	
}
