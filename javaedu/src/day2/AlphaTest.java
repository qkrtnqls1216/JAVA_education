package day2;

public class AlphaTest {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 25) + 1; // 0~25 -> 1~26
		char alphabet = (char)(num + 64); // 64를 더해 아스키 코드 변환
		
		System.out.println("추출된 숫자: " + num);
		System.out.println(alphabet);
		
	}

}
