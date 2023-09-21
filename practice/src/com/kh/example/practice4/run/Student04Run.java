package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student03;

public class Student04Run {

	public static void main(String[] args) {

		Student03 student1 = new Student03();
		
		student1.setGrade(1);
		student1.setClassroom(3);
		student1.setName("리오넬 메시");
		student1.setHeight(171.5);
		student1.setGender('남');
		
		student1.information();
			
		
	}

}
