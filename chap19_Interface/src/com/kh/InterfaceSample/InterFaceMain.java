package com.kh.InterfaceSample;

import java.util.ArrayList;
import java.util.List;

public class InterFaceMain {

	public static void main(String[] args) {
		/*
		MyInterface myin ;
		myin = new MyInterface();
	    MyInterface 변수명 = new MyInterface(); 
	                         객체가 아니기 때문에 생성할 수 없음
		*/
 List<String> StringList = new ArrayList<>();
		MyInterface myin = new MyClass();
		myin.doMyInterFace();

	}

}