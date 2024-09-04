package com.learnSpring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String city;
	private String street;
	private String State;

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", State=" + State + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Address() {
		super();
	}

	public Address(String city, String street, String state) {
		super();
		this.city = city;
		this.street = street;
		this.State = state;
		System.out.println("inside constructor");
	}

}
