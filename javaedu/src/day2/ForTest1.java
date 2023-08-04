package day2;

public class ForTest1 {
	public static void main(String[] args) {
		 for(int num=1; num <= 10; num++)
		        System.out.println(num);
		 System.out.println(); // 줄바꿈
		 
		 for(int num=1; num <= 10; num+=2)
		        System.out.println(num);
		 //System.out.println(num); // for문 안에서 선언한 변수는 for문 밖에서는 사용할 수 없음.
	}
}
