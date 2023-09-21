package com.kh.gettersetter.goodEaxm;

public class GameRun {
	
	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("KH");

		player1.setHealth(-10); //-10체력을 저장해주고
		player1.VaildHealth(); 
		//-10이 무결성(내가만든코드가 결점이 없는지)인지 검증한다.
		
		player1.setAttackPower(-20);
		player1.VaildAttackPower(); 
		
		player1.displayInfo();
		
		/* GameRun에서 player2에 Vaild 적용하기 */
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		player2.setHealth(80);
		player2.VaildHealth();
		player2.setAttackPower(10);
		player2.VaildAttackPower();
		player2.displayInfo();
		
		System.out.println("attack!!!! 후");
		
		
	}

}