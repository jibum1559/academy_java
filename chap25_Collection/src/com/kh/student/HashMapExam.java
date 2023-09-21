package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		//containsKey, Value �� �־ ����غ���
		Map<String, Integer> studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
	
		//containsValue containsKey �� �⺻������ boolean �������� �Ǿ�����
		System.out.println(studentGrades.containsValue(92));
		System.out.println(studentGrades.containsKey("Bob"));
		//true false
		//Ư�� �л��� ���� �˻�
		//Map(�� �Ʒ� �ִ�) containsKey : �ʿ��� key(Ű), value(��) �� �ִ��� Ȯ���ϴ� ��
		String studentName = "Bob";
		//int studentScore = 92; �̷��� �߰��ؼ� containsKey(����) ������ �����ϸ� �� ���� ���� ����� ����. 
		//containsKey �߽����� �� ����ϴ� ���� �� �� ����
		//���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if(studentGrades.containsKey(studentName)) { //true false�� ���� ���θ� Ȯ�� �� �Ŀ�
			
			int grade = studentGrades.get(studentName); // �� �Ŀ� ó������
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
		}
		
		/*
		 Map.Entry �������̽��� �Բ� ���Ǵ� �������̽� 
		 getKey()   : ��ü�� Ű�� ��ȯ 
		 getValue() : ��ü�� ���� ��ȯ
		*/
		//��� �л��� ���� ���
		System.out.println("��ü �л� ���� : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) { //map, Map �ҹ��ڷ� �ϸ� ��ü, �빮�ڷ� �ϸ� �������̽�
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	
		//�л� ���� ����
		String StudentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(studentGrades + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
	    //System.out.println(StudentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		//�л� ����
		String removesStudent = "David";
		studentGrades.remove(removesStudent);
		System.out.println(removesStudent + "�� ������ �����߽��ϴ�.");
		
		//���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()){
			
			
		}
	}

}
