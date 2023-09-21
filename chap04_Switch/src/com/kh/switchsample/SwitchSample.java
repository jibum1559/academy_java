package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch문
		/*
		 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 switch 문은 일련의 case 문과 해당 값을 비교하여 일치하는 경우에 해당하는 코드 블록을 실행
		 각 case문 뒤에는 일치하는 값이나 표현식이 나옴
		 
		 switch (변수 또는 표현식) {
		 	case 값1 :
		 		//값1에 해당하는 코드
		 		 break; //해당 블록의 실행을 중단하는 역할
		 	case 값2 : 
		 		//값2에 해당하는 코드
		 		 break;
			default :
				//위 모든 케이스와 일치하지 않을 때 실행되는 코드
		 }
		 */
		int september = 17;
		switch (september) {
			case 4: case 11: case 18: case 25:
			System.out.println("하.. 월요일입니다..");
			break;
			
			case 5: case 12: case 19: case 26:
				System.out.println("아직 화요일이에요..");
			break;
			
			case 6: case 13: case 20: case 27:
				System.out.println("이제 반왔네. 수요일입니당.");
			break;
			
			case 7: case 14: case 21: case 28:
				System.out.println("드디어.. 목요일이다..!");
			break;
			
			case 1: case 8: case 15: case 22: case 29:
				System.out.println("불금!!!!!!!!");
			break;
			
			case 2: case 9: case 16: case 23: case 30:
				System.out.println("즐거운 토요일~~~~");
			break;
			
			case 3: case 10: case 17: case 24:
				System.out.println("일요일이라 좋긴 좋은데 무언가 불편한..");
			break;
			
			default:
				System.out.println("월에 최대 31일까지 밖에 없어요~~");
				
		}
		
		// 커피를 주문할게요.
		/*
		 1번을 선택하면 아메리카노
		 2번을 선택하면 카페  라떼
		 3번을 선택하면 아인슈페너
		 4번을 선택하면 흑당버블티
		 * */
		
		int choice = 1;
		switch (choice) {
			//1번을 선택하면 아메리카노
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			//2번을 선택하면 카페 라떼
			case 2:
				System.out.println("카페 라떼를 주문하셨습니다.");
				break;
			//3번을 선택하면 아인슈페너
			case 3:
				System.out.println("아인슈페너를 주문하셨습니다.");
				break;
			//4번을 선택하면 흑당버블티
			case 4:
				System.out.println("흑당 버블티를 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}		
		
	}

}
