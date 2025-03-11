package com.st33.teja.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@RequestMapping("/javatopics")
	public List JavaTopics() {
		return Arrays.asList(new JavaTopics("1","23","334"),
				new JavaTopics("hello","mr.","Teja"));
	}
}
