package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	
	@Override
	public int compare(String num1, String num2) {
		//���̰� ������ 0 ��ȯ
		if(num1.length() == num2.length()) {
			return 0;
		}
		//num1�� num2���� ��� ��� ��ȯ
		else if(num1.length() > num2.length()) {
			return 1;
		}
		//num1�� num2���� ª���� ����
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// List ArrayList ���� Comparator ����
		List<String> user = new ArrayList<>();
		user.add("�¹�");
		user.add("������");
		user.add("�϶�̾�");
		user.add("����̴Ͼƺ�");
		
		Collections.sort(user, new User());
		
		for(String u : user) {
			System.out.println(u);
		}
		
	}

}
