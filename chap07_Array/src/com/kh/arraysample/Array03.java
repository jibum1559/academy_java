package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/**
		 문자열을 입력받아서 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇번째 인덱스에 위치하는지 인덱스 출력하지
		 
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		
		String inputString = sc.next();
	
		System.out.println("검색할 문자를 입력하세요");
		char searchChar = sc.next().charAt(5);
	
		System.out.println("5번 째 글자는 " + searchChar);
		// toCharArray -> 문자열을 문자 배열로 변환하는 역할
		// 문자열을 -> 문자로 변환;
		char[] charString = inputString.toCharArray(); 

		// 검색할 문자가 
		// 문자열에 몇 개 들어가 있는지 개수와 -> length
		int charCount = charString.length;
		System.out.println(charCount);
		
		// 중복된 문자 갯수
		int count = 0;
		
		// 몇 번째 인덱스에 위치하는지 인덱스 출력하기 -> 인덱스 체크
		for (int i = 0; i < charCount; i++) {
		
			// 반복문을 통해 문자 array에 담긴 글자중 검색된 문자와 동일한게 있는지 체크
			if (charString[i] == searchChar) {
				System.out.println("index : " +  i);
				// 동일한 문자가 있다면 몇개가 들어있는지 체크하기위해 카운트 증가
				count++;
			}
		}
		
		System.out.println(searchChar + " 라는 단어는  " +  count + "개 있습니다.");
		
	}
}