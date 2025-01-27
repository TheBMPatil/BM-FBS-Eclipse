package com.bm.cardverification;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//This is Service layer Component 
@WebServlet("/cardverify") // Matching front-end action to the Servlet
//This is called the URL pattern of the class
//The url pattern must start with '/' while defining and no '/' when using it
//http://localhost:8080/CrediCard26/cardverify   - URL with resource name
//?name=Bhagvat+Mutthe&cardno=12312&cvv=123&expdate=2025-01-12   - query string with key vale pair

public class CardCheck extends HttpServlet {

	private static final long serialVersionUID = 1L;

//	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		String cardNo = req.getParameter("cardno");
		String cvv = req.getParameter("cvv");
		String expdate = req.getParameter("expdate");
		Card cardObj = new Card(name, cardNo, cvv, expdate);

		CardVerificatrion ref = new CardVerificatrion();
		boolean isOk = ref.verify(cardObj);

//		System.out.println("Data recived from client : " + "\nCard holder name : " + name + "\nCard Number : " + cardNo
//				+ "\nCVV : " + cvv + "\nExpiry date : " + expdate);

//		PrintWriter out = res.getWriter();
//		out.println("Data Recived");

//				+ "\nCard holder name : " + name + "\nCard Number : " + cardNo + "\nCVV : " + cvv
//				+ "\nExpiry date : " + expdate);

		if (isOk) {
			RequestDispatcher rd = req.getRequestDispatcher("history");
			rd.forward(req, res);
//			out.println("<h1> Card Verified <h1>");
		} else {
			res.sendRedirect("error.html");
//			out.println("Card not verified");
		}
	}

}
