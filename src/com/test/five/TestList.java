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
	
	public void testIterator() {
		System.out.println("*****************通过iterator来获取对象************************");
		Iterator it = courseToSelect.iterator();
		while ( it.hasNext()) {
			Course temp = (Course) it.next();
			System.out.println(it.hasNext()+" "+temp.getId()+" "+temp.getName());
		}
	}
	
	public void testEach() {
		System.out.println("*****************通过for each来获取对象************************");
		/*先把它当作Object类型取出然后cast to Course
		 *如果直接用Course取出会报错因为咩有声明courseToSelect中存取的是Course
		 *cannot convert from element type Object to Course
		 */
		for (Object obj : courseToSelect) {
			Course temp=(Course)obj;
			System.out.println(temp.toString()+" "+temp.getId()+" "+temp.getName());
		}
	}
	public void testModify() {
		System.out.println("*****************通过set来修改对象************************");
		courseToSelect.set(4, new Course(4,"毛概"));
	}
	/**
	 * 3 method of remove object in collection
	 */
	public void testRemove() {
		System.out.println("*****************remove&removeAll************************");
		/*Course c=(Course)courseToSelect.get(4);
		courseToSelect.remove(c);*/
//		courseToSelect.remove(3);
		Course[] c= {(Course) courseToSelect.get(3),(Course) courseToSelect.get(4)};
		courseToSelect.removeAll(Arrays.asList(c));
	}
	
	public static void main(String[] args) {
		
		TestList t=new TestList();
		t.testAdd();
		t.testSize();
		t.testIterator();
		t.testEach();
		t.testModify();
		t.testSize();
		t.testRemove();
		t.testSize();
		
	}

}
