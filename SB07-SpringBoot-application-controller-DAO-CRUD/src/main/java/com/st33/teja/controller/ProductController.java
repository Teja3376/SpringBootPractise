package com.st33.teja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService pservice; 
	
	@RequestMapping("/showdata")
	public List getalltopics() {
		return pservice.topics() ;
	}
	@PostMapping("/dataadd")
	public int addbook(@RequestBody ProductsBean bean) {
		pservice.add(bean);
		return bean.getPno();
		
	}
	@GetMapping("/showdata/{pno}")
	public ProductsBean getallbyid(@PathVariable ("pno") int pno) {
		return pservice.getbyid(pno);
		
	}
	@PutMapping("/updateproduct")
	public ProductsBean update(@RequestBody ProductsBean bean) {
		pservice.update(bean);
		return bean;
		
	}
	
	@DeleteMapping("/delete/{pno}")
	public void delete(@PathVariable ("pno") int pno) {
		pservice.delete(pno);	
		}
}
