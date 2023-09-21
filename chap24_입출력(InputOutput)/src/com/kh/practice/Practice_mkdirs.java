package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
	}
	public void Practice1(){
		//폴더 연속으로 2개 만들기 C:\\Users\\user1\\Desktop\\이름1\\이름2
		//1. 생성할 폴더의 주소를 정한다
		String dirPath = "C:\\Users\\user1\\Desktop\\school\\studentInfo";
		
		//2.file 객체 생성
		File dir = new File(dirPath);
		
		//mkdirs 메서드를 사용해서 디렉토리 생성시도
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("폴더 생성 성공.");
		} else {
			System.out.println("폴더 생성 실패.");
		}
		
	}
	public void Practice2() {
		//폴더 연속으로 3개 만들기 C:\Users\\user1\Java_Workspace\\chap25
		//1.생성할 폴더의 주소를 정한다.
		String aPath = "C:\\Users\\user1\\Desktop\\aaa\\bbb\\ccc";
		//2.file 객체 생성
		File dir = new File(aPath);
		
		//3.mkdirs 메서를 사용해서 디렉토리 생성시도
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공.");
		} else {
			System.out.println("폴더 생성 실패.");
		}	
	}
	
		public void Practice3() {
			//폴더 연속으로 5개 만들기 C:\\Users\\user1\\Documents\myPlace\Music\Korean\KPOP\Group
			String dirPath = "C:\\Users\\user1\\Documents\\My\\name\\is\\seung\\beom";
			File dir = new File(dirPath);
			
			boolean success = dir.mkdirs();
			
			if(success) {
				System.out.println("폴더 생성 성공.");
			} else {
				System.out.println("폴더 생성 실패.");
			}
	}

}
