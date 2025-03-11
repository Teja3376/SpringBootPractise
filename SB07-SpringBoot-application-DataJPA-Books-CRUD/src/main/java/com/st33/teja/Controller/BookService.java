package com.st33.teja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	BookRepo bookrepo;
	//Post Mapping
	public void addTopic(Books books) {
		bookrepo.save(books);
	}
	//Get Mapping
	public List<Books> getallbooks(){
	List<Books> javalist = new ArrayList<Books>();
	bookrepo.findAll().forEach(t1-> javalist.add(t1));
	return javalist;
	}
	
	//get mapping by id
	public Books getbookbyid(int id) {
		return bookrepo.findById(id).get();
	}
}
