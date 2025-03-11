package com.st33.teja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
	@Autowired
	JavaRepo javarepo;
	public void addTopic(JavaTopicsBean books) {
		javarepo.save(books);
	}
	public List<JavaTopicsBean> getallbooks(){
	List<JavaTopicsBean> javalist = new ArrayList<JavaTopicsBean>();
	javarepo.findAll().forEach(t1-> javalist.add(t1));
	return javalist;
}
}
