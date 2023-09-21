package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain am = new PracticeMain();
//		am.practice1();
		am.practice2();
	}
	
	public void practice1() {
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\이름 셋.txt"); //경로 추가 
			//파일 쓰기
			w.write("파일이 생기는지 테스트");
			//파일 닫기
			w.close();
			
			//어기서 보던지 경로가 확실한 경로 = 절대경로
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\이름 셋.txt"); //(path +"//checkFile.txt"); 이 방법도 가능
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); //파일을 다 읽으면 닫아주기.
			
			System.out.println("파일 생성 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 실패");
		}
	}
	
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//파일 안에 내용 작성하기
		
		// File.separtor 
		// window : \
		// Linux or MacOs : /
		
		
		final String path = "C:\\Users\\user1\\Desktop"; //원하는 경로 설정
		String folderPath = path + "\\Userinfo_folder"; //원하는 경로 설정

		File f = new File(folderPath);
		// exists 이미 존재하는지 확인
		if(!f.exists()) {
				f.mkdir(); 
				System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
				System.out.println("폴더가 이미 존재합니다.");
		}
		
		FileWriter w;
		try {
			w = new FileWriter(folderPath + "김승범 고객님.txt");
			w.write("고객명 : 김승범");
			w.write("연락처 : 010-9910-2165");
			w.close();
			System.out.println("파일 생성 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
