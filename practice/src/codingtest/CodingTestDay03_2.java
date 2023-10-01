package codingtest;

import java.util.Arrays;

class CodingTestDay03_2 {
	public static int solution() {
		int[] array = {1,2,7,10,11,13,15};
		int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
    public static void main(String[] args) {
    	CodingTestDay03_2 a = new CodingTestDay03_2();
    	System.out.println(a.solution());
    }
}

