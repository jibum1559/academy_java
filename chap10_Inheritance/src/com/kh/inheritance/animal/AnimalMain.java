package com.kh.inheritance.animal;

public class AnimalMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("뚜뚜");
		System.out.println("======================================");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		myDog.sleep();
		System.out.println("======================================");
		
		Cat mycat = new Cat("야옹이");
		mycat.run();
		mycat.eat();
		System.out.println("======================================");
		
		Lion myLion = new Lion("사자앙");
		myLion.action();
		myLion.eat();
		System.out.println("");
		System.out.println("======================================");
		
		System.out.println();
		Monkey System = new Monkey("몽키키");
		System.out();
		System.eat();
		System.sleep();
	}

}