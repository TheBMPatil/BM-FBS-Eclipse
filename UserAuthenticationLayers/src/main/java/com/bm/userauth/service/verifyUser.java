package com.bm.userauth.service;

import java.io.IOException;
import java.io.PrintWriter;

import com.bm.userauth.User;
import com.bm.userauth.businesslogic.AuthUser;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/authuser")
public class verifyUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userId = req.getParameter("uid");
		String userPass = req.getParameter("pass");

		System.out.println("User data : id " + userId + "Pass : " + userPass);

		User user = new User(userId, userPass);

		AuthUser ref = new AuthUser();
		boolean isOk = ref.verify(user);
//		PrintWriter out = res.getWriter();
//		out.println("Data Recived");
		if (isOk) {
			res.sendRedirect("home.html");
//			out.println("User Verified ");
		} else {
			res.sendRedirect("Error.html");
//			out.println("User not verified");
		}
	}
}
