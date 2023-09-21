package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer> userInfo = new HashMap<>(); // ***Map과 HashMap 조건이 다른데 new HashMap을 하는 이유**
		//유저의 이름과 나이
		userInfo.put("승범", 35);    // ***put의 의미***
		userInfo.put("승뱀", 20);
		userInfo.put("승붐", 19);
		userInfo.put("승빵", 27);
		
		//특정 유저 검색
		String userName = "승빵";
		//모든 유저의 나이 출력
		if (userInfo.containsKey(userName)) {     // ***containsKey, Value 의미***
			int userAge = userInfo.get(userName);
			System.out.println(userName + "의 나이는 " + userAge + "세 입니다.");
		} else {
			System.out.println(userName + "의 나이를 알 수 없습니다.");
		}
		System.out.println();
		
		//유저 나이 수정 (나이를 잘못 입력했을 때 수정하는 부분), 우선 전체 유저 조회를 해보자
			System.out.println("전체 유저 확인");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) { // ***E(e)ntry 숙지***
			String name = entry.getKey();	// ***Key, Value, get 숙지***
			int age = entry.getValue();
			System.out.println(name + " : " + age + "세");
		}
		System.out.println();
		
		String userUpdate = "승뱀";
		int updateAge = 22;
		userInfo.put(userUpdate, updateAge); // ***put 숙지***
		System.out.println(userUpdate + " 고객님의 나이를 " + updateAge + "세로 수정했습니다.");
		System.out.println();
		
		//유저 탈퇴
		String removesUser = "승빵";
		userInfo.remove(removesUser);
		System.out.println(removesUser + " 고객님의 모든 데이터 삭제를 완료했습니다.");
		System.out.println();
		
		//최종 유저 이름 나이 출력
		System.out.println("최종 유저 정보 : ");
		for (Map.Entry<String, Integer> entry2 : userInfo.entrySet()) {
			String finalUserName = entry2.getKey();
			int finalUserAge = entry2.getValue();
			System.out.println(finalUserName + " : " + finalUserAge + "세");
		}

	}

}
