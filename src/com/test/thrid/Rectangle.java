package com.test.thrid;

public class Rectangle extends Shape implements IAngle {
	private double x;
	private double y;
	Rectangle(double x,double y){
		this.x=x;
		this.y=y;
	}

	@Override
	public double perimeter() {
		return 2*(x+y);
	}

	@Override
	public double area() {
		return x*y;
	}

	@Override
	public void angle() {
		System.out.println("矩形内角=90");
	}
}
