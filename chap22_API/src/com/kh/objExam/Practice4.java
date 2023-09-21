package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 am = new Practice4();
		am.practice1();
		am.practice2();
		am.practice3();
		am.practice4();
		am.practice5();
		
	}
	public void practice1() { //년월일 yyyy-MM-dd
		SimpleDateFormat abc = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("년월일 : " + abcDate);
	}
	public void practice2() { //시분초 HH:mm:ss
		SimpleDateFormat abc = new SimpleDateFormat("HH시 mm분 ss초");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("시분초 : " + abcDate);
		
	}
	public void practice3() { // 월일 MM:dd
		SimpleDateFormat abc = new SimpleDateFormat("MM월 dd일");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("월일 : " + abcDate);
		
	}
	public void practice4() { // 연도-시간 yyyy-HH
		SimpleDateFormat abc = new SimpleDateFormat("yyyy년도");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("연도 : " + abcDate);
		
	}
	public void practice5() { // 년-월-일 요일 yyyy-MM-dd (E)
		SimpleDateFormat abc = new SimpleDateFormat("yyyy년 MM월 dd일 (E요일)");
		Date currentDate = new Date();
		String abcDate = abc.format(currentDate);
		System.out.println("년월일 요일 : " + abcDate);
		
	}
}

//https://wakestand.tistory.com/523 날짜 참고 url