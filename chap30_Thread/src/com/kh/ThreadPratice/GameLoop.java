package com.kh.ThreadPratice;

import java.util.Random;

class GameLoop implements Runnable{
	private boolean isGameOver = false;

	//public boolean isGameOver() {
	//	return isGameOver;
	//}
	
	public void setGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}

	@Override
	public void run() {
		while(!isGameOver) {
			//게임 루프 내용
			int randomValue = new Random().nextInt(10);//임의의 숫자 생성
			System.out.println("임의의 숫자 : " + randomValue);
			
			//게임 루프 지연 시간
			try {
				Thread.sleep(1000); //1초 대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게임 종료");	
		}
	}

}