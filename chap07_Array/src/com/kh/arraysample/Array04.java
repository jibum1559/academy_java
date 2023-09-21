package com.kh.arraysample;

public class Array04 {

public static void main (String[] args) {
		
		// Array 예제
		// 						       0	  1 	  2	    3     4
//		String[] ints
		/**
		 * 예제 String[] fruitArray = {"사과", "딸기", "키위", "메론", "귤"};
		 * 사과에는 바나나
		 * 딸기에는 수박
		 * 키위에는 레몬
		 * 메론에는 귤
		 * 귤에는 오렌지
		 */
		// 초기 array
		String[] fruitArray = {"사과", "딸기", "키위", "메론", "귤"};
		// 각 인덱스별 변경될 데이터
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		
		// 인덱스별로 변경된 데이터 출력
		for (int i =0 ; i < fruitArray.length; i++) {
			System.out.println("fruitArray[" + i + "] : " + fruitArray[i] );
		}

	}
}

