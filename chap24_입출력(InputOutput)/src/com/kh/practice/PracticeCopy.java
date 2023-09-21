package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후
//바탕화면에다가 폴더를 만들어서
//폴더 안에 복사한 이미지 저장하기!
public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy am = new PracticeCopy();
		am.prectice1();
		am.prectice2();
	}
		public void prectice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\Reallove.jpg";
		
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
		
		while ((byteRead = fis.read(buffer)) !=-1) {
			fos.write(buffer,0,byteRead);
		}
		System.out.println("파일 복사 완료");
		
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		}
		
		public void prectice2() {
			//바탕화면에 폴더 생성 후
			//만들어진 이미지 파일 이동
			String Path = "C:\\Users\\user1\\Desktop\\new_img";
			
			String inputFile = "C:\\Users\\user1\\Desktop\\love.jpg";
			String ss = Path+"\\love.jpg";
			
			File newFolder = new File(Path);
			
			boolean success = newFolder.mkdir();
			
			if(success) {
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("폴더 생성 실패");
			}
			
			try {
				FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(ss); 
				
				byte[] buffer = new byte[1024];
				int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1){
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
