package com.bm.coinmanagement.dao;

import java.sql.Connection;
import java.util.List;

import com.bm.coinmanagement.coin.Coin;

public interface ServletCoinDAO {
	public List<Coin> getAllCoinsAvailable(Connection con);
}
