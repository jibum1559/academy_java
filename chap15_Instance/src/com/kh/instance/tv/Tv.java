package com.kh.instance.tv;
//Tv 제작
public class Tv {
	//Tv 속성(필드)
	String color; //tv색상
	boolean power; //전원상태
	int channel; //채널
	
	//Tv 기능(메서드)
	public void power() {
		power = !power; //전원 상태
	}
	public void channerlUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}


/*
 멤버변수 => 변수 멤버들
 			참조형변수[나 또는 누군가가 만든 객체에 변수명 할당]
 			인스턴스형변수 [예약어 변수명 등등]
 */