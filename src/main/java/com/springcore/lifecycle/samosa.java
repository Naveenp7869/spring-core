package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class samosa implements InitializingBean, DisposableBean
{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after setting property");
	}
public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("before destroy object");
	}
@Override
public String toString() {
	return "samosa [price=" + price + "]";
}

public samosa() {
	super();
	// TODO Auto-generated constructor stub
}

}
