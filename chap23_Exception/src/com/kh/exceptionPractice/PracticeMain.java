package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain am = new PracticeMain();
//		am.ArithException();
//		am.NPException();
//		am.NumFormatException();

		
	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		try {
			int result = (dividend / divisor);
			System.out.println("나누었을 때 : " + result);
		} catch(ArithmeticException e1) {
			System.out.println("산술 연산으로 인한 에러 발생!");
			System.out.println("ArithmeticException 에러 발생 : " + e1.getMessage());
		}
	}
	
	public void NPException() {
		String text = "Hello World";
		String subText = null;
		//int length = text.length(); //Hello world 길이 얻기
		
		try {
			//indexOf는 subText 안에 있는 null 값을 포함한 문자열 검색
			int length = text.indexOf(subText);
		} catch(NullPointerException e2) {
			System.out.println("NullPointerException 에러 발생 : " + e2.getMessage());
		}
		
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			//부적절한 형식의 문자열을 정수로 변환
			System.out.println(number);
		} catch(NumberFormatException e3) {
			System.out.println("문자형으로 인한 에러 발생 : " + e3.getMessage());
			System.out.println("숫자형으로 입력해주세요.");
		}
	}

	
}
