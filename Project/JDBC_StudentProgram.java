package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class StudentInfo {
	private int rollNo;
	private String name;
	private float marks;

	StudentInfo(int rollNo, String name, float marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;

	}

	public StudentInfo() {
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
}

interface StudentOperation {
	void add(StudentInfo student) throws SQLException;

	void delete(int rollNo) throws SQLException;

	StudentInfo find(int rollNo) throws SQLException, StudentNotFoundException;

	void list() throws SQLException;
}

class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String message) {
		System.out.println(message);
	}
}

class StudentImplement implements StudentOperation {
	Connection con;

	public StudentImplement() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
		System.out.println("DB Conn Est....");
	}

	@Override
	public void add(StudentInfo student) throws SQLException {
		String SQL = "INSERT INTO info VALUES(?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(SQL);

		pstmt.setInt(1, student.getRollNo());
		pstmt.setString(2, student.getName());
		pstmt.setFloat(3, student.getMarks());
		pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Inserted : " + student.getRollNo());

	}

	@Override
	public void delete(int rollNo) throws SQLException {
		String SQL = "DELETE FROM INFO WHERE ROLL_NO=?";

		PreparedStatement pstmt = con.prepareStatement(SQL);
		pstmt.setInt(1, rollNo);
		pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Deleted Roll No: " + rollNo);

	}

	/*@Override
	public StudentInfo find(int rollNo) throws SQLException, StudentNotFoundException {

		StudentInfo student = null;
		String SQL = "SELECT 'Roll_no' , 'Name' , 'Marks' FROM info WHERE Roll_No=?";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			student= new StudentInfo();
			student.setRollNo(rs.getInt("Roll_no"));
			student.setName(rs.getString("name"));
			student.setMarks(rs.getFloat("marks"));
		}
		
		if(student ==null) throw new StudentNotFoundException("Roll no "+rollNo+" Not found");
		
		return student;

	}
*/
	@Override
	public void list() throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM info");
		while (rs.next()) {
			System.out.println(rs.getInt("Roll_no") + " " + rs.getString("Name") + " " + rs.getFloat("marks"));
		}
		rs.close();
		stmt.close();

	}

	@Override
	public StudentInfo find(int rollNo) throws SQLException, StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

public class JDBC_StudentProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, StudentNotFoundException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter RollNo :-");
		int roll = sc.nextInt();
		System.out.println("Enter name :-");
		String nm = sc.next();
		System.out.println("Enter marks :-");
		float mk = sc.nextFloat();
	
		StudentInfo s1 = new StudentInfo(roll, nm, mk);
		StudentImplement implement = new StudentImplement();
		implement.add(s1);

		implement.delete(2);
		//StudentInfo s2=implement.find(6);
		//System.out.println(s2.toString());
		implement.list();
	}

}
