package com.st33.teja.Controller;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class JavaTopicsBean implements Serializable {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private int price;
	public JavaTopicsBean() {
		
	}
	public JavaTopicsBean(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
