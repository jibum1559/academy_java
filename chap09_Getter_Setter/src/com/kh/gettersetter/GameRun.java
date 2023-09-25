package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		player1.setName("KH");
		//문제점 : 0-10 = -10
		player1.setHealth(10);
		player1.setAttackPower(10);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("ㅎㅎㅎ");
		player2.setHealth(80);
		player2.setAttackPower(-10);
		
		player2.displayInfo();
		
		System.out.println("attack!!!! 후");
		
		player1.attack(player2);
		
		player2.takeDamage(20);
	}

}