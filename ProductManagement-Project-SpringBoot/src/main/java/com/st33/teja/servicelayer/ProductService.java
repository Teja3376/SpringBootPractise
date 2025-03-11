package com.st33.teja.servicelayer;
import java.util.List;

import com.st33.teja.beanlayer.Product;


public interface ProductService {

    Product CreateProduct(Product pdt);
    
	Product findProductById(long pdtId);
	
	Product updateProduct(Product pdt); 
	
	List<Product> findAllProducts();
	
	void deleteProduct(long pdtId);
	
}