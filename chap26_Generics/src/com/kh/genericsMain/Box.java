package com.kh.genericsMain;

public class Box<TT> {
	TT content;
	
	public void put(TT item) {
		this.content = item;
	}
	
	public TT get() {
		return content;
		
	//여기다가 향상된 포문 써서 적용시켜보기	
	}
	
}
