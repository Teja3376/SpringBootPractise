package com.st33.teja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepostiory repo;
	//Add
	public void add(ProductsBean bean) {
		repo.save(bean);
	}
	//Get
	public List<ProductsBean> topics() {
		List<ProductsBean> mylist = new ArrayList<ProductsBean>();
		repo.findAll().forEach(t1->mylist.add(t1));
		return mylist;
	//Get by id	
	}
	public ProductsBean getbyid(int pno) {
		return repo.findById(pno).get();
	}
	//Update
	public void update(ProductsBean bean) {
		repo.save(bean);
	}
	//Delete
	public void delete(int pno ) {
		repo.deleteById(pno);
	}
}
