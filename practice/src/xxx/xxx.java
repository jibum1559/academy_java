package xxx;

public class xxx {
	//멤버변수
	//final double PI = 3.14;
	//private static final double PI = 3.14;
	//pirvate final double PI = 3.14;
	// 기본생성자 객체 생성!!!
	//초기 원의 둘레와 넓이를 계산하고 출력해보자!!
	//inRadius
	//AreaCircle 원의 넓이
	//SizeofCircle 원의 둘레
	//원의 둘레와 넓이가 반지름1씩 증가한 다음 계산 출력하기
	private final double PI = 3.14;
	private int radius = 1;
	
	public xxx() {
	}
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	
	public void AreaCircle() {
		double area = getPI() * getRadius() * getRadius();
		System.out.println("원의 넓이는 : " + area);
	}
	public void SizeofCircle() {
		double size = getRadius() * getPI() * 2; //반지름 * 2 * 3.14
		System.out.println("원래 둘레는 : " + size);
	}
	public void inRadius() {
		radius++;
	}
}
