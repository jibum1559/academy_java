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
		System.out.println("주문 번호	   : " + Onum);
		System.out.println("주문자 아이디  : " + id);
		System.out.println("주문 날짜	   : " + date);
		System.out.println("주문자 이름	   : " + name);
		System.out.println("주문 상품 번호 : " + Pnum);
		System.out.println("배송 주소 	   : " + address);
	}
}
