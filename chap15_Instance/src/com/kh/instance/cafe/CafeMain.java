package com.kh.instance.cafe;
// 인스턴스 3개 만들고 출력하기

public class CafeMain {

	public static void main(String[] args) {
								//사이즈 설탕여부
		Cafe client1 = new Cafe("아메리카노", "벤티 사이즈", false);
		Cafe client2 = new Cafe("카페라떼", "기본 사이즈", true);
		Cafe client3 = new Cafe("초코라떼", "기본 사이즈", false);
		
		
		client1.OderCoffee();
		client2.OderCoffee();
		client3.OderCoffee();
	}

}
