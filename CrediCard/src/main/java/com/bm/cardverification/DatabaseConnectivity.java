package com.bm.cardverification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//This is DATA Persistence layer

public class DatabaseConnectivity implements Connectivity {
	public boolean isCardPresent(Card ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/training", "root", "0787");

			String query = "Select * from CreditCard where cardno = ?;";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getCardNo());
			ResultSet res = pstmt.executeQuery();
			boolean isPresent = res.next();
			con.close();
			return isPresent; // We will get only 1 or 0 records here if there is record present this willl
								// return true else false

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean isValid(Card ref) {

		return isCardPresent(ref);
	}
}
