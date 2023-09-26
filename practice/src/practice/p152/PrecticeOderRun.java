package practice.p152;

public class PrecticeOderRun {

	public static void main(String[] args) {
		PrecticeOderMain oder = new PrecticeOderMain(201803120001L,"abc123","2018년 3월 12일","홍길순","PD0345-12","서울시 영등포구 여의도동 20번지");
		PrecticeOderMain oder2 = new PrecticeOderMain(201803130003L,"KH","2018년 3월 13일","김승범","PD0353-15","경기도 시흥시 30번지");
		System.out.println("*******주문 정보 확인******");
		System.out.println();
		oder.oderInfo();
		System.out.println();
		oder2.oderInfo();
	}
  
}
