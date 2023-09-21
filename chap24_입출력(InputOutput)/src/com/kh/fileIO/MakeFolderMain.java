package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		//폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; //원하는 경로 설정
		//폴더 만들기
		File folder = new File(folderPath);
		
		// exists 이미 존재하는지 확인
		if(!folder.exists()) {
			folder.mkdir(); //mk 는 make의 줄임말 / dir(directory) 디렉토리 - 폴더, 카테고리, 분류하는 공간 / 폴더 등을 만드는 명령어 mkdir
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
			
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder\\Userinfo.txt");
			w.write("User 정보를 담는 곳입니다.");
			w.write("KH 학생");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}