package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class CompareStudentMain {

	public static void main(String[] args) {
		List<Student> std = new ArrayList();
		std.add(new Student("��1" , 17));
		std.add(new Student("��2" , 18));
		std.add(new Student("��3" , 19));
		
		for(Student student : std) {
			System.out.println(student);
		}
	}

}
