package com.kh.inheriance.calculator;

public class Calculator2 {
	int num1, num2;
	
	public int add() {
		return num1 + num2;
	}
	public int subtract() {
		return num1 - num2;
	}
	public int multiply() {
		return num1 * num2;
	}
	public int division() {
		if(num1 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
		return num1 / num2;
	}
}
