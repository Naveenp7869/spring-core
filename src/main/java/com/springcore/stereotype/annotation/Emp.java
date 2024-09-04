package com.springcore.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Emp {
@Override
public String toString() {
	return "Emp [name=" + name + ", city=" + city + ", subjects=" + subjects + "]";
}
@Value("jagdish")
private String name;
@Value("indore")
private String city;
@Value("#{temp}")
private List<String> subjects;
public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;		
}
public String getName() {
	return name;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
