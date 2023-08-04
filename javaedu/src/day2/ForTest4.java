package day2;

public class ForTest4 {

	public static void main(String[] args) {
		int sumV = 0; // for문 밖에서 선언

		for (int n = 1; n <= 10; n++) {
			sumV += n; // 누적 합
		}
		System.out.println(sumV);
		
		sumV = 0;
		for (int n = 1; n <= 10; n++) {
			sumV += n*n; // 제곱 값 누적 합
		}
		System.out.println(sumV);
		
	}
}
