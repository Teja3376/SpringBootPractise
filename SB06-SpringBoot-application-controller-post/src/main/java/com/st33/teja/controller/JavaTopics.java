package com.st33.teja.controller;

public class JavaTopics {
	private String id;
	private String decs;
	private String name;
	
	public JavaTopics(String id, String decs, String name) {
		this.id= id;
		this.decs=decs;
		this.name=name;
		
	}
	public String getId() {
		return id;
	}

	public String getDecs() {
		return decs;
	}

	public String getName() {
		return name;
	}
}
