package partPractice;

public class User {
//	�������
	private String name;
	private int age;
	private String address;
	String product;
	int num;
	
//	������(�� �������� ������)
	public User(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
//  ������(�� �ֹ����� ������)	
	public User(String product, int num) {
		this.product = product;
		this.num = num;
	}
	
//	�޼���
	public void infoLine() {
		System.out.println("***User Informaion***");
	}
	
	public void userInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}
	
	public void oderInfo() {
		System.out.println("��ǰ�� : " + product);
		System.out.println("�ֹ� ���� : " + num + "��");
	}
	
	
	public static void main(String[] args) {
//	�ν��Ͻ�
		User user1 = new User("��¹�", 35, "��⵵ �����");
		User user1Oder = new User("�񺣰�", 1);
		User user2 = new User("��μ�", 36, "����� ���Ǳ�");
		User user2Oder = new User("���", 2);
		
// ��� �޼���
		user1.infoLine();
		System.out.println();
		
		user1.userInfo();
		user1Oder.oderInfo();
		System.out.println();
		
		user2.userInfo();
		user2Oder.oderInfo();
		
	}
}
