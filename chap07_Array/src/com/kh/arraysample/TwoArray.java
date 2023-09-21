package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana", "cherry"} , 
				{"Grapes", "Orange", "strawberry"}, 
				{"Kiwi", "Mango", "PineApple"}
			}; 

		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < fruits[i].length; j++) {
				System.out.print(fruits[i][j] + " "); 
			}
			// 다음행으로 이동할 수 있게 enter용 출력 메소드 입력
			System.out.println(""); 
		}
	}
}