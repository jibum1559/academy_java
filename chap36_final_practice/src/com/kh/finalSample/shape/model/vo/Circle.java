package com.kh.finalSample.shape.model.vo;

public class Circle {
	public static final double PI = 3.14;
	public double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	public double getRadius() {
		return radius;
	}
	
	public static double getPi() {
		return PI;
	}
	
	public void setRaidus(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println(radius);

	}

}
