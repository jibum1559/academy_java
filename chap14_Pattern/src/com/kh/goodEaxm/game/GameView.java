package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = "숫자 맞추기 게임을 시작합니다.";
	private String GuessNum = "추측한 숫자를 입력하세요.";
	private String Correct = "숫자를 맞췄습니다.";
	private String InCorrect = "틀렸습니다. 다시 시도하세요.";
	private int Attempts;
	private String GameOver = "게임 종료";

	public void displayMessage() {
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1에서 100 사이의 숫자를 맞춰보세요.");
		
	}
	// 숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임 종료
	// 1. 숫자 추측하는 값 입력하기
	public void displayGuessPromt() {
		System.out.println("추측한 숫자를 입력하세요.");
		
	}
	public void displayCorrectGuess() {
		System.out.println("숫자를 맞췄습니다.");
	}
	public void displayInCorrectGuess() {
		System.out.println("틀렸습니다. 다시 시도하세요.");
		
	}
	public void displayAttempts(int attempts) {
		System.out.println("시도횟수 : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("게임종료");
	}
	
}
