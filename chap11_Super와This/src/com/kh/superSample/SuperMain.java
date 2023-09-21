package com.kh.superSample;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child(); 
		System.out.println("=================");
			
		Child child2 = new Child("홍길동");
		System.out.println("****************");
		
		
		child2.display();	
		//super.display(); 했을 때 어떻게 되는지
		//super.display(); 얘들 사용하고 싶다면 어떻게 해야하는지!
		//블로그 적을 숙제
		
		
		
			
	}

}