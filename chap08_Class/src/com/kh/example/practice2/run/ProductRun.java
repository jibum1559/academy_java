package com.kh.example.practice2.run;
//improt는 최초 1회만 맨 위에 작성
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
/*
		System.out.println("상품명 : " + pname);
		System.out.println("가격   : " + price + "원");
		System.out.println("브랜드  : " + brand);
* */
	public static void main(String[] args) {
		// Product 생성 3개 하고
		//각각 상품명 가격 브랜드명 출력하기
		
		Product product1 = new Product("비비고",7900,"DJ");
		System.out.println("Product 정보 : ");
		product1.information();
		
		Product product2 = new Product("배배고",8900,"CJ");
		System.out.println("Product 정보 : ");
		product2.information();
		
		Product product3 = new Product("브브고",9900,"BJ");
		System.out.println("Product 정보 : ");
		product3.information();
	}

}