package practice.p152;

public class PracticePersonMain {
	int age;
	String name;
	boolean isMarried;
	int child;

	/**********�Ʒ� getters********/
	public int getAge() {
		return age;		
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getIsMarried() {
		return isMarried;
	}
	
	public int getChild() {
		return child;
	}
	
	/**********�Ʒ� setters********/
	public void setAge(int pAge) {
		this.age = pAge;
	}
	
	public void setName(String pName) {
		this.name = pName;
	}
	
	public void setIsMarried(boolean pMarry) {
		this.isMarried = pMarry;
		if(pMarry) {
		} else {
			System.out.println("�׷� ������ ������ ����?");
		}
		 
	}
	public void setChild(int pChild) {
		this.child = pChild;
	}
	
	
	/**********�Ʒ� �޼���********/
	public void personInfo() {
		System.out.println("�� ����� ���� : " + getAge() + "��");
		System.out.println("�� ����� �̸� : " + getName());
		System.out.println("�� ����� ��ȥ ���� : " + getIsMarried());
		System.out.println("�� ����� �ڳ� �� : " + getChild() + "��");
	}
	
}
