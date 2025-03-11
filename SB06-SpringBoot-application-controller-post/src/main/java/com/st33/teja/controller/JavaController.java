 package com.st33.teja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JavaController {
	@Autowired
	JavaService topicservice;
	@RequestMapping("data")
	public List getalltopics() {
		return topicservice.getalltopics();
	}
//	@RequestMapping( value = "/addtopics", method = RequestMethod.POST)
	@PostMapping("/addtopics")
	public void postMethodName(@RequestBody JavaTopics topic) {
		topicservice.addTopics(topic);
		System.out.println(topic.getId());
		
	}
	
}
