package com.kh.inheritance.animal;

public final class Monkey extends Animal {
	public Monkey (String name) {
		super(name);//상위 클래스(Animal)의 멤버에 접근하는 데 사용
	}
	
	public void speak() {
		System.out.println(getName() + "  (무시)");
	}
	
	@Override
	public void sleep() {
		System.out.println(getName() + " 거꾸로 자니 떨어짐 유의 ");
	}
	public void eat() {
		System.out.println(getName() + " 먹이많이먹음.");
	}
	public void out() {
		System.out.println(getName() + " 먹이많이먹음.");
	}
}
