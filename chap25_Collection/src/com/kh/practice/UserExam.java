package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// Map <String, Integer>
		//		 �̸�		  ����
		// containsKey containsValue �̰� ���..?
		
		Map<String, Integer> userInfo = new HashMap<>();
		
		userInfo.put("�¹�",35);
		userInfo.put("�¹�",32);
		userInfo.put("�º�",30);
		userInfo.put("�¹�",39);
		
		String userName = "�¹�";
		
		if(userInfo.containsValue(userName)) {
			int userAge = userInfo.get(userName);
			System.out.println(userName + "�� ���̴� " + userAge + "�� �Դϴ�.");
		} else {
			System.out.println(userName + "�� ������ ã�� �� �����ϴ�.");
		}
	}
}
