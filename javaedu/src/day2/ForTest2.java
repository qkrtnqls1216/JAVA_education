package day2;

public class ForTest2 {
    public static void main(String[] args) {
        double rand;

     // 1부터 10까지 1씩 증가하며 반복하는 for 루프. num: 루프의 카운터 변수
        for (int num = 1; num <= 10; num++) {
            rand = Math.random(); // Math.random() 메서드를 사용하여 0.0 이상 1.0 미만의 난수를 생성하고, rand 변수에 저장
            System.out.println(rand); // 난수 값 출력        
            System.out.println(rand * 6); // 난수에 6을 곱하여 0.0 이상 6.0 미만의 랜덤한 부동 소수점 숫자 출력
            System.out.println((int) (rand * 6)); // 난수에 6을 곱한 결과 -> 정수로 형변환 0 이상 5 이하의 랜덤한 정수 출력
        }
    }
}

