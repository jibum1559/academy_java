package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class CompareStudentMain {

	public static void main(String[] args) {
		List<Student> std = new ArrayList();
		std.add(new Student("°í1" , 17));
		std.add(new Student("°í2" , 18));
		std.add(new Student("°í3" , 19));
		
		for(Student student : std) {
			System.out.println(student);
		}
	}

}
