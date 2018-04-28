package com.test.first;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	public Telphone(float newScreen,float newCpu,float newMem){
		if(newScreen<3.5f) {
			System.out.println("您输入的参数有误，已为你自动赋值3.5");
			screen=3.5f;
		}else {
			screen=newScreen;
		}
		cpu=newCpu;
		mem=newMem;
		System.out.println("这是一个有参构造方法"+"cpu"+cpu);
	}
	

}
