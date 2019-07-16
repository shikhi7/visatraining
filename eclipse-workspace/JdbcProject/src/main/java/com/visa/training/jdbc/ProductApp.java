package com.visa.training.jdbc;

import java.util.List;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAO();
//		Product prod = new Product("hihi", 7.4f, 8000);
//		int retId = dao.save(prod);
//		System.out.println(retId);
//		Product fromDB = dao.findById(retId);
//		System.out.println(fromDB);
		List<Product> all = dao.findAll();
		all.forEach(System.out::println);
	}

}
