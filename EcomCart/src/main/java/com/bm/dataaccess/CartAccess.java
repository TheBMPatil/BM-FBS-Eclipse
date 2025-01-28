package com.bm.dataaccess;

import java.util.List;

import com.bm.entity.Product;

public interface CartAccess {

	void storeProducts(List<Product> cart);
}
