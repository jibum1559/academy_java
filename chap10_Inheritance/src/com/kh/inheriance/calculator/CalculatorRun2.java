package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int firstNumber = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int secondNumber = sc.nextInt();
		
		CalculatorForMod2 cal = new CalculatorForMod2();
		
		cal.num1 = firstNumber;
		cal.num2 = secondNumber;
		
		int result = cal.add();
		int result2 = cal.subtract();
		int result3 = cal.multiply();
		int result4 = cal.division();
		int result5 = cal.mod();
		
		System.out.println("���ϱ� �� : " + result);
		System.out.println("���� �� : " + result2);
		System.out.println("���ϱ� �� : " + result3);
		System.out.println("������ �� : " + result4);
		System.out.println("������ �� : " + result5);
	}

}
