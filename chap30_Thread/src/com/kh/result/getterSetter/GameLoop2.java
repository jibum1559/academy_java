package com.kh.result.getterSetter;

public class GameLoop2 implements Runnable {
	 private static boolean isGameOver = false;
	 
	 public void endGame() {
		 this.isGameOver = true;
	 }
	@Override
   public void run() {
       //boolean isGameOver = false;
       while (!isGameOver) {
           // 게임 루프 내용
           int randomValue = new java.util.Random().nextInt(10); // 임의의 숫자 생성
           System.out.println("임의의 숫자: " + randomValue);

           // 게임 루프 지연 시간
           try {
               Thread.sleep(1000); // 1초 대기
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           
           /*
            try {
	            System.in.read();
	            //isGameOver = true;
	            gameLoop.setGameOver(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
            * */
       }
       System.out.println("게임 종료");
   }
}