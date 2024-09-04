package com.springcore.lifecycle;

public class person {

	private String name;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("setting properties");
		this.name = name;
	}


	public person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void init() {
		System.out.println("inside init method");
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "person [name=" + name + "]";
	}

}
