package com.kh.abstractSample;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	//ťýźşŔÚ
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	//Ăßťó¸Ţź­ľĺ ą¸Çö
	@Override
	public double calculateArea() {
		return width * height;
	}
	
}