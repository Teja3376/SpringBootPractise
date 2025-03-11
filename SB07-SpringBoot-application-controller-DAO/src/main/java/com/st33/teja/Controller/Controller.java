package com.st33.teja.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
	@Autowired
	JavaService javaservice;
	@GetMapping("/seedata")
	public List getallbooks() {
		return javaservice.getallbooks(); 
	}
	@PostMapping("/addData")
	public int addjavatopics(@RequestBody JavaTopicsBean bean) {
		//TODO: process POST request
		javaservice.addTopic(bean);
		return bean.getId();
	}
	
}
