package xxx;

public class xxxRun {
	
	public static void main(String[] args) {
		xxx result = new xxx();
		
		System.out.println("초기 원의 넓이는 : ");
		result.AreaCircle();
		System.out.println("초기 원의 둘레는 : ");
		result.SizeofCircle();
		
		System.out.println("원의 둘레와 넓이가 반지름 1씩 증가값은? ");
		result.inRadius();
		result.AreaCircle();
		result.SizeofCircle();
	}
}
