<<<<<<< HEAD
package com.bm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversalQ {

	public static void main(String[] args) {

		String query = "SELECT * FROM members";
//		String query2 = "INSERT INTO members  (member_id  ,member_name     ,member_address  ,acc_open_date  ,membership_type ,fees_paid ,max_books_allowed  ,penalty_amount) VALUES (    9 , 'Ram','Pune' ,'2014-12-24','Lifetime',300,120,0.00);";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully..!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");
			System.out.println("Connected Successfully..!");

			Statement stmt = con.createStatement();

			if (stmt.execute(query)) {

				ResultSet res = stmt.getResultSet();

				while (res.next())
					System.out.println("ID : " + res.getString(1) + " name : " + res.getString(2));
			} else
				System.out.println("Updated rows : " + stmt.getUpdateCount());

			con.close();
			System.out.println("Connection closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
=======
package com.bm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversalQ {

	public static void main(String[] args) {

		String query = "SELECT * FROM members";
//		String query2 = "INSERT INTO members  (member_id  ,member_name     ,member_address  ,acc_open_date  ,membership_type ,fees_paid ,max_books_allowed  ,penalty_amount) VALUES (    9 , 'Ram','Pune' ,'2014-12-24','Lifetime',300,120,0.00);";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully..!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");
			System.out.println("Connected Successfully..!");

			Statement stmt = con.createStatement();

			if (stmt.execute(query)) {

				ResultSet res = stmt.getResultSet();

				while (res.next())
					System.out.println("ID : " + res.getString(1) + " name : " + res.getString(2));
			} else
				System.out.println("Updated rows : " + stmt.getUpdateCount());

			con.close();
			System.out.println("Connection closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
