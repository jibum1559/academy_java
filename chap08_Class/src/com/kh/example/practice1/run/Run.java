package com.kh.example.practice1.run;
//import com.kh.example.practice1.model.vo.Member;
import com.kh.example.practice1.model.vo.Member;

public class Run {
/*
실행용 메소드로 기본 생성자를 통해 Member type의
객체를 생성하고 changeName()를 이용해 값 변경 후
printName()를 이용해 출
* */
	public static void main(String[] args) {
		// 1. Member 객체를 생성
		/*
		 만약에 char 값을 넣고 싶으면 '' 를 넣어줘야함 ex) '남' '여'
		 * Member member = new Member('남');*/
		Member member = new Member();
		//member.memberId();
		// 2. changeName() 값 변경
		member.changeName("뉴네임");
		// 3. printName()를 이용해 출력
		member.printName();

	}

}