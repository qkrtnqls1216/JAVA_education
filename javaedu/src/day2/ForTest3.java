package day2;

public class ForTest3 {

	public static void main(String[] args) {
		for(int n=1; n < 20; n++) // +1씩 19번 반복
			System.out.print(n+ " "); // n + 공백
		System.out.println(); // 줄바꿈
		
		for(int n=10; n > 0; n--) // -1씩 10번 반복
			System.out.print(n+ " ");
		System.out.println();
		
		for(int n=1; n < 20; n += 3) // 1~19까지 +3씩
			System.out.print(n+ " ");
		System.out.println();
		
		// 1월~12월까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++) // 지정된 값 ~ 12까지 +1씩
			System.out.print(month+ "월 ");
		System.out.println();
		System.out.println(month); // 최종 값 13
	}

}
