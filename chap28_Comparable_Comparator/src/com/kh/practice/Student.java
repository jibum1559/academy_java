package com.kh.practice;
//ComparExam - > User Student Actor rename
//implement compare 

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student otherStudent) {
		return this.age - otherStudent.age;
	}
	
	@Override
	public String toString() {
		return "Student name=" + name + ",age=" + age;
	}

}
