package com.test.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestList {
	private ArrayList courseToSelect;
	public TestList() {
		this.courseToSelect=new ArrayList();
	}
	
	public void testAdd() {
		System.out.println("*****************add&&addAll************************");
		Course c1=new Course(1,"java程序设计");
		courseToSelect.add(c1);
		Course temp=(Course)courseToSelect.get(0);//取出的是object类型;
		System.out.println(temp.getId()+" "+temp.getName());
		Course c2=new Course(2,"操作系统");
		courseToSelect.add(0,c2);
		Course temp2=(Course)courseToSelect.get(0);
		System.out.println(temp2.getId()+""+temp2.getName());
		//Course temp3=(Course)courseToSelect.get(1);
		//System.out.println(temp3.getId()+" "+temp3.getName());
		Course[] c3= {new Course(3,"think in java"),new Course(6,"c language")};
		courseToSelect.addAll(Arrays.asList(c3));//addAll
		Course temp3=(Course)courseToSelect.get(2);
		System.out.println(temp3.getId()+""+temp3.getName());
		Course[] c4= {new Course(4,"the mean of learning English"),new Course(7,"How to learn java")};
		courseToSelect.addAll(3,Arrays.asList(c4));
		Course temp4=(Course)courseToSelect.get(3);
		System.out.println(temp4.getId()+""+temp4.getName());
		
	}
	public void testSize() {
		System.out.println("*****************通过.size()来获取对象************************");
		for(int i=0;i<courseToSelect.size();i++) {
			Course temp0=(Course)courseToSelect.get(i);
			System.out.println(i+" "+temp0.getId()+" "+temp0.getName());
		}
	}
	
	public void testIt() {
		System.out.println("*****************通过iterator来获取对象************************");
		Iterator it = courseToSelect.iterator();
		while ( it.hasNext()) {
			Course temp = (Course) it.next();
			System.out.println(it.hasNext()+" "+temp.getId()+" "+temp.getName());
		}
	}
	
	public void testEach() {
		System.out.println("*****************通过for each来获取对象************************");
		for (Object obj : courseToSelect) {
			Course temp=(Course)obj;
			System.out.println(temp.toString()+" "+temp.getId()+" "+temp.getName());
		}
	}
	public static void main(String[] args) {
		
		TestList t1=new TestList();
		t1.testAdd();
		t1.testSize();
		t1.testIt();
		t1.testEach();
		
	}

}
