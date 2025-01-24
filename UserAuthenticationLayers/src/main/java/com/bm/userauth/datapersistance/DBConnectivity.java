package com.bm.userauth.datapersistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bm.userauth.User;
import com.bm.userauth.dataaccess.Connectivity;

public class DBConnectivity implements Connectivity {

	@Override
	public boolean isValidUser(User user) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/training", "root", "0787");
//			 loginId  | pass
			String query = "Select * from useraccount where loginId = ? && pass = ?;";
//			String query = "Select * from useraccount where loginId = ? ;";
			System.out.println("DB Connected");
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			ResultSet res = pstmt.executeQuery();

			boolean isPresent = res.next();
//			System.out.println("Is present status : " + isPresent);
			con.close();
			return isPresent;
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

}
