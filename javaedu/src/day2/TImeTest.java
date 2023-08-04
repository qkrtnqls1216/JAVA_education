package day2;

public class TImeTest {

	public static void main(String[] args) {
		int time = 32150;
		
		int hour = time / 3600;
		int min = (time % 3600)/60;
		int second = time % 60;
		
		System.out.println(hour + "시간" + min + "분" + second + "초");


	}

}
