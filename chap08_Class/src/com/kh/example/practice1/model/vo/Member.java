package com.kh.example.practice1.model.vo;

public class Member {
	/*
	1.멤버변수
	- memberId : String
	- memberPwd : String
	- memberName : String
	- age : int
	- gender : char
	- phone : String
	- email : String
	2. 생성자
	+ Member()
	3. 출력 메소드
	+ changeName(name:String):void
	+ printName():void
	 * */
		/* 1.멤버변수 */
		String memberId;
		String memberPwd;
		String memberName;
		int    age;
		char   gender;
		String phone; //int String 차이점 
		String email;
		/* 2. 생성자 + Member() */
		public Member() {
		}
		/*
		public Member(char gender) {
			this.gender = gender;
		}
		*/
		/*
		 3. 출력 메소드
			+ changeName(name:String):void
			+ printName():void
		 * */
		public void changeName(String memberName) {
			this.memberName = memberName;
		}
		// printName():void
		public void printName() {
			System.out.println("이름 : " + memberName);
		}
		
	}
