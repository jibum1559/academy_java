package com.kh.example.practice4.model.vo;

public class Student03 {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("우리 " + classroom + "반에 축구 잘하는 " + gender + "자애가 " + "한명 있어!!");
		System.out.println("이름이 " + name + "이고 키가 " + height + "밖에 안되는데 발롱도르감이야!");
		System.out.println("축구로는 세계 " + grade + "등 이야~!");
	
		
	}
	
}
