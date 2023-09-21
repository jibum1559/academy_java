package com.kh.example.practice4.model.vo;

public class Student {
	//1. 멤버 변수
	private int grade;
	private int classroom; 
	private String name;
	private double height;
	private char gender;
	  
	// 2. 생성자 Student()
	public Student() {
		//초기화 블럭을 이용해 각 필드 초기화 초기화블럭 {}
		{
			grade = 1; //grade를 1로 초기화
			classroom = 2;//classroom 2로 초기화
			name = "박성철"; //name 이름 초기화
			height = 180.5; //키 180.5 초기화
			gender = '남';	//성별 '남' 으로 초기화
		}
	}
	//3. 출력 메소드 + information() : void
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("반   : " + classroom);
		System.out.println("이름  : " + name);
		System.out.println("키   : " + height);
		System.out.println("성별  : " + gender);
	}
}