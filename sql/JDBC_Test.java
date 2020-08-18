package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) {

		// 0.connection properties

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/Student";
		String USER = "root";
		String PASS = "";

		try {

			// 1. load the jdbc driver

			Class.forName(JDBC_DRIVER);

			// 2. establish database connection

			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			int rollNo = 2;
			String SQL = "SELECT * FROM INFO WHERE ROLL_NO =?";

			// 3. create a statement

			PreparedStatement psmt = con.prepareStatement(SQL);
			psmt.setInt(1, rollNo);
			// Statement stat = con.createStatement();

			// 4. execute the statement

			ResultSet rs = psmt.executeQuery();
			// ResultSet rs = psmt.executeQuery("SELECT * FROM INFO");

			// 5. process the result

			while (rs.next()) {
				System.out.println(rs.getInt("Roll_No") + " " + rs.getString("Name") + " " + rs.getFloat("Marks"));
			}

			rs.close();
			psmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
