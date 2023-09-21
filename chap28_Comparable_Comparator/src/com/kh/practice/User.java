package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	
	@Override
	public int compare(String num1, String num2) {
		//길이가 같으면 0 반환
		if(num1.length() == num2.length()) {
			return 0;
		}
		//num1이 num2보다 길면 양수 반환
		else if(num1.length() > num2.length()) {
			return 1;
		}
		//num1이 num2보다 짧으면 음수
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// List ArrayList 생성 Comparator 정리
		List<String> user = new ArrayList<>();
		user.add("승범");
		user.add("동선이");
		user.add("하라미야");
		user.add("손흥미니아빠");
		
		Collections.sort(user, new User());
		
		for(String u : user) {
			System.out.println(u);
		}
		
	}

}
