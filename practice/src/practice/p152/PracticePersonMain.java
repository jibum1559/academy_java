package practice.p152;

public class PracticePersonMain {
	int age;
	String name;
	boolean isMarried;
	int child;

	/**********아래 getters********/
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
	
	/**********아래 setters********/
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
			System.out.println("그럼 아이의 엄마는 누구?");
		}
		 
	}
	public void setChild(int pChild) {
		this.child = pChild;
	}
	
	
	/**********아래 메서드********/
	public void personInfo() {
		System.out.println("이 사람의 나이 : " + getAge() + "세");
		System.out.println("이 사람의 이름 : " + getName());
		System.out.println("이 사람의 결혼 여부 : " + getIsMarried());
		System.out.println("이 사람의 자녀 수 : " + getChild() + "명");
	}
	
}
