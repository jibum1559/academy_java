package com.kh.IteratorPracitce;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> sports = new ArrayList<>();
		
		sports.add("축구");
		sports.add("농구");
		sports.add("배구");
		sports.add("테니스");
		
		Iterator<String> iter = sports.iterator();
		
	 	while(iter.hasNext()) {
			String spo = iter.next();
			System.out.println(spo);
		}
	 	
	 	//요소 삭제
	 	iter = sports.iterator();
	 	while(iter.hasNext()) {
	 		String spo = iter.next();
	 		if(spo.equals("테니스")) {
	 			iter.remove();
	 		}
	 		System.out.println(spo);
	 	}
	 	
	 	System.out.println("삭제 후 출력");
	 	for(String d : sports) {
	 		System.out.println(d);
	 	}
	 	
	 	
	 	
	 	//ArrayList 출력
	 	
	 	
		
	}

}
