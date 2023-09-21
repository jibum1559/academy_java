package com.kh.ifSample;

public class IfExam {

	public static void main(String[] args) {
		// if-else 
		/*
		 프로그램 조건에 따라 두 가지 서로 다른 코드 블록 중 하나를 실행하는 제어구조
		 만약 if 문의 조건이 참이면 if 내에 있는 블록이 실행이 되고, 조건이 거짓이면 else 블록이 실행이 된다.
		 이를 통해 두가지 상황에 따라 다른 동작을 수행할 수 있다.
		 if (조건) {
		 	//조건이 참일 때 실행되는 코드
		 } else {
		 	//조건이 거짓일 때 실행되는 코드
		 }
		 * */
		int age = 60;
		//만약에 내가 60보다 어리면 일을하고
		//내가 60이면 환갑잔치를 할거야
		//60보다 많으면 세계여행을 다닐거야.
		if (age == 60) {
			System.out.println("환갑잔치를 할거야");//60보다 크거나 같으면 실행
		} else {
			System.out.println("아직 멀었네...!");//60보다 작으면 실행
		}
		
		int temp = 21;
		if (temp >= 25) {
			System.out.println("더운 날씨 예상됩니다.");
		} else {
			System.out.println("적당한 날씨로 예상됩니다.");
		}

	}

}
