package com.kh.junit.pracitce;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arr;
	
	@Test
	public void testParctice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		arr = new ArrayPractice();
		//int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertArrayEquals(expected, arr.getArray());
	}

//	@Test
//	public void testPractice2() {
//		String[] expected = "��¹�, ��μ�, ������";
//		String[] actual = "��º�, �踸��, ������";
//		assertArrayEquals(expected, actual);
//	}
}


