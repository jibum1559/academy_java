package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int firstNumber = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int secondNumber = sc.nextInt();
		
		CalculatorForMod2 cal = new CalculatorForMod2();
		
		cal.num1 = firstNumber;
		cal.num2 = secondNumber;
		
		int result = cal.add();
		int result2 = cal.subtract();
		int result3 = cal.multiply();
		int result4 = cal.division();
		int result5 = cal.mod();
		
		System.out.println("더하기 값 : " + result);
		System.out.println("빼기 값 : " + result2);
		System.out.println("곱하기 값 : " + result3);
		System.out.println("나누기 값 : " + result4);
		System.out.println("나누기 몫 : " + result5);
	}

}
