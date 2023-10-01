package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListAndArray LAA = new ListAndArray();
		ListArray1();
		LAA.ListArray2();
	}
	
		//Array 예제
		public static void ListArray1() {
		int[] intArray = new int[2]; //크기가 2인 정수 배열 생성  //첫 번째부터 값을 정해줘야함 그래서 값을 3개 이상 넣으면 에러가 남
		intArray[0] = 1;
		intArray[1] = 2;
     // intArray[2] = 3;
		
		//Array 출력
		System.out.println("Array 요소 : ");
		
		for(int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		System.out.println(); //개행문자 포함돼있어 enter같은 역할을 한다.
		//List 예제				//빈 배열 리스트
		List<Integer> intList = new ArrayList<>(); //Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List 출력
		System.out.println("List 요소 : ");
		for (int num : intList) {
			System.out.println(num + " ");
			}
		}
	
	
		public void ListArray2() {
		//String으로 변경 후 Array와 List 출력해보기
		
		String string = "{딸기,사과,바나나}";
		String[] stringArray = new String[3];
		
		stringArray[0] = "딸기";
		stringArray[1] = "사과";
		stringArray[2] = "바나나";
		
		System.out.println("Array 요소 : ");
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + " ");
		}
		
		List<String> stringList = new ArrayList<>();
		stringList.add(0,"딸기");
		stringList.add(1,"사과");
		stringList.add(2,"바나나");
		stringList.add(3,"포도");
		stringList.add(4,"키위");
		stringList.add(5,"배");
		
		System.out.println("List 요소 : ");
		for(String j : stringList) {
			System.out.println(j + " ");
			
		}
	}
}

