package com.kh.classAM;

//import com.kh.classAM.AM;(자동으로 import됨)

/*
publicMethod
protectedMethod
defaultMethod
privateMethod
*/
public class OtherAM {
	public static void main(String[] args) {
		final int a = 1;
		System.out.println("a : " + a);
		//AM 생성
		AM am = new AM();
		
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		//am.privateMethod(); //다른 클래스에 존재하기 문에 출력이 안됨(보호의 의미가 있음)
		
		
		
	}
	

}