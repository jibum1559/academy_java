package com.kh.inheritance.animal;

public class DogAnimal {

	//인스턴스 변수
	String name; //강아지의 이름
	int age;	// 강아지의 나이
	
	//생성자 메서드
	public DogAnimal(String name, int age) {
		this.name = name;// this 키워드를 사용해서 인스턴스 변수에 값을 할당
		this.age = age;// this 키워드를 사용해서 인스턴스 변수에 값을 할당
		//name = "0";
		//age = 0;
	}
	
	//출력 메서드
	public void printInfo() {
		System.out.println("강아지이름 : "+ name);
		System.out.println("강아지나이 : " + age);
	}
	



public static void main(String[] args) {
	//Dog 클래스의 객체(=인스턴스) 생성
	DogAnimal myDog = new DogAnimal("멍멍이", 3);
	DogAnimal yourDog = new DogAnimal("왈왈이",2);
	
//각각의 객체(=인스턴스)에 인스턴스 변수 접근해서 정보를 출력
	myDog.printInfo();
	yourDog.printInfo();

}

}
