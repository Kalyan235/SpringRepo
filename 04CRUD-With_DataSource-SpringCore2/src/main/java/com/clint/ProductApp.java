package com.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.ProductController;
import com.model.Product;

public class ProductApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		ProductController controller=applicationContext.getBean("productController",ProductController.class);
		Product product=new Product(101, "Dell");
		
		controller.add(product);
		System.out.println("done");
		
	}

}
