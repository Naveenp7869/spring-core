package com.springcore.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refinjection/refConfig.xml");
		A a = (A) context.getBean( "A");
		System.out.println(a.getX());
		System.out.println(a.getOb());
		System.out.println(a);

	}

}
