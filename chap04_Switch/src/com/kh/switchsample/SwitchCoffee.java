package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while문을 활용한 switch
		
		boolean isChoice = false;
		while(!isChoice) {
		System.out.println("커피를 주문해주세요.");
		System.out.println("1.아이스 아메리카노 2.로얄 밀크티 3.자몽 허니 블랙티");
		int coffeNum = sc.nextInt();
			switch(coffeNum) {
				case 1:
					System.out.println("아이스 아메리카노 주문 받았습니다.");
					isChoice = true;
					break;
				case 2:
					System.out.println("로얄 밀크티 주문받았습니다.");
					isChoice = true;
					break;
				case 3:
					System.out.println("자몽 허니 블랙티 주문받았습니다.");
					isChoice = true;
					break;
				default:
					System.out.println("잘못 주문하셨습니다. 주문번호를 다시 눌러주세요.");
					
			}
		}
		
	}

}
