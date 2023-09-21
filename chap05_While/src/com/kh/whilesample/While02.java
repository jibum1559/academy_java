package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int month;
		boolean choice = false;
		while(!choice) {
		System.out.print("숫자를 입력해주세요. : ");
		month = sc.nextInt();
		
		switch(month) {
			case 12 : case 1 : case 2 :
				System.out.println("겨울 입니다.");
				choice = true;
				break;
			case 3 : case 4 : case 5 :
				System.out.println("봄 입니다.");
				choice = true;
				break;
			case 6 : case 7 : case 8 :
				System.out.println("여름 입니다.");
				choice = true;
				break;
			case 9 : case 10 : case 11 :
				System.out.println("가을 입니다.");
				choice = true;
				break;
			default:
				System.out.println("다시 선택해주세요.");
			}
		} */
		
		/*
		 놀이공원을 입장하는데 9살 이상만 티켓을 구매할 수 있기 때문
		 나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류하고 출력하기
		 while switch case 이용해서 출력하기
		 이외 나이는 다시 입렵하세요. 만들기.
		 */
		
		int age;
		boolean result = false;
		while(!result) {
			System.out.print("안녕하세요. 롯데월드 입니다. 나이를 입력해주세요. : ");
			age = sc.nextInt();

			switch(age) {
				case 19 : case 20 :
					System.out.println("성인 입니다.");
					result = true;
					break;
				case 14 : case 15 : case 16 : case 17 : case 18 :
					System.out.println("청소년 입니다.");
					result = true;
					break;
				case 10 : case 11 : case 12 : case 13 :
					System.out.println("어린이 입니다.");
					result = true;
					break;
				default :
					System.out.println("다시 입력해주세요.");
				
			}
		}
		
	}
		
}
