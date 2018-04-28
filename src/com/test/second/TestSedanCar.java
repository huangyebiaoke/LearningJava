package com.test.second;
//format code: ctrl+shift+f
public class TestSedanCar {

	public static void main(String[] args) {
		/*SedanCar sc = new SedanCar();
		Car sc2 = new SedanCar();
		sc.Kind = "sedan car";
		sc.sit = 4;
		sc.information();
		sc.carInfo();
		
		System.out.println(sc);

		Car c = new Car();
		System.out.println(c.sit);
		System.out.println(sc2.equals(sc));*/
		SedanCar sc=new SedanCar();
		Car c=sc;//自动类型提升
		if(c instanceof SedanCar) {//如果对象含有SedanCar类型的元素就可以转换
			SedanCar sc2=(SedanCar)c;//强制类型转化
		}else {
			System.out.println("can't cast to SedanCar");
		}
		if(c instanceof Trucks) {
			Trucks t=(Trucks)c;
		}else {
			System.out.println("can't cast to Trucks");//事实上c是由SedanCar转换而来不含Trucks
		}
	}
}
