package com.st33.teja.daoLayer;
import java.util.List;

import com.st33.teja.beanlayer.Product;



public interface ProductDAO {
	
	Product CreateProduct(Product pdt);
	Product findProductById(long pdtId);
	Product updateProduct(Product pdt); 
	List<Product> findAllProducts();
	void deleteProduct(long pdtId);
}