package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod {

	public static void main(String[] args) {

		/**
		 *  scanner 이용해서 코드 변경하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요");
		int firstInput = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int secondInput = sc.nextInt();
		
//		Calculator cal = new Calculator();
		CalculatorForMod cal = new CalculatorForMod();
		cal.num1 = firstInput;
		cal.num2 = secondInput;

		int result = cal.add();
		int result1 = cal.substruct();
		int result2 = cal.multiply();
		int result3 = cal.divide();
		int result4 = cal.mod();

		System.out.println("Add : " + result);
		System.out.println("substruct : " + result1);
		System.out.println("multiply : " + result2);
		System.out.println("divide : " + result3);
		System.out.println("mod : " + result4);
	}

}