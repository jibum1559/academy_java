package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;
public class ListAndListArrayList {

	public static void main(String[] args) {
		int[] myArray = new int[5]; //크기가 5인 배열 생성
		myArray[0] = 10; //첫번째 요소에 값을 전달
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10); //요소 추가
		int value = myList.get(0); // 첫번째 요소 추가
		myList.remove(0); //첫번째 요소 삭제
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("첫 번째");
		arrayList.add("두 번째");
		String value2 = arrayList.get(0); //첫번째 요소 가져옴
		arrayList.remove(1); //두번째 요소 삭제

	}

}