package com.test.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	private List<Course> courseToSelect;
	public SetTest() {
		this.courseToSelect=new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course[] c= {new Course(1,"thinking in java"),
					 new Course(2,"data structure"),
					 new Course(3,"crizy java lensen"),
					 new Course(4,"college english"),
					 new Course(5,"c++ language")};
		for (int i = 0; i < c.length; i++) {
			courseToSelect.add(c[i]);
		}
	}
	public void testSize() {
		System.out.println("index id name");
		for(int i=0;i<courseToSelect.size();i++) {
			Course temp=courseToSelect.get(i);
			System.out.println(i+" "+temp.getId()+" "+temp.getName());
		}
	}
	
	public void outputStudentCourse(Student courses) {
		System.out.println("你选的课程如下:");
		for(Course c:courses.getCourse()) {
			System.out.println("id:"+c.getId()+" name:"+c.getName());
		}
		
	}
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.testAdd();
		st.testSize();
		Student student=new Student(1, "小明");
		System.out.println("欢迎"+student.getName()+"同学选课!!请输入要选的三门课的id:");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int courseId=input.nextInt();
			/*
			 * Set集合里的Object是无序不重复的;
			 * 所以不能通过get来取出;
			 * 无论add多少次同一个对象,Set中只会存最初的那个对象(的引用);
			 */
			for (Course cts : st.courseToSelect) {
				if(cts.getId()==courseId) {
					//可以添加空对象student.getCourse().add(NULL);
					student.getCourse().add(cts);
				}
			}
		}
		st.outputStudentCourse(student);
	}

}
