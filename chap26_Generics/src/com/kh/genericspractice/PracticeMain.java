package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

import com.kh.genericsMain.Box;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain am = new PracticeMain();
//		am.practice1();
		am.practice2();
	}
	public void practice1() {
		ArrayList<String> strName = new ArrayList<>();
		strName.add("��¹�");
		strName.add("�ƺ�");
		strName.add("�Ҿƹ���");
		
		ArrayList<Integer> intAge = new ArrayList<>();
		intAge.add(31);
		intAge.add(33);
		intAge.add(60);
		
		printMy(strName);
		printMy(intAge);
		
	}
	
	public static <T> void printMy(ArrayList<T> list) {
		for(T My : list) {
			System.out.println(My);
		}
	}
	
	public void practice2() {
		// Box ��ü�� com.kh.genericspractice; �ؿ� ����
		// ������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		// �� �� ���
		//���� for�� �̿��ؼ� �� ��� ���
		
		Box<Integer> intBox = new Box<>();
		
		intBox.put(2);
		intBox.put(6);
		intBox.put(3);
		int intNum = intBox.get();
		
		Box<String> strBox = new Box<>();
		strBox.put("�����");
		strBox.put("�䳢");
		strBox.put("������");
		String strNum = strBox.get();
		
		System.out.println("Int num : " + intNum);
		System.out.println("String num : " + strNum);
		
	}
}
