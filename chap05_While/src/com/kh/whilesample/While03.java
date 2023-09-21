package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		
		//반복적으로 출력
		int num1 = 1;
		while(num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		/*
		 i++ 일 때 i가 1인 값을 먼저 대입했기 때문에 ++가 작동하지 않음. 그래서 무한 루프 발생
		 ++1 일 때는 i에 +1을 먼저 대입하여 1~10까지 출력 가능. 무한 루프 발생하지 않음		
		*/
	}
}
