package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// Map <String, Integer>
		//		 ÀÌ¸§		  ³ªÀÌ
		// containsKey containsValue ÀÌ°Ç ¾î¶»°Ô..?
		
		Map<String, Integer> userInfo = new HashMap<>();
		
		userInfo.put("½Â¹ü",35);
		userInfo.put("½Â¹ì",32);
		userInfo.put("½ÂºÕ",30);
		userInfo.put("½Â¹ã",39);
		
		String userName = "½Â¹ã";
		
		if(userInfo.containsValue(userName)) {
			int userAge = userInfo.get(userName);
			System.out.println(userName + "ÀÇ ³ªÀÌ´Â " + userAge + "¼¼ ÀÔ´Ï´Ù.");
		} else {
			System.out.println(userName + "ÀÇ Á¤º¸¸¦ Ã£À» ¼ö ¾ø½À´Ï´Ù.");
		}
	}
}
