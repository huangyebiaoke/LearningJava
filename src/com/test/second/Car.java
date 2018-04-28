package com.test.second;

//public class Car extends Object
public class Car {
	public int sit = 3;
	public String Kind;

	Car() {
		sit = 5;
		System.out.println("Car class done");
	}

	public void information() {
		System.out.println("sit:" + sit + " Kind:" + Kind);
	}

}