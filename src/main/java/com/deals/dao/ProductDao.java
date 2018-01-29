package com.deals.dao;

import java.util.List;

import com.deals.model.Product;



public interface ProductDao {
	void addProduct(Product product);
	void editProduct(Product product);

	Product getProductById(String id);

	List<Product> getAllProducts();

	void deleteProduct(String id);

}
