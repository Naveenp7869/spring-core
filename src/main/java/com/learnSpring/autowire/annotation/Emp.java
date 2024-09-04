package com.learnSpring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
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
