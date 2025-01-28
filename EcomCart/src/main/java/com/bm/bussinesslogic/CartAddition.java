package com.bm.bussinesslogic;

import java.util.ArrayList;
import java.util.List;

import com.bm.dataaccess.CartAccess;
import com.bm.datapersistance.DatabaseConn;
import com.bm.entity.Product;

public class CartAddition {

	List<Product> productsInCart = new ArrayList<Product>();

	public String adToCart(Product product) {
		productsInCart.add(product);
		return "continue";
	}

	public void checkOut() {
		CartAccess dao = new DatabaseConn();
		dao.storeProducts(productsInCart);

	}

}
