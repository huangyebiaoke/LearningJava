package com.test.thrid;

public class Circle extends Shape {
	private double r;
	Circle(double r){
		this.r=r;
	}
	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(r, 2);//r的2次方
	}

}
