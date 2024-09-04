package com.springcore.standalonecollection;

import java.util.List;
import java.util.Map;

public class Student {

	private String name;
	private List<String> courses;
	private Map<String, String> friends;

	public Map<String, String> getFriends() {
		return friends;
	}

	public void setFriends(Map<String, String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + "," + " friends=" + friends + "]";
	}

}
