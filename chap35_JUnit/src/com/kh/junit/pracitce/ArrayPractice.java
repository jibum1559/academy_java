package com.kh.junit.pracitce;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	private int[] arr;	//배열을 멤버변수로 선언

	//생성자 이용해서 멤버변수 초기화
	public ArrayPractice() {
		arr = new int[10];
		//for문 추가
		for(int i = 0; i < arr.length; i++) {
			
			//arr[i] = i + 1;
			arr[i] = i + 1;
		}
	}
		//배열 값을 반환하는 메서드
	public int[] getArray() {
		return arr;
	
	}
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("占쎈펶占쎌벥 占쎌젟占쎈땾 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		String[] arr = new String[5];
		//String[] arr = {"占쎄텢�⑨옙", "域뱄옙", "占쎈７占쎈즲", "癰귣벊�똼占쎈툡", "筌〓챷�뇚"};
		
		arr[0] = "占쎄텢�⑨옙";
		arr[1] = "域뱄옙";
		arr[2] = "占쎈７占쎈즲";
		arr[3] = "癰귣벊�똼占쎈툡";
		arr[4] = "筌〓챷�뇚";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		char ch = '\u0000';
		String str = "";
		char[] arr = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�눧紐꾩쁽占쎈였 : ");
		str = scanner.nextLine();
		
		System.out.print("�눧紐꾩쁽 : ");
		ch = scanner.nextLine().charAt(0);
		
		arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print(str + "占쎈퓠 " + ch + "揶쏉옙 鈺곕똻�삺占쎈릭占쎈뮉 占쎌맄燁삼옙(占쎌뵥占쎈쑔占쎈뮞) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				
				count++;
			}
		}

		System.out.println();
		System.out.println(ch + "揶쏆뮇�땾 : " + count);
	}
	
	public void practice6() {
		int num = 0;
		String[] arr = {"占쎌뜞", "占쎌넅", "占쎈땾", "筌륅옙", "疫뀐옙", "占쎈꽅", "占쎌뵬"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 占쎄텢占쎌뵠 占쎈떭占쎌쁽 占쎌뿯占쎌젾 : ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num] + "占쎌뒄占쎌뵬");
		} else {
			System.out.println("占쎌삋筌륅옙 占쎌뿯占쎌젾占쎈릭占쎈�뀐옙�뮸占쎈빍占쎈뼄.");
		}
	}
	
	public void practice7() {
		int sum = 0;
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("占쎌젟占쎈땾 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("獄쏄퀣肉� " + i + "甕곕뜆�럮 占쎌뵥占쎈쑔占쎈뮞占쎈퓠 占쎄퐫占쎌뱽 揶쏉옙 : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("�룯占� 占쎈� : " + sum);
	}
	
	
	public void practice8() {
		int size = 0;
		int count = 1;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {			
			System.out.print("占쎌젟占쎈땾 : ");
			size = scanner.nextInt();

			if(size >= 3 && size % 2 == 1) { 
				arr = new int[size];
				
				for(int i = 0; i < arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				
				break;
				
			} else {
				System.out.println("占쎈뼄占쎈뻻 占쎌뿯占쎌젾占쎈릭占쎄쉭占쎌뒄.");
			}
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		Arrays.sort(arr);
		
		System.out.println("筌ㅼ뮆占썲첎占� : " + arr[9]);
		System.out.println("筌ㅼ뮇�꺖揶쏉옙 : " + arr[0]);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		String pId = "";
		char[] origin = null;
		char[] copy = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("雅뚯눖占쎌눖踰묉에�빖苡뀐옙�깈(-占쎈７占쎈맙) : ");
		pId = scanner.nextLine();
		
		origin = new char[pId.length()];
		
		for(int i = 0; i < origin.length; i++) {
			origin[i] = pId.charAt(i);
		}
		
		copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			if(i <= 7) { 
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			
			System.out.print(copy[i]);
		}
	}
}