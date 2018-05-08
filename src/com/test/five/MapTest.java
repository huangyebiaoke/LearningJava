package com.test.five;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	private Map<Integer,Student> student;
	public MapTest() {
		student=new HashMap<Integer,Student>();
	}
	public void testPut() {
		Scanner input =new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("input student id:");
			int id=input.nextInt();
			if(student.get(id)==null) {
				System.out.println("input student name:");
				String name=input.next();
				Student stu=new Student(id, name);
				student.put(id, stu);
				//System.out.println("success add student:"+student.get(id).getId()+" "+student.get(id).getName());
				i++;
			}else {
				System.err.println("the student add already!!");
				continue;
			}
		}
		System.out.println("sum students:"+student.size());

	}
	public void testKeySet() {
		//通过keyset返回map中所有key的set集合,在这里是返回student id;
		Set<Integer> keySet=student.keySet();
		for (Integer stuId : keySet) {
			Student stu=student.get(stuId);
			if(stu!=null) {
				System.out.println("student id:"+stu.getId()+" student name:"+stu.getName());
			}
			
		}
	}
	
	public void testRemove() {
		Scanner input =new Scanner(System.in);
		while(true) {
			System.out.println("please input student id you want to remove:");
			int stuId=input.nextInt();
			if(student.get(stuId)==null) {
				System.err.println("the student is null, please input again!!");
				continue;
			}
			student.remove(stuId);
			System.out.println("remove success!!");
			break;
		}
	}
	
	public void testEntrySet() {
		Set<Entry<Integer, Student>> entrySet=student.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println("student id:"+entry.getKey()+" student name:"+entry.getValue().getName());
			
		}
	}
	
	public void testModify() {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("please input student id you want to update:");
			int stuId=input.nextInt();
			if(student.get(stuId)==null) {
				System.err.println("the student is null, please input again!!");
				continue;
			}
			System.out.println("input student's new name:");
			String stuName=input.next();
			Student stu=new Student(stuId,stuName);
			student.put(stuId, stu);
			System.out.println("update success!!!");
			break;
		}
	}

	public static void main(String[] args) {
		MapTest mp=new MapTest();
		mp.testPut();
		mp.testKeySet();
//		mp.testRemove();
		mp.testModify();
		mp.testEntrySet();

	}

}
