package com.kh.foodStore;

public class Main {
	public static void main(String[] args) {
	//            FoodStore-> Order
		FoodStore order = new Order();
		order.addMenu("Â«»ÍÁÖ¹®");
		order.addMenu("Â¥Àå¸éÁÖ¹®");
		order.addMenu("±¼Â«»ÍÁÖ¹®");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("¹äÁÖ¹®");
		order1.addMenu("±¼ºñÁÖ¹®");
		order1.addMenu("»ı¼±ÁÖ¹®");
		order1.printMenu();
	}

}