package com.kh.example.practice7;

import java.util.ArrayList;

/*
* ArrayList 이용해서 빨주노초파남보
* 수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
* 더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
* 향상된 for문 이용해서 색상 출력하기
* 최 후 출력 빨 파 보
*/
public class ArrayList3_1 {

	public static void main(String[] args) {
		
		//타입 및 객체 생성
		ArrayList<String> rainbow = new ArrayList<>();
		System.out.println("rainbow : " + rainbow);
		
		//요소 추가
		rainbow.add("빨간색");
		System.out.println("빨간색 추가 : " + rainbow);
		rainbow.add("주황색");
		System.out.println("주황색 추가 : " + rainbow);
		rainbow.add("노란색");
		System.out.println("노란색 추가 : " + rainbow);
		rainbow.add("초록색");
		System.out.println("초록색 추가 : " + rainbow);
		rainbow.add("파랑색");
		System.out.println("파랑색 추가 : " + rainbow);
		rainbow.add("남색");
		System.out.println("남색 추가 : " + rainbow);
		rainbow.add("보라색");
		System.out.println("보라색 추가 : " + rainbow);
		
		System.out.println();
		
		//구간 별 요소 수정
		rainbow.set(1, "블랙");
		rainbow.set(3, "브라운");
		rainbow.set(5, "그린");
		System.out.println("색상 수정 : " + rainbow);
		
		System.out.println();
		
		//원하는 위치에 요소 추가
		rainbow.add(1, "옐로우");
		System.out.println("옐로우 더하기 : " + rainbow);
		rainbow.add(6, "연한 파랑");
		System.out.println("연한 파랑 더하기 : " + rainbow);
		
		System.out.println();
		
		//요소의 개수를 확인
		int size = rainbow.size();
		System.out.println("색상의 개수 : " + size);
		
		//원하는 요소를 제거하여 최종 결과값 출력
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
		System.out.println("최종 남은 색상 : " + rainbow);
	}
	
}
