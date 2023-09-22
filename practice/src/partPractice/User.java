package partPractice;

public class User {
//	멤버변수
	private String name;
	private int age;
	private String address;
	String product;
	int num;
	
//	생성자(고객 개인정보 생성자)
	public User(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
//  생성자(고객 주문정보 생성자)	
	public User(String product, int num) {
		this.product = product;
		this.num = num;
	}
	
//	메서드
	public void infoLine() {
		System.out.println("***User Informaion***");
	}
	
	public void userInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	public void oderInfo() {
		System.out.println("상품명 : " + product);
		System.out.println("주문 수량 : " + num + "개");
	}
	
	
	public static void main(String[] args) {
//	인스턴스
		User user1 = new User("김승범", 35, "경기도 시흥시");
		User user1Oder = new User("목베개", 1);
		User user2 = new User("김민수", 36, "서울시 관악구");
		User user2Oder = new User("헬멧", 2);
		
// 출력 메서드
		user1.infoLine();
		System.out.println();
		
		user1.userInfo();
		user1Oder.oderInfo();
		System.out.println();
		
		user2.userInfo();
		user2Oder.oderInfo();
		
	}
}
