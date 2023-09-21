package com.kh.overloadingEx;
/*
 * java 파일을 만드는데 
 * 파일명 : OverSample.java 만들고
 * 오버로딩 5개 만들고 메서드 5개 출력하기
 * */
public class OverloadingSample {
	//정수형 덧셈
	public int sum(int a, int b) {
		return a+b;
	}

	//세 개의 정수형 덧셈
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	//두 개의 실수형 덧셈
	public double sum(double a, double b) {
		return a+b;
	}
	public double sum(double a, double b,double c) {
		return a+b+c;
	}
	public double sum(double d, double e, double f, double g, double h) {
		return d+e+f+g+h;
	}
	public static void main(String[] args) {
		OverloadingSample obj = new OverloadingSample();
		
		// 메서드 호출
		System.out.println("두 정수의 합 : " + obj.sum(10,20));
		System.out.println("세 정수의 합 : " + obj.sum(10, 20, 30));
		System.out.println("두 실수의 합 : " + obj.sum(10.5, 10.5));
		System.out.println("두 실수의 합 : " + obj.sum(10.5, 10.5,10.5));
		System.out.println("오 실수의 합 : " + obj.sum(10.5, 10.5,10.5, 10.5,10.5));
	}

}