package com.st33.teja.controller;

public class JavaTopics {
	private String user;
	private String pass;
	private String email;
	public JavaTopics(String user , String pass, String email) {
		this.user = user;
		this.email = email;
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public String getPass() {
		return pass;
	}
	public String getEmail() {
		return email;
	}
}
