package com.kh.forsample;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		//구구단 만들기
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt(); //2
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt(); //4
		
		int result = 0; //최초 값을 0으로 줍니다. 
		for (int i = 1; i <= num2; i++) {
			result += num1;
			System.out.println(num1 + " * " + i + " = " + result);
		
		}
		*/
		//2~9단까지 연속으로 출력하기
		int dan = sc.nextInt();
		int result;
		for(int mul = dan; mul <= 9; mul++) {
			for(int num = 1; num <= 9; num++) {
				result = mul * num;
				System.out.println(mul + " * " + num + " = " + result);				
			}
			System.out.println();
		}
		
	}

}
