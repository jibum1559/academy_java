package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42); // set은 쓰지 않는다. ...왜?
		intBook.put(1); 
		int intValue = intBook.get(); //형 변환 필요 없음
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("ggggg");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("C++");
		String strValue = strBook.get();
		
		//제너릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고
		//출력할 수 있음
		System.out.println("Int    value : " + intValue); //가장 마지막에 나온 내용을 최종적으로 하나만 나오게 한 것
		System.out.println("String value : " + strValue); //가장 마지막에 나온 내용을 최종적으로 하나만 나오게 한 것
		
	}

}
