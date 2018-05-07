package com.test.five;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<Course> course;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
		this.course=(Set) new HashSet<Course>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}

}
