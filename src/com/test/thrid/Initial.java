package com.test.thrid;

public class Initial {

	public static void main(String[] args) {
		Shape ra=new Rectangle(3,4);
		System.out.println("rectangle:\tperimeter:"+ra.perimeter()+"\tarea:"+ra.area());
		Shape c=new Circle(5);
		System.out.println("circle:\tperimeter:"+c.perimeter()+"\tarea:"+c.area());
		IAngle a1=new Rectangle(2, 2);
		a1.angle();
		IAngle a2=new Triangle();
		a2.angle();
		IAngle a3=new IAngle(){
			@Override
			public void angle() {
				System.out.println("匿名内部类实现接口1");
			}
		};
		a3.angle();
		
		new IAngle() {
			public void angle() {
				System.out.println("匿名内部类实现接口2");
			}
		}.angle();
	}
}
