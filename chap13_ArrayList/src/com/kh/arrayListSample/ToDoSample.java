package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 * toDoSample.java
 * ArrayList 이용해서
 * 할일 만들고 3개
 * 수정하고 (2개)
 * 지우고 (1)
 * 전부다 삭제하기
 */
public class ToDoSample {

	public static void main(String[] args) {
		ArrayList<String> schedule = new ArrayList<>();
		System.out.println("schedul : " + schedule);
		
		schedule.add("키즈카페 가기");
		System.out.println("최초 할일 : " + schedule);
		schedule.add("저녁 먹기");
		System.out.println("할일 추가 : " + schedule);
		schedule.add("축구 하기");
		System.out.println("마지막 할일 : " + schedule);
		

		schedule.set(0, "동물원 가기");		
		System.out.println("할일 수정 : " + schedule);
		
		String firstschedule = schedule.get(0); 
		System.out.println("첫 번째 할일 : " + firstschedule);
				
		int size = schedule.size();
		System.out.println("할일의 수  : " + size);
		
		schedule.remove(2);
		System.out.println("축구하기 제거  : " + schedule);
		
		//ArrayList 순회해서 요소출력
		for(String aaa : schedule);
		
		schedule.clear();
		System.out.println("모든 할일 제거  : " + schedule);
		
	}

}