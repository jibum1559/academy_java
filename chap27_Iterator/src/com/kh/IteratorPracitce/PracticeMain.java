package com.kh.IteratorPracitce;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> sports = new ArrayList<>();
		
		sports.add("�౸");
		sports.add("��");
		sports.add("�豸");
		sports.add("�״Ͻ�");
		
		Iterator<String> iter = sports.iterator();
		
	 	while(iter.hasNext()) {
			String spo = iter.next();
			System.out.println(spo);
		}
	 	
	 	//��� ����
	 	iter = sports.iterator();
	 	while(iter.hasNext()) {
	 		String spo = iter.next();
	 		if(spo.equals("�״Ͻ�")) {
	 			iter.remove();
	 		}
	 		System.out.println(spo);
	 	}
	 	
	 	System.out.println("���� �� ���");
	 	for(String d : sports) {
	 		System.out.println(d);
	 	}
	 	
	 	
	 	
	 	//ArrayList ���
	 	
	 	
		
	}

}
