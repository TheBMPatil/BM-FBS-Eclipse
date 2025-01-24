package com.bm.userauth.businesslogic;

import com.bm.userauth.User;
import com.bm.userauth.dataaccess.Connectivity;
import com.bm.userauth.datapersistance.DBConnectivity;

public class AuthUser {

	public boolean verify(User user) {
		Connectivity conRef = new DBConnectivity();
		return conRef.isValidUser(user);
	}

}
