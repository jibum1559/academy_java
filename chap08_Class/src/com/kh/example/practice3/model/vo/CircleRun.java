package com.kh.example.practice3.model.vo;

public class CircleRun {

	public static void main(String[] args) {
		// Circle 객체 생성
		Circle circle = new Circle();
		//Circle circle = new Circle(3.14, 1);
		
		//원의 크기 출력
		circle.getSizeOfCircle();
		
		//반지름 증가 및 크기 출력 
		circle.incrementRadius();
		
		//원의 면적 계산 및 출력
		circle.getAreaOfCircle();

	}

}