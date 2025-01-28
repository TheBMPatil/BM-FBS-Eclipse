package com.bm.datapersistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bm.dataaccess.CartAccess;
import com.bm.entity.Product;

public class DatabaseConn implements CartAccess {
	private Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3308/ecom", "root", "0787");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void storeProducts(List<Product> cart) {
		Connection con = getCon();
		if (con != null) {
			System.out.println("Connected to the database.");
			System.out.println("No of prods in cart : " + cart.size());
			String sqlQuery = "INSERT INTO products (prodId, qty, prodName, price) VALUES (?, ?, ?, ?)";
			try {
				PreparedStatement pstmt = con.prepareStatement(sqlQuery);
				for (Product product : cart) {
					pstmt.setInt(1, product.getId());
					pstmt.setInt(2, product.getQty());
					pstmt.setString(3, product.getName());
					pstmt.setDouble(4, product.getPrice());
					pstmt.addBatch();
				}
				int[] rowsInserted = pstmt.executeBatch();
				System.out.println(rowsInserted.length + " products inserted into the database.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
					System.out.println("Connection Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("Database connection failed.");
		}
	}

}
