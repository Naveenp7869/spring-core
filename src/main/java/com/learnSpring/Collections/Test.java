package com.learnSpring.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/learnSpring/Collections/collectionConfig.xml");
		Emp emp = (Emp) context.getBean("Emp");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProps());

	}

}
