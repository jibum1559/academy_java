package practice.p152;

public class PrecticeOderMain {
	long Onum;
	String id,date,name,Pnum,address;
	
	public PrecticeOderMain(long Onum, String id, String date, String name, String Pnum, String address) {
		this.Onum = Onum;
		this.id = id;
		this.date = date;
		this.name = name;
		this.Pnum = Pnum;
		this.address = address;

	}
	
	public void oderInfo() {
		System.out.println("�ֹ� ��ȣ	   : " + Onum);
		System.out.println("�ֹ��� ���̵�  : " + id);
		System.out.println("�ֹ� ��¥	   : " + date);
		System.out.println("�ֹ��� �̸�	   : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + Pnum);
		System.out.println("��� �ּ� 	   : " + address);
	}
}
