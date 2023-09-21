package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//		String
//	private int a; // 인스턴스 변수
//	private String b; // 참조 변수
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// 최초 메세지 보여주는거 출력하고
		view.displayMessage();
		// 스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);

		// 숫자 추측하는 값을 입력하자
		view.displayGuessPromt();
		int guess = sc.nextInt();
		
		// 만약에 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
		while(true) { //false가 될 때까지 반복
		//boolean isTrue = true;
			if(model.inCorrectGuess(guess)){ //"guess"가 입력한 숫자값이 정답일 때)
				view.displayCorrectGuess();
				view.displayAttempts(model.getAempt());
				//isTrue = false;
				break;
			} else {
				// 컴퓨터가 생각한 숫자와 내가 입력하는 숫자가 틀렸을 때 view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAempt());
			}
			view.displayGameOver();
		}
		
		// 컴퓨터가 생각한 숫자와 내가 입력하는 숫자가 틀렸을 때 view
	//	view.displayInCorrectGuess();
	//	view.displayAttempts(model.getAempt());
		
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}
