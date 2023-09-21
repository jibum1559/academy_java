package com.kh.mvc.circle.mo;

public class CircleModel {

	private double number;
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	// 원의 둘레 = 반지름 x 2 x 3.14
	public double Circle() {
		return number * 2 * 3.14;
	}
	
	// 원의 넓이 = 반지름 x 반지름 x 3.14
	public double Circle2() {
		return number * number * 3.14;
	}
}