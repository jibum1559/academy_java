package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog gg = new Dog("멍멍이");
		gg.makeSound();
		System.out.println("============");
		//1. cat 만들기
		//Cat ct = new Cat("고양이");
		//2. 객체배열로 Animal 정의해서 출력하기 다형성을 활용한 객체 다루기
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("멍멍이");
		animal[1] = new Cat("야옹이");
		
		//소리 출력
		for(Animal a : animal) {
			a.displayName();
			a.makeSound();
			System.out.println();
		}
	}

}