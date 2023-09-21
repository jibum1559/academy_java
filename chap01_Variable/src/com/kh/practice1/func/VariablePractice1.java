package com.kh.practice1.func;

import java.util.Scanner;
 
public class VariablePractice1 {
	public static void main(String[] args) {
	//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	Scanner sc = new Scanner(System.in);
	
	String name;
	System.out.print("이름을 입력하세요. : ");
	name = sc.next();
	
	String sex;
	System.out.print("성별을 입력하세요(남/여). : ");
	sex = sc.next();
	
	int age;
	System.out.print("나이를 입력하세요. : ");
	age = sc.nextInt();
	
	double height;
	System.out.print("키를 입력하세요(cm). : ");
	height = sc.nextDouble();
	
	System.out.print("키 " + height + "cm인 " + age + "살 " + sex + "자 " + name + "님 반갑습니다^^");
	

		
	}
}
