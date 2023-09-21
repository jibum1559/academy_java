package com.kh.switchsample;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 사용자로부터 점수를 입력받아 점수가 90이상이면 'A', 90미만 80이상이면 'B', 
		 80미만 70이상이면 'C', 70미만 60이상이면 'D', 그 미만이면 'F'를 출력하는 Code를 작성하라.
		*/
		
		System.out.println("점수를 입력하면 성적을 출력합니다.");
		int score = sc.nextInt();
		String grade;
		switch(score/10) {
			case 9 : case 10 : 
				grade="A";
				break;
			case 8 : 
				grade="B";
				break;
			case 7 : 
				grade="C";
				break;
			case 6 : 
				grade="D";
				break;
			default :
				grade="F";
		}
		System.out.println("당신의 성적은 " + grade + " 학점 입니다.");
		
	}

}
