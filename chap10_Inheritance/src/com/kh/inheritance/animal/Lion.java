package com.kh.inheritance.animal;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void action() {
		System.out.println(getName() + " 사냥을 할때 목을 물어뜯습니다");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " 는 먹이를 먹을때 뼈까지 씹어먹습니다.");
	}
	
}