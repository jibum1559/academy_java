package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {

	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요.");
		return sc.nextDouble();
	}
	
	// 원의 둘레 = 반지름 x 2 x 3.14
	public void displayResult(double result) {
		System.out.println("원의 둘레 : " + result);
	}

	// 원의 넓이 = 반지름 x 반지름 x 3.14
	public void displayResult2(double result) {
		System.out.println("원의 넓이 : " + result);
	}
}