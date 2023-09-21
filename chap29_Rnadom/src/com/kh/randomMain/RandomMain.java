package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
   ���� : �������� ������� ��
 */
public class RandomMain {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	public void Lotto() {
		Random rd = new Random();// ���� ��ü ����
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();  // �ߺ��� ���ϱ� ���� set�� ����� �� ����
		
		
		// 6���� ���ڸ� �� ��
		//int six = 6; �ζ� ��ȣ �� �� ���� ������ �����ؼ� �ؿ� 6��� six ���� �� ����
		while(lottoNum.size() < 6) { //0,1,2,3,4,5
			// 1~45 ������ �����ؼ� ������ ����
			// ���⿡ 6�� ���� ä������ �ʾƼ� ��� �ݺ��Ǵ� ��
			int ranNumber = rd.nextInt(45) + 1; //0~44 �ڸ��� �������� ��ȣ ��
			System.out.println(ranNumber);
			
			// while�� ������ġ
			// �����ϴ��� ���� �ߺ�x, �ߺ��� ���� LIST�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) {
				// !�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
		    
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
		
	}
	public void RandomExam() {
		Random rd = new Random();// ���� ��ü ����
		
		//1. ���� ���� ������ ������ ������ �����߰ڴ�.
		int ranInt = rd.nextInt(100); //0~99 ���̿��� 1���� �� ��
		System.out.println(ranInt);

		//2. �Ǽ� ���� ������ ������ ������ �����߰ڴ�.
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		//3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
			
	}
	
}
