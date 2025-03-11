package com.st33.teja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepostiory repo;
	
	public void add(ProductsBean bean) {
		repo.save(bean);
	}
	
	public List<ProductsBean> topics() {
		List<ProductsBean> mylist = new ArrayList<ProductsBean>();
		repo.findAll().forEach(t1->mylist.add(t1));
		return mylist;
		
	}
}
