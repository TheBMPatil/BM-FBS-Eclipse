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
		return DriverManager.getConnection("jdbc:mysql://localhost:3308/training", "root", "0787");
	}

	public void closeConnection(Connection c) throws SQLException {
		if (c != null && !c.isClosed()) {
			c.close();
		}
	}

	public ResultSet executeQuery(String sql, Connection con) throws SQLException {
		stmt = con.createStatement();
		return stmt.executeQuery(sql);
	}

	public int updateQuery(String sql, Connection con) throws SQLException {
		stmt = con.createStatement();
		return stmt.executeUpdate(sql);
	}

	public void deleteUserById(int userId, Connection connection) {
		try (Statement stmt = connection.createStatement()) {
			// Delete related records from userattendancehistory
			String deleteAttendanceSql = "DELETE FROM userattendancehistory WHERE userid = " + userId + ";";
			int attendanceRowsAffected = stmt.executeUpdate(deleteAttendanceSql);

			System.out
					.println("Deleted " + attendanceRowsAffected + " attendance record(s) for User ID " + userId + ".");

			// Delete the user from useraccount
			String deleteUserSql = "DELETE FROM useraccount WHERE userid = " + userId + ";";
			int userRowsAffected = stmt.executeUpdate(deleteUserSql);

			if (userRowsAffected > 0) {
				System.out.println("User with ID " + userId + " has been deleted successfully.\n");
			} else {
				System.out.println("No user found with ID " + userId + ".");
			}
		} catch (SQLException e) {
			System.out.println("Error while deleting the user: " + e.getMessage());
		}
	}

}
