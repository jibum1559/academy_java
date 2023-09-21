package com.kh.scannersample;

import java.util.Scanner;

public class ScannerExme {

	public static void main(String[] args) {
		
		// 정수 두 개를 입력받아 , 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력
		Scanner sc = new Scanner(System.in);
		
		int intNum1, intNum2;
		
		System.out.println("첫 번째 정수를 입력해주세요");
		intNum1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력해주세요");
		intNum2 = sc.nextInt();

		System.out.println("두 수의 합은 : " + (intNum1 + intNum2));
		System.out.println("두 수의 차이는 : " + (intNum1 - intNum2));
		System.out.println("두 수의 곱은 : " + (intNum1 * intNum2));
		System.out.println("두 수의 나누기는 : " + (intNum1 / intNum2));
		System.out.println("두 수의 나머지는 : " + (intNum1 % intNum2));
	}
}
