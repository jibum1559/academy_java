package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요. : ");
		int age = sc.nextInt(); //정수만 받는 next

		System.out.print("이름을 입력해주세요. : ");
		String name, phoneNumber;
		name = sc.next();
		System.out.print("핸드폰 번호를 입력해주세요. : ");
		phoneNumber = sc.next();

		System.out.println("저의 나이는 " + age + "살 입니다.");
		System.out.println("이름은 " + name + "이고, 핸드폰 번호는 " + phoneNumber + " 입니다.");
		System.out.println("연락하고 싶으신 분은 언제든 연락주세요^^*");
		System.out.println();
		
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		System.out.println("정보를 기입해주세요.");
		System.out.print("취미 : ");
		String habby = sc.next();
		System.out.print("좋아하는 음식 : ");
		String food = sc.next();
		System.out.print("주소 : ");
		String address = sc.next();
		
		
		
	}

}
