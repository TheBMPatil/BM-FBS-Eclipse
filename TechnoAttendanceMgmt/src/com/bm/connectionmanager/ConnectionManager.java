package com.bm.connectionmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	Statement stmt;

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/training", "root", "0787");
		return con;
	}

	public void closeConnection(Connection c) throws SQLException {
		c.close();
	}

	public ResultSet executeQuery(String sql, Connection con) throws SQLException {
		stmt = con.createStatement();
		return stmt.executeQuery(sql);
	}

	public int updateQuery(String sql, Connection con) {

		return 0;
	}
}
