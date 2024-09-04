package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class pepsi {
	private int price;

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
@PostConstruct
	public void naveen() {
		System.out.println("inside naveen");
	}
@PreDestroy
	public void panchal() {
		System.out.println("inside panchal");
	}
}
