package com.kh.instance.cafe;
//음료 종류
//음료 사이즈
//설탕 여부

public class Cafe {
	private String type; //음료 종류
	private String size; 	//음료 사이즈
	boolean isSugar; 	//설탕 여부
	
	public Cafe(String type, String size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void OderCoffee() {
		System.out.println("주문할 음료는 : " + type);
		System.out.println("크기는 : " + size);
		
	if(isSugar) {
		System.out.println("설탕 추가해주세요. ");
	} else {
		System.out.println("설탕은 넣지 말아주세요.");
	}
	
		
	
	
	
	/*private int size; //아메리카노 사이즈
	private boolean hasSugar; //설탕여부
	
	public Cafe(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
				
	}
	
		
		//만약에 설탕을 넣는다면
		if(hasSugar) { //true
			System.out.println("설탕 추가 : " + hasSugar);
		}*/
		
	}

}
