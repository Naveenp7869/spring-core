package com.learnSpring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/learnSpring/autowire/annotation/config.xml");
		Emp em = context.getBean("Emp", Emp.class);
		System.out.println(em);
	}

}
