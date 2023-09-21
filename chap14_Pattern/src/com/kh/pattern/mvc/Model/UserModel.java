package com.kh.pattern.mvc.Model;

public class UserModel {
	/* 1. 유저 정보 표현
	 * private 이름 나이
	 * getter setter 만들기
	 * */
	private String name;
	private int age;
	
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}