package com.project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gui.Swing;

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

	/*
	 * @Override public StudentInfo find(int rollNo) throws SQLException,
	 * StudentNotFoundException {
	 * 
	 * StudentInfo student = null; String SQL =
	 * "SELECT 'Roll_no' , 'Name' , 'Marks' FROM info WHERE Roll_No=?";
	 * Statement stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery(SQL);
	 * 
	 * while (rs.next()) { student= new StudentInfo();
	 * student.setRollNo(rs.getInt("Roll_no"));
	 * student.setName(rs.getString("name"));
	 * student.setMarks(rs.getFloat("marks")); }
	 * 
	 * if(student ==null) throw new StudentNotFoundException("Roll no "+rollNo+
	 * " Not found");
	 * 
	 * return student;
	 * 
	 * }
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

class Student_GUI extends JPanel {
	JLabel lblName, lblRollNo, lblMarks;
	JTextField txtName;
	JTextField txtRollNo;
	JTextField txtMarks;
	JButton btnAdd, btnDelete,btnFind,btnList;

	JPanel panelMain, panelLogin, panelButton;

	public Student_GUI() {
		super();
		lblName = new JLabel("Enter Name : ");
		lblRollNo = new JLabel("Roll No : ");
		lblMarks = new JLabel("Marks : ");

		txtName = new JTextField(10);
		txtRollNo = new JTextField(10);
		txtMarks = new JTextField(10);

		btnAdd = new JButton("Add");
		btnDelete= new JButton("Delete");
		btnFind= new JButton("Find");
		btnList= new JButton("List");

		panelMain = new JPanel();
		panelLogin = new JPanel();
		panelButton = new JPanel();

		panelLogin.add(lblName);
		panelLogin.add(txtName);
		panelLogin.add(lblRollNo);
		panelLogin.add(txtRollNo);
		panelLogin.add(lblMarks);
		panelLogin.add(txtMarks);

		panelButton.add(btnAdd);
		panelButton.add(btnDelete);
		panelButton.add(btnFind);
		panelButton.add(btnList);
		
		panelMain.setLayout(new BorderLayout());

		panelMain.add(panelLogin, BorderLayout.CENTER);
		panelMain.add(panelButton, BorderLayout.SOUTH);

		add(panelMain);
		
		ActionEvent_Handler actionEvent_Handler = new ActionEvent_Handler();
		btnAdd.addActionListener(actionEvent_Handler);
		btnDelete.addActionListener(actionEvent_Handler);
		btnFind.addActionListener(actionEvent_Handler);
		btnList.addActionListener(actionEvent_Handler);
		

	}

	private class ActionEvent_Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			
			if(source == btnAdd){
				String name = txtName.getText();
				int rollNo=Integer.parseInt(txtRollNo.getText());
				float marks= Float.parseFloat(txtMarks.getText());
				
				StudentInfo stdInfo=new StudentInfo(rollNo,name,marks);
				
				try {
					StudentImplement stdImp = new StudentImplement();
					stdImp.add(stdInfo);
					
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
			
			else if(source == btnDelete){
				int rollNo= Integer.parseInt(txtRollNo.getText());
				StudentImplement stdImp = null;
				try {
					stdImp = new StudentImplement();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				try {
					stdImp.delete(rollNo);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
			
			else if(source == btnList){
				StudentImplement stdImp = null;
				try {
					stdImp = new StudentImplement();
				} catch (ClassNotFoundException | SQLException e2) {
					e2.printStackTrace();
				}
				
				try {
					stdImp.list();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		}


		
	}
}

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, StudentNotFoundException {

		/*Scanner sc = new Scanner(System.in);

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
		// StudentInfo s2=implement.find(6);
		// System.out.println(s2.toString());
		implement.list();*/
	

		JFrame frame = new JFrame("AWT Login");
		frame.setVisible(true);
		frame.add(new Student_GUI());
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
