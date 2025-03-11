package com.st33.teja.beanlayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product { 
	@Id
	@GeneratedValue
	@Column
	private long pno;
	@Column
	private String pname;
	@Column
	private long price;
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	//constructor
		public Product() {
			super();
		}
		@Override
		public String toString() {
			return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + "]";
		}



}
