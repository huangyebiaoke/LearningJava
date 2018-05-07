package com.test.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 测试泛型;
 * ctrl+shift+/ ctrl+shift+\
 * ctrl+/
 */

public class TestGeneric {
	private List<Course> course;
	public TestGeneric(){
		this.course=new ArrayList<Course>();
	}
	
public void testAdd() {
	Course[] c= {new Course(1,"thinking in java"),
				 new Course(2,"data structure"),
				 new Course(3,"crizy java lensen")};
	for (int i = 0; i < c.length; i++) {
		/*
		 * 不用强转成Course类型,因为已经指定course中存放的是Course
		 * 也不能course.add(<String>);
		 */
		
		course.add(c[i]);
	}
}
public void testSize() {
	System.out.println("*****************通过.size()来获取对象************************");
	for(int i=0;i<course.size();i++) {
		//不用强转成Course类型,因为已经指定course中存放的是Course
		Course temp=course.get(i);
		System.out.println(i+" "+temp.getId()+" "+temp.getName());
	}
}
/**
 * 测试泛型集合能否添加泛型子类型的实例;
 */
public void testChild() {
	ChildCourse cc=new ChildCourse();
	cc.setId(4);
	cc.setName("泛型添加子类型测试");
	course.add(cc);
}
/**
 * 泛型集合不能添加基本数据类型,但是能添加它们的包装类;
 * @param args
 */
public void testBasicType() {
	List<Integer> b=new ArrayList<Integer>();
	//自动装箱
	b.add(33);
	System.out.println(	b.get(0));
}

	public static void main(String[] args) {
		TestGeneric g=new TestGeneric();
		g.testAdd();
		g.testSize();
		g.testChild();
		g.testSize();
		g.testBasicType();
	}

}
