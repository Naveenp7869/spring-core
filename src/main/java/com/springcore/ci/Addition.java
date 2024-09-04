package com.springcore.ci;

public class Addition {
	private int x;
	private int y;

	public Addition(int x, int y) {

		System.out.println("contructor: int , int");
		this.x = x;
		this.y = y;
	}

	public Addition(double x, double y) {
		System.out.println("contructor: double, double");
		this.x = (int) x;
		this.y = (int) y;
	}

	
	  public Addition(String x, String y) {
	  System.out.println("contructor: String, String"); this.x =
	  Integer.parseInt(x); this.y = Integer.parseInt(y); }
	 
	public int doSum() {
		return x + y;
	}

	@Override
	public String toString() {
		return "Addition = " + doSum();
	}

}
