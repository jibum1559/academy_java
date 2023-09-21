package com.kh.finalSample;

import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kval;

	public Food() {
		
	}

	public Food(String name, int kval) {
		this.name = name;
		this.kval = kval;
	}
	
	public String getName() {
		return name;
	}
	public int getKval() {
		return kval;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setKval(int kval) {
		this.kval = kval;
	}
	
	@Override
	public String toString() {
		return name + kval;
	}
	
}
