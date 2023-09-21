package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 am = new PracticeMain2();
		am.practic1();
		am.practic2();
		am.practic3();
		am.practic4();
		am.practic5();
	}
	
	public void practic1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); //Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº ¹¹¸ÔÁö "); 
		System.out.println(sb);
	}
	
	public void practic2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		sb.reverse();//	("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		System.out.println(sb);
		//System.out.println(sb.toString());
	
	}
	public void practic3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ? ¤¾¤¾ ³Ö±â
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		sb.insert(10, "? ¤¾¤¾¤¾");//	("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		System.out.println(sb.toString());
	
	}
	public void practic4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		sb.replace(2,3, ",,");//	("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		System.out.println(sb.toString());

	}
	public void practic5() {
		//¹®ÀÚ¿­ »èÁ¦ delete
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		sb.delete(1,3);// 1~3±îÁö // 0a1b2c3
		System.out.println(sb.toString());
	}
	
}
