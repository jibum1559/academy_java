package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

import com.kh.genericsMain.Box;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		PracticeMain am = new PracticeMain();
//		am.practice1();
		am.practice2();
	}
	public void practice1() {
		ArrayList<String> strName = new ArrayList<>();
		strName.add("김승범");
		strName.add("아빠");
		strName.add("할아버지");
		
		ArrayList<Integer> intAge = new ArrayList<>();
		intAge.add(31);
		intAge.add(33);
		intAge.add(60);
		
		printMy(strName);
		printMy(intAge);
		
	}
	
	public static <T> void printMy(ArrayList<T> list) {
		for(T My : list) {
			System.out.println(My);
		}
	}
	
	public void practice2() {
		// Box 객체를 com.kh.genericspractice; 밑에 생성
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		// 문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각 각 출력
		//향상된 for문 이용해서 값 모두 출력
		
		Box<Integer> intBox = new Box<>();
		
		intBox.put(2);
		intBox.put(6);
		intBox.put(3);
		int intNum = intBox.get();
		
		Box<String> strBox = new Box<>();
		strBox.put("고양이");
		strBox.put("토끼");
		strBox.put("강아지");
		String strNum = strBox.get();
		
		System.out.println("Int num : " + intNum);
		System.out.println("String num : " + strNum);
		
	}
}
