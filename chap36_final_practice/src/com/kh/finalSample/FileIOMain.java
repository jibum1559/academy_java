package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
					//두 번째 인자의 값이 boolean true 지정되면 해당 파일에 이어쓰기
			fw = new FileWriter("file.txt",true);
			fw.write(1000);
			fw.write(10000);
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		/* 이게 문제가 아니었음;;
		try {
			FileWriter fw = null;
			fw = new FileWriter("C:\\Users\\user1\\Desktop\\file.txt");
			fw.write("밑에 정수가 나오게 하려면 어떻게..?");
			fw.write(10000);
			fw.close();
			
			FileReader rd = new FileReader("C:\\Users\\user1\\Desktop\\file.txt");
			BufferedReader br = new BufferedReader(rd);
			
			String line;
			int line2;
			while((line = br.readLine()) != null) {
				System.out.println("line");
			}
			
			br.close();
			System.out.println("생성 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("생성 실패");
		} 
		*/
	}
}
