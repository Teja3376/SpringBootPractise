package com.st33.teja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("login.spring")
	public void teja() {
		System.out.println("hello");
	}
	
}
