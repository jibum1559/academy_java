package classConstant;

public class Constant {

	// 상수 사용
	// 더이상 a의 값을 바꾸지 못하도록 잠궈둠.
	public static final int a = 1;
	static final int b = 1;
	
	private final int c = 1;
	
	public static void main(String[] args) {


		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);

		//System.out.println("c의 값 : " + c); //static을 사용하지 않았기 때문에 에러
	}

}