package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
					//�� ��° ������ ���� boolean true �����Ǹ� �ش� ���Ͽ� �̾��
			fw = new FileWriter("file.txt",true);
			fw.write(1000);
			fw.write(10000);
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		/* �̰� ������ �ƴϾ���;;
		try {
			FileWriter fw = null;
			fw = new FileWriter("C:\\Users\\user1\\Desktop\\file.txt");
			fw.write("�ؿ� ������ ������ �Ϸ��� ���..?");
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
			System.out.println("���� �Ϸ�");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� ����");
		} 
		*/
	}
}
