package practice.p152;

public class PrecticeOderRun {

	public static void main(String[] args) {
		PrecticeOderMain oder = new PrecticeOderMain(201803120001L,"abc123","2018�� 3�� 12��","ȫ���","PD0345-12","����� �������� ���ǵ��� 20����");
		PrecticeOderMain oder2 = new PrecticeOderMain(201803130003L,"KH","2018�� 3�� 13��","��¹�","PD0353-15","��⵵ ����� 30����");
		System.out.println("*******�ֹ� ���� Ȯ��******");
		System.out.println();
		oder.oderInfo();
		System.out.println();
		oder2.oderInfo();
	}
  
}
