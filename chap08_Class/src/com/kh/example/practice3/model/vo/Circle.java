package com.kh.example.practice3.model.vo;

public class Circle {
	//필드(멤버변수)
	double PI = 3.14; //원주율
	int radius = 1;	  //반지름
	
	//생성자
	public Circle() {
		//기본 생성자, 아무런 초기화를 진행하지 않고 진행
	}
	
	//메소드
	public void incrementRadius() {
		radius++;
		System.out.println("radius : " + radius);
	}
	public void getAreaOfCircle() {
		 double area = PI * radius * radius;
		 System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		 System.out.println("원의 반지름: " + radius);
	}
}