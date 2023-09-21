package com.kh.serial;

import java.io.Serializable;

/*
Serializalbe
	-�������̽�
	-Ŭ������ ��ü�� ����ȭ �Ǵ� ������ȭ�� ����
	-����ȭ : ��ü�� ����Ʈ ��Ʈ������ ��ȯ�ϴ� ���μ���
	-������ȭ : ����Ʈ ��Ʈ������ ��ü�� ��ȯ�ϴ� ���μ���
	-��ü�� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϴ� ���� �۾��� ������ �� ����
	-��ü�� ���¸� �����ϰ� �����ϱ� ���� ����
	(������ �� �ֵ��� �긦 �̿��ؼ� �����ϴ� ��,,?)
 
*/
public class PersonSerial implements Serializable {
	private String name;
	private int age;
	
	public PersonSerial(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return name + age;
		
	}
}
