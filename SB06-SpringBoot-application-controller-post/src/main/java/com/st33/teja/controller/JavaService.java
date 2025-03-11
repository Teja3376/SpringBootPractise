package com.st33.teja.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JavaService {
	public List topics = Arrays.asList(new JavaTopics("1", "teja", "234"), new JavaTopics("2", "Charan", "567"),
			new JavaTopics("3", "k", "789"));
	List <JavaTopics> mytopics = new ArrayList <JavaTopics>(topics);

	public List<JavaTopics> getalltopics() {
		return mytopics;
	}
	public void addTopics(JavaTopics topic) {
		mytopics.add(topic);
	} 
}
