package com.kh.abstractSample.Animal;

public abstract  class Animal {
	//필드 String name;
	private String name;
	//생성자 
	public Animal(String name) {
		this.name = name;
	}
	//추상메서드 동물소리출력 void makeSound();
	public abstract void makeSound();
	//일반메서드 동물이름출력 void displayName();
	public void displayName() {
		System.out.println("동물이름 : " + name);
	}
}