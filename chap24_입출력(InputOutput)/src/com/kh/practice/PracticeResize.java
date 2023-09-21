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
		//�̹��� �ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� ����� mkdir
		//���� ���������� �̹��� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�
		
		public void myTestPractice() {
			//���� �Ŀ� �ۼ��غ��� �ؿ��Ŷ� ���غ���
			
		}
	
		public void studentPractice() {
			String path = "C:\\Users\\user1\\Desktop\\";
			String inputImg = path + "Windy.jpg";
			
			//�ƿ�ǲ �̹��� ������ ���� ����
			String dirPath = "C:\\Users\\user1\\Desktop\\HeartGold";
			File dir = new File(dirPath);
			boolean success = dir.mkdir();
			
			if(success) {
				System.out.println("���������Ϸ�");
			} else {
				System.out.println("������������");
			}
			
			//�ƿ�ǲ ���� ���θ��� ������ ����
			String outputImg = dirPath + "\\reSizeWindy.jpg";
			
			int width = 100;
			int height = 100;
			
			try {
				BufferedImage originImg = ImageIO.read(new File(inputImg));
				
				Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
				
				BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				
				bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
				
				ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
				
				System.out.println("�Ϸ�Ϸ�");
				
			} catch (Exception e) {
				System.out.println("���� : " + e.getMessage());
			}

		}

		public void myPractice() {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "love.jpg";
		String outputImg = path + "reSizeLove.jpg";
		
		//���������� �̹��� ũ�� �����ϱ�
		int width = 500;
		int height = 500;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg)); 
			
			Image resizeImg = bufImg.getScaledInstance(width, height, BufferedImage.TYPE_INT_BGR);
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0, null);
			
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ�");
			
		} catch(Exception e) {
			System.out.println("�̹��� �������� �� ���� �߻�" + e.getMessage());
		}
		
		String folderPath = path + "love_folder\\";
		File newFolder = new File(folderPath);
		
		boolean success = newFolder.mkdir();
		
		if(success) {
			System.out.println("���� ���� �Ϸ�");
		} else {
			System.out.println("���� ���� ����");
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
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}