package com.kh.genericsMain;

//���ʸ� Ŭ���� ����
// T Type�� ���� 
public class Book<T> {    //T �� �ƴ� �ٸ� �ƹ��ų� �־ �ȴ�. Type�� ���Ӹ�
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}

}
