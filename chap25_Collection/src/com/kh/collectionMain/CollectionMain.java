package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		//List 
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		System.out.println("List : ");
		
		// 향상된 for문 활용해서 출력
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		// set 예제
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2); //중복된 요소는 허용하지 않음

		for(Integer number : mySet) {
			System.out.println(number);
		
		}
		//Map 예제
		Map<String, Integer>  myMap = new HashMap<>();
		//	Map<String, Integer>  //순서가 자기 맘대로 막 나옴
		myMap.put("중국",   123);
		myMap.put("일본",   90);
		myMap.put("한국",   1);
		myMap.put("미국",   2);
		myMap.put("스페인", 45);
		myMap.put("러시아", 5000);
		myMap.put("스페인", 42);
		myMap.put("스페인", 58);
		myMap.put("한국", 7);
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
		}
	}

}
