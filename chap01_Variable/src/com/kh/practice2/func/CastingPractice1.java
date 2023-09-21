package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		//키보드로 문자 하나를 입력 받아 그 문자의 숫자를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		/* 
	    System.out.print("문자 : " );
		String chr;
		chr = sc.next();
		char chr2 = chr.charAt(0);
		
		System.out.print("A unicode : " + (int)chr2);
		*/
		
		System.out.print("문자 : " );
		char inputChar = sc.next().charAt(0); //입력받은 문자 출력
		
		int changeChar = inputChar;
		System.out.print("입력문자 : " + inputChar + "유니코드 : " + changeChar);
		
	}
}
