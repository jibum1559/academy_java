package com.kh.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ComparatorMain implements Comparator<String> {
	
	
	@Override
	public int compare(String num1, String num2) { //compareTo 오름차순으로 정렬해보기
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
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("cherry");
		str.add("banana");
		str.add("add");
		str.add("abcdefg");
		str.add("day");
		str.add("z");
		str.add("a");
		str.add("c");
		str.add("b");
		str.add("e");
		
		//Comparator를 사용해서 문자열을 정렬 1.길이 2.순서
		Collections.sort(str, new ComparatorMain());
		
		//정렬된 값 출력
		for(String s : str) {
			System.out.println(s);
		}
		
	}

}
