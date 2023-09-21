package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);//상위 클래스(Animal)의 멤버에 접근하는 데 사용
	//잠을 잡니다.
	}
	
	public void run() {
		System.out.println(getName() + "주인이와서 달린다!");
	}
	@Override 
	//animal에 적혀있는 eat을 고양이 안에서만 다시 정의를 내린다.
	public void eat() {
		System.out.println(getName() + " 먹는데 중간에 먹이통을 뺏을것");
	}
}