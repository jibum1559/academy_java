package com.kh.genericsMain;

public class Box<TT> {
	TT content;
	
	public void put(TT item) {
		this.content = item;
	}
	
	public TT get() {
		return content;
		
	//����ٰ� ���� ���� �Ἥ ������Ѻ���	
	}
	
}
