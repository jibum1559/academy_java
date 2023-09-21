package com.kh.classSample;

public class Car {
	//1. 상태 필드 멤버변수
	String brand;     //브랜드
	String model;     //모델
	int speed;        //속도
	boolean engineOn; //엔진 상태
	
/* ==========================================
 * 멤버변수 밑에는 모두 메서드로 정의
 * */
	
	//2. 생성자는 메서드의 한가지 종류
	// 차를 볼 때 필수로 넣을 파라미터는 브랜드와 모델
	public Car(String brand, String model) {
		System.out.println("Car 정의");
		this.brand = brand; //차를 KN에서만 보겠다.
		this.model = model;//KN 에서 다양한 모델만 보겠다.
		this.speed = 100;
		this.engineOn = true;
		
	}
	
	
	public void startEngine() { //
		//System.out.println("엔진을 시동할 준비가 돼 있습니다!");
		//만약에 엔진이 true 엔진 시동
		System.out.println("차종은 " + brand + "입니다.");
		if(engineOn) {
			System.out.println("엔진을 시동합니다.");//출력 메소드 작성
		} else {//엔진이 false 이미 엔진이 켜져있다.
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
		
	}
	
	//가속 메서드
	public void acclerate(int amount) { 
		if(engineOn) {
			//엔진이 true면 지금 속도가 얼마다.
			speed += amount;
			System.out.println(amount + "속도 "+ speed +" 입니다.");
		} else {
			System.out.println("속도를 알 수 없음");
		}
		
		
		
	}
}