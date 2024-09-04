package com.learnSpring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnSpring/autowire/config.xml");
		Emp em = context.getBean("Emp", Emp.class);
	Address ad =	(Address) context.getBean("address");
	System.out.println(ad);
		System.out.println(em);
	}

}
