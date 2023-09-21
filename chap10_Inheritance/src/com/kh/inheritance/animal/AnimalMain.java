package com.kh.inheritance.animal;

public class AnimalMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("´ó´óÀÌ");
		System.out.println("======================================");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		System.out.println("======================================");
		
		Cat mycat = new Cat("°í¾ß¹Ì");
		mycat.run();
		mycat.eat();
		System.out.println("======================================");
		
		Lion myLion = new Lion("»çÀð");
		myLion.action();
		myLion.eat();
		System.out.println("");
		System.out.println("======================================");
		
		System.out.println();
		Monkey System = new Monkey("¸ù¸ù");
		System.out();
		System.eat();
		System.sleep();
	}

}