package com.bm.servlets;

import java.io.IOException;
import java.util.List;

import com.bm.coinmanagement.coin.Coin;
import com.bm.coinmanagement.dbconnector.DataAccess;
import com.bm.coinmanagement.dbconnector.DbConnector;
import com.bm.coinmanagement.utility.Utilities;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/showallcoins")
public class ShowAllCoins extends HttpServlet {
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		DataAccess da = new DbConnector();

		Utilities util = new Utilities();
		List<Coin> availCoin = util.getAllCoins(da.getConnection());
		util.showAllAvailableCoins(availCoin);
//		util.showAllAvailableCoins();
	}
}
