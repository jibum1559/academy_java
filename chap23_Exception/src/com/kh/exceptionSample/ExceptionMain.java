package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
//		exmain.ExceptionA();
//		exmain.ExceptionN();
//		exmain.ExceptionF();
		exmain.ExceptionExam();
	}
	public void ExceptionA() {
		try {
			int result = 10 / 0; //0으로 나누는 시도
			System.out.println("Result : " + result);
			
		} catch (ArithmeticException e) {
			/*
			 ArithmeticException 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e : e는 우리가 지정한 변수명 
			 e로 지정한 변수로 메세지를 getMessage() 로 전달받는다.
			 
			 *(에러코드)
			  Exception in thread "main" java.lang.ArithmeticException: / by zero
			  at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:6)
			 */
			System.out.println("산술 연산으로 인해 발생한 에러!! " + e.getMessage());
		}
	}
	
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length();
			//내용이 없는데 text로부터 문자열의 길이를 얻기
			System.out.println("문자열 길이 : " + length);
		} catch (NullPointerException abc) {
			System.out.println("빈 값입니다. 번호는 넣으셔야죠?");
			//System.out.println("빈 값임!!!! " + abc.getMessage());
		}
	}
	
	public void ExceptionF() {
			//050904
		try {
			String juminNumber = "공오공904"; // 공오공 String 들어있음
			int number = Integer.parseInt(juminNumber); // 문자열을 정수로 변환 시도
			System.out.println("숫자 : " + number); //안에 String이 들어있기 떄문에 실행이 되지 않음
		} catch (NumberFormatException aaa) {
			System.out.println("숫자만 입력하세요.");
			System.out.println("NumberFormatException 발생 : " + aaa.getMessage());
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; // 인덱스 넘버
			int result = numbers[index]; //배열 요소에 접근
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			//배열 인덱스가 범위를 벗어났을 때 발생하는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생~!"); //지역변수이기 때문에 밑에 또 사용 가능
		} catch(Exception e) {
			//다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		} finally {
			//항상 실행되는 블록 //꼭 넣지 않아도 되는 부분
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료되었습니다.");
	} 
}
