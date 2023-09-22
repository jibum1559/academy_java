package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceLste();
		pc.practiceSet();
		pc.practiceMap();
		
	}
	public void practiceLste() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 for문 출력하기
		pList.add("사자");
		pList.add("호랑이");
		pList.add("토끼");
		pList.add("토끼");
		System.out.println("동물의 왕국 : ");
		
		for(String animal : pList) {
			System.out.println(animal);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 for문 출력, 중복된 값 add 해야함
		pSet.add("사자");
		pSet.add("호랑이");
		pSet.add("토끼");
		pSet.add("토끼");
		System.out.println("사자 호랑이 사이에 토끼 2마리,,");
		
		for(String animal2 : pSet) {
			System.out.println(animal2);
		}
		
	}
	public void practiceMap() {
		//키와 값을 이용해서 map put 한 다음 향상된 for문 출력해보기
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("김승범", 35);
		myMap.put("김승범", 39);
		myMap.put("임호정", 26);
		myMap.put("김민수", 36);
		myMap.put("서광원", 27);
		myMap.put("주서경", 23);
		myMap.put("주서경", 33);
		
		for(String studentAge:myMap.keySet()) {
			int age = myMap.get(studentAge);
			System.out.println(studentAge + " : " + age);
		}
	}
	
}
