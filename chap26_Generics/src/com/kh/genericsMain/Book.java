package com.kh.genericsMain;

//제너릭 클래스 정의
// T Type의 약자 
public class Book<T> {    //T 가 아닌 다른 아무거나 넣어도 된다. Type의 줄임말
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}

}
