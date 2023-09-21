package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer> userInfo = new HashMap<>(); // ***Map�� HashMap ������ �ٸ��� new HashMap�� �ϴ� ����**
		//������ �̸��� ����
		userInfo.put("�¹�", 35);    // ***put�� �ǹ�***
		userInfo.put("�¹�", 20);
		userInfo.put("�º�", 19);
		userInfo.put("�»�", 27);
		
		//Ư�� ���� �˻�
		String userName = "�»�";
		//��� ������ ���� ���
		if (userInfo.containsKey(userName)) {     // ***containsKey, Value �ǹ�***
			int userAge = userInfo.get(userName);
			System.out.println(userName + "�� ���̴� " + userAge + "�� �Դϴ�.");
		} else {
			System.out.println(userName + "�� ���̸� �� �� �����ϴ�.");
		}
		System.out.println();
		
		//���� ���� ���� (���̸� �߸� �Է����� �� �����ϴ� �κ�), �켱 ��ü ���� ��ȸ�� �غ���
			System.out.println("��ü ���� Ȯ��");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) { // ***E(e)ntry ����***
			String name = entry.getKey();	// ***Key, Value, get ����***
			int age = entry.getValue();
			System.out.println(name + " : " + age + "��");
		}
		System.out.println();
		
		String userUpdate = "�¹�";
		int updateAge = 22;
		userInfo.put(userUpdate, updateAge); // ***put ����***
		System.out.println(userUpdate + " ������ ���̸� " + updateAge + "���� �����߽��ϴ�.");
		System.out.println();
		
		//���� Ż��
		String removesUser = "�»�";
		userInfo.remove(removesUser);
		System.out.println(removesUser + " ������ ��� ������ ������ �Ϸ��߽��ϴ�.");
		System.out.println();
		
		//���� ���� �̸� ���� ���
		System.out.println("���� ���� ���� : ");
		for (Map.Entry<String, Integer> entry2 : userInfo.entrySet()) {
			String finalUserName = entry2.getKey();
			int finalUserAge = entry2.getValue();
			System.out.println(finalUserName + " : " + finalUserAge + "��");
		}

	}

}
