package com.bm.userauth;

public class User {
	String userId;
	String password;

	public User() {

	}

	public User(String userId, String password) {

		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
