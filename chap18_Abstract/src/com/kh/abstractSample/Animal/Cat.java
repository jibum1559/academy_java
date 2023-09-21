package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	//»ý¼ºÀÚ
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("¾ß¿Ë");
	}
}