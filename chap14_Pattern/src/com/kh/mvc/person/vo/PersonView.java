package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	 
	String userName;
	
	boolean nameCheck = false;
	
	public String getUserInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자의 이름을 입력하세요");
		
		while(!nameCheck) {

			userName = sc.nextLine();
			
			if (userName == "" || userName == null) {

				System.out.println("사용자의 이름이 빈값입니다. 다시 입력해주세요");
				
			} else if (userName.length() < 2) {
				
				System.out.println("사용자의 이름은 두글자 이상이여야 합니다. 다시 입력해주세요");

			} else {
				  
				nameCheck = true;
			
			}
		}
		
		return userName;
	}
	
	// 결과값 보여주기
	public void displayResult(String result) {
		System.out.println("사용자의 이름은 " + result + " 입니다.");
	}
}