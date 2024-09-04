package com.learnSpring.autowire;

public class Emp {

	 private Address address1;

	public Emp(Address address) {
		super();
		this.address1 = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address1 + "]";
	}

	public Address getAddress() {
		return address1;
	}

	public void setAddress(Address address) {
		this.address1 = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
