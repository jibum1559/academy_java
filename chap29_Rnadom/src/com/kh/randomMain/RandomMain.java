package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Random : 난수를 생성하기 위해 사용되는 클래스
   난수 : 무작위로 만들어진 수
 */
public class RandomMain {

	public static void main(String[] args) {
		//로또 번호 생성기
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	public void Lotto() {
		Random rd = new Random();// 랜덤 객체 생성
		// ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();  // 중복을 피하기 위해 set을 사용할 수 있음
		
		
		// 6개의 숫자만 들어갈 것
		//int six = 6; 로또 번호 몇 개 뽑을 것인지 설정해서 밑에 6대신 six 넣을 수 있음
		while(lottoNum.size() < 6) { //0,1,2,3,4,5
			// 1~45 범위를 지정해서 난수를 생성
			// 여기에 6개 값이 채워지지 않아서 계속 반복되는 것
			int ranNumber = rd.nextInt(45) + 1; //0~44 자리에 랜덤으로 번호 하
			System.out.println(ranNumber);
			
			// while의 제어장치
			// 존재하는지 여부 중복x, 중복된 값이 LIST에 저장될 수 있음
			if(!lottoNum.contains(ranNumber)) {
				// !가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프
				lottoNum.add(ranNumber);
			}
		    
		}
		System.out.println("로또 번호 : " + lottoNum);
		
	}
	public void RandomExam() {
		Random rd = new Random();// 랜덤 객체 생성
		
		//1. 정수 범위 내에서 랜덤인 난수를 만들어야겠다.
		int ranInt = rd.nextInt(100); //0~99 사이에서 1개의 수 생
		System.out.println(ranInt);

		//2. 실수 범위 내에서 랜덤인 난수를 만들어야겠다.
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		//3. 불리언 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
			
	}
	
}
