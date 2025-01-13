<<<<<<< HEAD
package com.bm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
	public static void main(String[] args) {
		try {
			// Step 1: Load the Driver
			// Fully classified classname : needed with forname method

//	for Oracle = oracle.jdbc.Driver
			// For mysql
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load the diver into memory

			// Step 2 : Connect with DB :
			// protocol:subprotocol:db-Specific info
//jdbc:mysql
			// jdbc:oracle:thin:@<ip>:1521:tns
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");

			// Step 3: Define the query
			String query = "SELECT * FROM members";

			// Step 4 : Hold the query for execution
			Statement stmt = con.createStatement();

//Step 5: Execute the query
			ResultSet res = stmt.executeQuery(query);
			// Resultset does not Contain the actual data

			// to get metadata of table
//			ResultSetMetaData resmeta = res.getMetaData();
//			System.out.println(resmeta.getColumnName(1));

			// to get metadata of database
//			DatabaseMetaData dbmeta = con.getMetaData();
//			System.out.println(dbmeta.getDatabaseProductName());

			// Step 6 :Retrive data
			// Columns start from 1

//			con.close();  // data will be not available
			// Resultset : doesnot contain actual data. it will contains pointers to actual
			// data. Rsultset is a cursor from database
			// JDBC is connected architecture. for any operation we need to be connected.
			// Rowset : by using this we can use disconnected architecture.
			while (res.next()) {

				System.out.println("ID : " + res.getString(1) + " name : " + res.getString(2));
			}
//		Step 7 :Close the connection
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

public class MainApp {
	public static void main(String[] args) {
		try {
			// Step 1: Load the Driver
			// Fully classified classname : needed with forname method

//	for Oracle = oracle.jdbc.Driver
			// For mysql
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load the diver into memory

			// Step 2 : Connect with DB :
			// protocol:subprotocol:db-Specific info
//jdbc:mysql
			// jdbc:oracle:thin:@<ip>:1521:tns
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/library_system", "root", "0787");

			// Step 3: Define the query
			String query = "SELECT * FROM members";

			// Step 4 : Hold the query for execution
			Statement stmt = con.createStatement();

//Step 5: Execute the query
			ResultSet res = stmt.executeQuery(query);
			// Resultset does not Contain the actual data

			// to get metadata of table
//			ResultSetMetaData resmeta = res.getMetaData();
//			System.out.println(resmeta.getColumnName(1));

			// to get metadata of database
//			DatabaseMetaData dbmeta = con.getMetaData();
//			System.out.println(dbmeta.getDatabaseProductName());

			// Step 6 :Retrive data
			// Columns start from 1

//			con.close();  // data will be not available
			// Resultset : doesnot contain actual data. it will contains pointers to actual
			// data. Rsultset is a cursor from database
			// JDBC is connected architecture. for any operation we need to be connected.
			// Rowset : by using this we can use disconnected architecture.
			while (res.next()) {

				System.out.println("ID : " + res.getString(1) + " name : " + res.getString(2));
			}
//		Step 7 :Close the connection
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
