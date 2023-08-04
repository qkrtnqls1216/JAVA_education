package day2;

public class IfTest2 {

    public static void main(String[] args) {
        int num = 100;
        System.out.println(1); // 1 출력: 첫 번째 줄, 항상 출력됨

        if (num % 2 == 1) // num이 홀수인지 검사
            System.out.println(2); // 홀수일 경우 2 출력, 실행되지 않음 (num은 짝수)
        
        System.out.println(3); // 3 출력: 두 번째 줄, 항상 출력됨

        if (num % 2 == 0) // num이 짝수인지 검사
            System.out.println(4); // 짝수일 경우 4 출력, 실행됨 (num은 짝수)
        
        System.out.println(5); // 5 출력: 세 번째 줄, 항상 출력됨
    }

}
