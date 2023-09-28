package com.kh.overloadingEx;

public class ConOverloading {
	
	private String name;
	private int age;
	
	//생성자 5개 만들기!
	//1. 매개변수가 없는 생성자
	public ConOverloading() {
		name = "no name";
		age = 0;
	}
	
	//2. 이름만 초기화 하는 생성자
	public ConOverloading(String newName) {
		this.name = newName;
		this.age = 0;
	}

	//3. 이름과 나이를 초기화하는 생성자
	public ConOverloading(String newName, int newAge) {
		this.name = newName;
		this.age = newAge;
	}
	//4. 이름은 새로 만들지만 나이는 초기화 하는 생성자!
	public ConOverloading(int newAge) {
		this.name = "no name";
		this.age = newAge;
	}
	
	public static void main(String[] args) {
		//객체이자 인스턴스 생성
		ConOverloading obj1 = new ConOverloading();
		ConOverloading obj2 = new ConOverloading("이름");
		ConOverloading obj3 = new ConOverloading("3번",3);
		ConOverloading obj4 = new ConOverloading(4);
		
		
	}
}