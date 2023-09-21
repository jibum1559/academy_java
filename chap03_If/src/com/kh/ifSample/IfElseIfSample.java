package com.kh.ifSample;

public class IfElseIfSample {

	public static void main(String[] args) {
		// if-else if-else
		/*
		 여러 개의 조건을 연속적으로 평가
		 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		 만약 if나 else if 의 조건도 참이 아니라면 마지막 else 블록 실행
		 
		 if (조건1) {
		 	//조건1이 참일 때 실행되는코드
		} else if (조건2) {
			//조건2가 참일 때 실행되는 코드
		} else {
			//위의 모든 조건이 거짓일 때 실행되는 코드
		}
		 * */
		/*
		if (20살) {
			해외여행 갈거야!
		} else if (내가 20살보다 많다면) {
			해외여행을 갈거야
		} else {
			나 집에 있을거야
		}
		*/
		int age = 19;
		if(age >= 20 && age < 33) {
			System.out.println("세계 여행을 갈거야");
		} else if(age >= 33) {
			System.out.println("유럽 축구 한번 보고 오자");
		} else {
			System.out.println("집에나 있자...");
		}
		
		int month = 9;
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("크리스마스가 있는 겨울이야*^^*");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("예쁜 벚꽃이 피고 지는 봄이지~~!");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("시원한 물놀이를 할 수 있는 여름이다!");
		} else
			System.out.println("옷입기 딱 좋은 계절인 가을이야>o<");
		
			
		
		
	}

}
