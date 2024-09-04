package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	
public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//to call destroy methods. registerShutdownHook() is in the AbstractApplicationContext class  	
//public void registerShutdownHook()

		context.registerShutdownHook();
		person s1=(person) context.getBean("person");
		System.out.println(s1);
		System.out.println("----------------------------------------------");
		samosa s=(samosa) context.getBean("sam");
		System.out.println(s);
		System.out.println("----------------------------------------------");
//		pepsi pep=(pepsi) context.getBean("pepsi");
//		System.out.println(pep);
	}
}
