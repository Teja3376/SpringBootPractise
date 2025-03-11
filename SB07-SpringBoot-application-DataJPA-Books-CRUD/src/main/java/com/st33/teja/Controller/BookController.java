package com.st33.teja.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	
	
	@GetMapping("/seedata")
	public List getallbooks() {
		return bookservice.getallbooks(); 
	}
	@PostMapping("/addData")
	public int addjavatopics(@RequestBody Books bean) {
		//TODO: process POST request
		bookservice.addTopic(bean);
		return bean.getId();
	}
	@GetMapping("/seedata/{id}")
	public Books gettopicsbyid(@PathVariable("id") int id) {
		return bookservice.getbookbyid(id);
	}
	
}
