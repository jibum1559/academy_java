package com.kh.result.getterSetter;

public class GameMain {
    private static boolean isGameOver = false;
    public static boolean isGameOver() {
		return isGameOver;
	}
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스 생성
//    	GGMain simpleGame = new GGMain();

    	GameLoop gameLoop = new GameLoop();
		//Thread gameThread = new Thread(new GameLoops());
		Thread gameThread= new Thread(gameLoop);
		
        // 게임 루프 스레드 시작
        gameThread.start();

        // 게임 종료 조건: 플레이어가 Enter 키를 누를 때
        // 여기에서는 단순히 Enter 키를 누르면 게임이 종료됩니다.
        System.out.println("게임을 종료하려면 Enter 키를 누르세요.");
        try {
            System.in.read();
            //isGameOver = true;
            gameLoop.setGameOver(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}