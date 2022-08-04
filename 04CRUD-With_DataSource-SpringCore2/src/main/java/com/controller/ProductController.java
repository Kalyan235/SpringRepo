package com.controller;

import com.model.Product;
import com.service.ProductService;

public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	public void add(Product product) {

		System.out.println("P controller");

		productService.add(product);

	}

}
