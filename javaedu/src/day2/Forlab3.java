package day2;

public class Forlab3 {

	public static void main(String[] args) {
		int random1 = (int)(Math.random()*9)+1; // 1~10 중 랜덤값
		int random2 = (int)(Math.random()*9)+31; // 30~40 중 랜덤값
		int sum = 0; // 짝수의 합을 저장할 변수

        for (int num = random1; num <= random2; num++) {
            if (num % 2 == 0) {
            	sum += num;
            }
        }

        System.out.println(random1 + "부터 " + random2 + "까지의 짝수의 합: " + sum);
    }
}
