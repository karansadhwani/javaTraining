package com.sql;

import java.sql.*;

public class StudentDAO {

	Connection con;
	
	
	public StudentDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
		System.out.println("DB Conn Est....");
	}


	public void SelectALL() throws SQLException {

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM info");
		while (rs.next()) {
			System.out.println(rs.getInt("Roll_no") + " " + rs.getString("Name") + " " + rs.getFloat("marks"));
		}
		rs.close();
		stmt.close();

	}
	
	
	public void insert(int rollNo, String name, float marks) throws SQLException{
		
		
		String SQL="INSERT INTO info VALUES(?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(SQL);
		
		pstmt.setInt(1, rollNo);
		pstmt.setString(2, name);
		pstmt.setFloat(3, marks);
		pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Inserted");
		
		
	}

	public void update(int rollNo, String name, float marks) throws SQLException{
		
		
		String SQL="UPDATE INFO SET NAME=? , MARKS=? WHERE ROLL_NO=?";
		
		PreparedStatement pstmt=con.prepareStatement(SQL);
		
		pstmt.setString(1, name);
		pstmt.setFloat(2, marks);
		pstmt.setInt(3, rollNo);
		pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Updated....");
		
		
	}

	public void delete(int rollNo)throws SQLException{
		
		String SQL="DELETE FROM INFO WHERE ROLL_NO=?";
		
		PreparedStatement pstmt= con.prepareStatement(SQL);
		pstmt.setInt(1, rollNo);
		pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Deleted Roll No: "+rollNo);
		
	}
	
	
	
	public static void main(String main[]) {
		StudentDAO studentDAO;

		try {
			studentDAO = new StudentDAO();
			studentDAO.SelectALL();
			studentDAO.insert(2,"Karan",75);
			studentDAO.update(1, "Vaish", 98);
			studentDAO.delete(4);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}