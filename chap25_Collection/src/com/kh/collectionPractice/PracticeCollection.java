package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceLste();
		pc.practiceSet();
		pc.practiceMap();
		
	}
	public void practiceLste() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� for�� ����ϱ�
		pList.add("����");
		pList.add("ȣ����");
		pList.add("�䳢");
		pList.add("�䳢");
		System.out.println("������ �ձ� : ");
		
		for(String animal : pList) {
			System.out.println(animal);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� for�� ���, �ߺ��� �� add �ؾ���
		pSet.add("����");
		pSet.add("ȣ����");
		pSet.add("�䳢");
		pSet.add("�䳢");
		System.out.println("���� ȣ���� ���̿� �䳢 2����,,");
		
		for(String animal2 : pSet) {
			System.out.println(animal2);
		}
		
	}
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map put �� ���� ���� for�� ����غ���
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("��¹�", 35);
		myMap.put("��¹�", 39);
		myMap.put("��ȣ��", 26);
		myMap.put("��μ�", 36);
		myMap.put("������", 27);
		myMap.put("�ּ���", 23);
		myMap.put("�ּ���", 33);
		
		for(String studentAge:myMap.keySet()) {
			int age = myMap.get(studentAge);
			System.out.println(studentAge + " : " + age);
		}
	}
	
}
