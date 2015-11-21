package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO {
	
	/*public boolean  addStudent(StudentDTO studentDTO) {
		try{
			Connection connection = DBUtil.getDBConnection();
			Statement stmt = connection.createStatement();
			//Insert into Student values(101,'Jhon','Ms',5677);
			String insertSQL = "Insert into Student values ( " + studentDTO.getSno() 
					+ ",'" +studentDTO.getSname()+"'"
					+",'" +studentDTO.getCourse()+"'"
					+"," +studentDTO.getFee() + " )";
			
			System.out.println(insertSQL);
			
			stmt.executeUpdate(insertSQL);
		}catch(Exception ex){
			return false;
		}
		return true;
	}*/
	
	public boolean update(StudentDTO studentDTO){
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Update Student Set Sname= ?, Course=?, Fee=? where Sno= ?");
			pstmt.setInt(4, studentDTO.getSno());
			pstmt.setString(1, studentDTO.getSname());
			pstmt.setString(2, studentDTO.getCourse());
			pstmt.setInt(3, studentDTO.getFee());
			pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean delete(int sno){
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Delete from Student where Sno = ?");
			pstmt.setInt(1, sno);
			pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean  addStudent(StudentDTO studentDTO) {
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Insert into Student Values(?,?,?,?)");
			pstmt.setInt(1, studentDTO.getSno());
			pstmt.setString(2, studentDTO.getSname());
			pstmt.setString(3, studentDTO.getCourse());
			pstmt.setInt(4, studentDTO.getFee());
			pstmt.executeUpdate();
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	public boolean  addStudents(List<StudentDTO> stuList) {
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Insert into Student Values(?,?,?,?)");
			for(StudentDTO  studentDTO : stuList ){
				pstmt.setInt(1, studentDTO.getSno());
				pstmt.setString(2, studentDTO.getSname());
				pstmt.setString(3, studentDTO.getCourse());
				pstmt.setInt(4, studentDTO.getFee());
				pstmt.executeUpdate();
			}
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	public StudentDTO  getStudent(int sno) {
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Student where sno = ?");
			pstmt.setInt(1, sno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				return mapToStudentDTO(rs);
			}else{
				System.out.println(" Not Found  " + sno);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<StudentDTO>  getAllStudents() {
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		try{
			Connection connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Student");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				stuList.add(mapToStudentDTO(rs));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return stuList;
	}

	private StudentDTO mapToStudentDTO(ResultSet rs) throws SQLException {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setSno(rs.getInt("Sno"));
		studentDTO.setSname(rs.getString("Sname"));
		studentDTO.setFee(rs.getInt("Fee"));
		studentDTO.setCourse(rs.getString("Course"));
		return studentDTO;
	}
	
	
	

}
