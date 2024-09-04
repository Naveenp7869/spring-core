package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/bean/scope/scopeconfig.xml");
		Addition add = context.getBean("addition", Addition.class);
		System.out.println(add);
		System.out.println(add.hashCode());
		System.out.println("-------------------------------------------------------");
		Addition add2 = context.getBean("addition", Addition.class);
		System.out.println(add2);
		System.out.println(add2.hashCode());
		System.out.println("-------------------------------------------------------");
	}
}
