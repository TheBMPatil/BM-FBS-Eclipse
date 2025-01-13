package com.bm.jdbc.sqlinjectionprone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InjectionProne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully..!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");
			System.out.println("Connected Successfully..!");

			Statement stmt = con.createStatement();

			System.out.print("Enter Member Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Member ID: ");
			String id = sc.nextLine();
			String query = "SELECT * FROM members WHERE member_id = " + id + " AND member_name = '" + name;
			System.out.println("Executing query: " + query);

			ResultSet res = stmt.executeQuery(query);

			if (res.next()) {
				System.out.println("Valid user");
			} else {
				System.out.println("Invalid user");
			}
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
//			Driver Loaded Successfully..!
//			Connected Successfully..!
//			Enter Member Name: ' or '1'='1';
//			Enter Member ID: 1 or 1=1
//			Executing query: SELECT * FROM members WHERE member_id = 1 or 1=1 AND member_name = '' or '1'='1';
//			Valid user
//			1
//			Richa Sharma
//			Pune
//			Connection closed
			
			con.close();
			System.out.println("Connection closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
