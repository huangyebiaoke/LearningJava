package com.test.second;

public class SedanCar extends Car {
	public int sit=4;//override parent member variable;
	SedanCar(){
		//super();
		System.out.println("sedanCar class done");
	}
	public void information() {
		System.out.println("sendanCar\t"+"sit:"+sit+" Kind:"+Kind);//can't override parent final method
	}
	public void carInfo() {
		System.out.println("Car(parent) sit:"+super.sit);
	}
	@Override
	public String toString() {
		return "this is override sit: "+sit;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SedanCar other = (SedanCar) obj;
		if (sit != other.sit)
			return false;
		return true;
	}
}
