package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {
/*
com.kh.objExam
	PracticeMain
	public void practice1
		Scanner 이용해서 
			equals if
			hashcode
			toString
 * */
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		// practice1();

	}
	public void practice1() {
		//Scanner 이용해서 두 개의 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 문자열을 입력하세요.");
		String str1 = sc.nextLine();
		System.out.println("두 번째 문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		sc.close();
		
		// 문자열 비교
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		// 문자열의 해시 코드 출력
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("첫 번째 문자열의 해시코드 : " + hashCode1);
		System.out.println("두 번째 문자열의 해시코드 : " + hashCode2);
		
		//문자열의 문자열 표현 출력
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("첫 번째 문자열의 문자열 표현 : " + str1String);
		System.out.println("두 번째 문자열의 문자열 표현 : " + str2String);
	}

}