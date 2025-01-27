package com.bm.coinmanagement.utility;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.bm.coinmanagement.coin.Coin;
import com.bm.coinmanagement.dao.ServletCoinDAO;

public class ServletUtility implements ServletCoinDAO {

	public static Scanner sc = new Scanner(System.in);

	@Override
	public List<Coin> getAllCoinsAvailable(Connection con) {
		
		return null;
	}

}
