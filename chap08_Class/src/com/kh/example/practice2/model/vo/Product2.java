package com.kh.example.practice2.model.vo;

public class Product2 {
/*

+  Product()
+  information() : void

 * */
	private String pname;
	private int    price;
	private String brand;
	
	public Product2(String pname, int price, String brand) {
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	//3. 정보 출력 메소드 만들기
	//+ information() : void 
	public void information() {
		//sysout + ctrl + space => 자동완성
		System.out.println("상품명 : " + pname);
		System.out.println("가격   : " + price + "원");
		System.out.println("브랜드  : " + brand);
	}
}