package com.bm.controller;

import java.io.IOException;

import com.bm.bussinesslogic.CartAddition;
import com.bm.dataaccess.CartAccess;
import com.bm.datapersistance.DatabaseConn;
import com.bm.entity.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addToCart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CartAddition busiinessLog = new CartAddition();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int qty = Integer.parseInt(req.getParameter("qty"));
		int prodId = Integer.parseInt(req.getParameter("prodId"));
		String callToAct = req.getParameter("callToAction");
		double price = Double.parseDouble(req.getParameter("prodPrice"));
		String prodName = req.getParameter("prodName");

//		System.out.println("Call to act : " + callToAct);
		if (callToAct.equals("addToCart")) {
			Product prodRef = new Product(prodId, qty, prodName, price);// int id, int qty, String name, double price
			String result = busiinessLog.adToCart(prodRef);
			if (result.equals("continue")) {
				resp.sendRedirect("index.html");
			}
		} else if (callToAct.equals("checkOut")) {
			busiinessLog.checkOut();
		}

	}

}
