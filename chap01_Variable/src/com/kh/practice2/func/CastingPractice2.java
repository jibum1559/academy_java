package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		//실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double num1 = sc.nextDouble();
		System.out.print("영어 : ");
		double num2 = sc.nextDouble();
		System.out.print("수학 : ");
		double num3 = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(num1+num2+num3));
		System.out.println("평균 : " + (int)(num1+num2+num3)/3);
		
		/* int averageScore = (int)(num1 + num2 + num3);
		int totalScore = (averageScore / 3);
		System.out.print("국어점수 : "); 
		*/
		
	}
}
