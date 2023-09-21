package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		PracticeResize pm = new PracticeResize();
		pm.myPractice();
		pm.studentPractice();
		pm.myTestPractice();
	}
		//이미지 하나 불러오기
		//바탕화면에 새로운 폴더 만들기 mkdir
		//새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더안에 저장하기
		
		public void myTestPractice() {
			//공부 후에 작성해보고 밑에거랑 비교해보자
			
		}
	
		public void studentPractice() {
			String path = "C:\\Users\\user1\\Desktop\\";
			String inputImg = path + "Windy.jpg";
			
			//아웃풋 이미지 저장할 폴더 생성
			String dirPath = "C:\\Users\\user1\\Desktop\\HeartGold";
			File dir = new File(dirPath);
			boolean success = dir.mkdir();
			
			if(success) {
				System.out.println("폴더생성완료");
			} else {
				System.out.println("폴더생성실패");
			}
			
			//아웃풋 파일 새로만든 폴더에 생성
			String outputImg = dirPath + "\\reSizeWindy.jpg";
			
			int width = 100;
			int height = 100;
			
			try {
				BufferedImage originImg = ImageIO.read(new File(inputImg));
				
				Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
				
				BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				
				bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
				
				ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
				
				System.out.println("완료완료");
				
			} catch (Exception e) {
				System.out.println("오류 : " + e.getMessage());
			}

		}

		public void myPractice() {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "love.jpg";
		String outputImg = path + "reSizeLove.jpg";
		
		//리사이즈할 이미지 크기 설정하기
		int width = 500;
		int height = 500;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg)); 
			
			Image resizeImg = bufImg.getScaledInstance(width, height, BufferedImage.TYPE_INT_BGR);
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0, null);
			
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료");
			
		} catch(Exception e) {
			System.out.println("이미지 리사이즈 중 오래 발생" + e.getMessage());
		}
		
		String folderPath = path + "love_folder\\";
		File newFolder = new File(folderPath);
		
		boolean success = newFolder.mkdir();
		
		if(success) {
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
		
		
		
		String ipFile = path + "reSizeLove.jpg";
		String op = folderPath + "reSizeLove.jpg";

		
		try {
			FileInputStream fis = new FileInputStream(ipFile);
			FileOutputStream fos = new FileOutputStream(op);

			byte[] buffer = new byte[1204];
			int byteRead;
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}