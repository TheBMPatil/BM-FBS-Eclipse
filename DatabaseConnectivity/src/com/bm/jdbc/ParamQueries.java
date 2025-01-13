package com.bm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ParamQueries {

	public static void main(String[] args) {
//		String query = "SELECT * FROM members";
//		String query2 = "INSERT INTO members  (member_id  ,member_name     ,member_address  ,acc_open_date  ,membership_type ,fees_paid ,max_books_allowed  ,penalty_amount) VALUES (    9 , 'Ram','Pune' ,'2014-12-24','Lifetime',300,120,0.00);";
		String query3 = "select * from members where member_id =? and member_name =?;";
		Scanner sc = new Scanner(System.in);

		// Call-able statements = for calling stored procedures

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully..!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");
			System.out.println("Connected Successfully..!");

//			Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement(query3);
			System.out.println(pstmt.toString());
			String name = sc.next();
			int id = sc.nextInt();

			pstmt.setInt(1, id);
			pstmt.setString(2, name);

			System.out.println(pstmt.toString());
			ResultSet res = pstmt.executeQuery();

			if (res.next()) {
				System.out.println("Valid user");
			} else
				System.out.println("Invalid user");
			con.close();
			System.out.println("Connection closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
