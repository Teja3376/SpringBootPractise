package com.st33.teja.servicelayer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st33.teja.beanlayer.Product;
import com.st33.teja.daoLayer.ProductDAO;



@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO dao;
	
	public Product  CreateProduct (Product pdt) {
		return dao.CreateProduct(pdt);
	}
	
	public Product  findProductById(long pdtId) {
		return dao.findProductById(pdtId);
	}
	public Product updateProduct(Product pdt) {
		return dao.updateProduct (pdt);
	}
	public List<Product> findAllProducts(){
		 return dao.findAllProducts();
	}
	public void deleteProduct(long pdtId) {
		 dao.deleteProduct(pdtId);
	}
}