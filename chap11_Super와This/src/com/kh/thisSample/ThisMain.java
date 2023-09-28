package com.kh.thisSample;
/*
 * 		int x = 10; //정수 x 를 10값 할당
		int y = x; // 참조변수 y x를 가르킨다. x의 값을 출력하듯 x를 참조했다는 느낌
		
		x = 20;
	//  y = x;	
		System.out.println("y :" + y);
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2 list1
 this 	객체(=인스턴스) 자신을 가리키는 참조변수 객체(=인스턴스)의 주소가 저장
 this() 현재 클래스의 다른 생성자를 호출하는데 사용
 */

class MyClass {
	int myField; //int this.myField 원래 이러한 형태
	
	//첫 번째 생성자 
	//default 생략(같은 페이지에서 끝낼거기 때문)
	MyClass() {
		//this.myField = 0;
		this(0); //this() 사용해서 다른 생성자 호출
	}
	
	MyClass(int value) {
		this.myField = value; //값을 대입해서 사용할 것으로 참조변수이다.
	}
	
	void printValue() {
		System.out.println("myField의 값 : " + this.myField);
	}
}


public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // 첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); // 두 번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();
		
	}

}