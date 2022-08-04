package com.service;

import com.Dao.ProductDao;
import com.model.Product;

public class ProductServiceImpl implements ProductDao{

	private ProductDao productDao;
	
	
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}



	public void add(Product product) {
		
		System.out.println("P service");

		productDao.add(product);
	}

}
