package com.kh.classAM;

public class AM {

	public 	  int pNum = 10;
	protected int pNum2 = 20;
	int			  pNum3 = 30; 	//접근 제한자를 명시하지 않으면 자동으로 default 제한이 적용됨
	private int   pNum4 = 40;
	
	//호출메소드 작성해서 각각 호출하기
	
	public void publicMethod() {
		System.out.println("어떤 클래스에서든 접근이 가능 / public Method() 호출됨");
	}
	
	protected void protectedMethod() {
		System.out.println("같은 패키지 내에서는 접근 가능하고 / protected Method() 호출됨");
	}
	
	void defaultMethod() { 
	//default는 앞에 접근제한자를 작성해주지 않으면 기본으로 적용이 됨
		System.out.println("같은 패키지 내에서만 / default Method() 호출됨");
	}
	
	private void privateMethod() {
		System.out.println("같은 클래스 내에서만 / private Method() 호출됨");
	}
}