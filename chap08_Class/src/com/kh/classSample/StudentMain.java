package com.kh.classSample;

//import com.kh.classSample.Student; //패키지가 같기 때문에 import를 쓰지 않아도 가능
public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
//public Student(String name, int age, String grade) {
		 Student student1 = new Student("kh학생",20,"1학년");
		 
		//학생 정보 출력
		 student1.displayInfo();

	/*
	 * 학생을 3명 만들어서 3명 출력하기
	 * student2, student3, student4
	 * 각각의 이름과 나이와 학년을 displayInfo(); 를 사용해서 출력하세요.
	 */
		 Student student2 = new Student("kh메인",21,"2학년");
		 student2.displayInfo();
		 Student student3 = new Student("kh메보",22,"3학년");
		 student3.displayInfo();
		 Student student4 = new Student("kh댄싱",23,"4학년");
		 student4.displayInfo();

		 

	}

}
