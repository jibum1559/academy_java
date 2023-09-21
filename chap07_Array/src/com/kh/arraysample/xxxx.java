package com.kh.arraysample;

import java.util.Scanner;

public class xxxx {
	/*
	 * 문자열을 입력받아서 문자 하나하나 배열에 넣고 
	 * 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 
	 * 몇번째 인덱스에 위치하는지 인덱스 출력하지
	*/
	public static void main (String[] args) {
		System.out.println("문자열을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] aArray = a.toCharArray();
		
		int aLength = aArray.length;
		
		System.out.println("문자열을 한번 더 입력해주세요.");
		char aSearch = sc.next().charAt(8);
		System.out.println("3번에 위치한 문자는 : " + aSearch);
		 
		int count = 0;
		
		for (int i = 0; i < aLength; i++) {
			if(aArray[i] == aSearch) {
				System.out.println("[" + aSearch + "]의 index 위치 : " + i);
				count++;
			}
		}
		System.out.println("[" + aSearch + "]의 문자와 중복되는 문자의 수는 " +  + count + "개 입니다.");
		
	}
}