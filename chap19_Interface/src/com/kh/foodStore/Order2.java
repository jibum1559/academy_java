package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//주문 객체2 출력하는 문구 변경
public class Order2 implements FoodStore{
private List<Menu> ordermenus;
	
	public Order2() {
		ordermenus = new ArrayList<>();//주문한 내용들
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		ordermenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	@Override
	public void printMenu() {
		
		//menuA.getItem();
	 System.out.println("dddd");
		for (Menu menuA: ordermenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}