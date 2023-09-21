package com.kh.variable;

import java.util.Iterator;

public class VariableConversion {

	public static void main(String[] args) {
		//1. 자동형변환(암시적형변환, 묵시적형변환)
		int intNum = 110;
		System.out.println(intNum);
		int longNum = intNum;
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;
		System.out.println(doubleNum);
		
		// int -> long 변경하는 형변환 2가지 만들고 출력하기
		int intNum1 = 5200;
		int longNum1 = intNum1;
		int intNum2 = -1200;
		int longNum2 = intNum2;
		System.out.println("longNum1 : " + longNum1);
		System.out.println("longNum2 : " + longNum2);
		//short-> int 변경하는 형변환 1가지 만들고 출력하기
		short shortNum1 = 500;
		System.out.print("shortNum : ");
		System.out.println(shortNum1);
		int intNum5 = shortNum1;
		System.out.println(intNum5);
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		float floatNum2 = 3.14f;
		System.out.println(floatNum2);
		double doubleNum2 = floatNum2;
		System.out.println(doubleNum2);
		
		//2. 명시적 형변환(강제 형변환)
		
		//long -> int
		long largeLong = 192333333344449L;
		int largeInt = (int)largeLong;
		System.out.println(largeInt);
	
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
		
		char chr = 'A';
		int intChr = chr;
		System.out.println(intChr);
		
		char charValue2 = 'B';
		int intValue2 = charValue2;
		System.out.println(intValue2);
		
		char charValue3 = 'C';
		int intValue3 = charValue3;
		System.out.println(intValue3);
		
		char charValue4 = 'D';
		int intValue4 = charValue4;
		System.out.println(intValue4);
		
		char charValue5 = 'E';
		int intValue5 = charValue5;
		System.out.println(intValue5);
		
		// double -> int로 형변환  1개 출력
		
		//int를 short로 형변환 1개 출력		
		
		double doubleNum3 = 3325.113345;
		int intNum3 = (int)doubleNum3;
		System.out.println(intNum3);
		
		int intNum4 = 20020404;
		short shortNum2 = (short) intNum4;
		System.out.println(shortNum2);
		
	}

}
