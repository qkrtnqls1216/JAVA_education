package day2;

// 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 변수 result에 숫자를 누적 및 감소시키는 예제

public class OperTest13 {

    public static void main(String[] args) {
        int result = 0;

        result += 10; // result에 10을 더한 후, 그 값을 다시 result에 대입한다.
        System.out.println("result=" + result); // 출력: result=10

        result -= 5;
        System.out.println("result=" + result);
        
        result *= 3;
        System.out.println("result=" + result);
        
        result /= 5; // /= 나눈 후 몫
        System.out.println("result=" + result);
        
        result %= 3; // %= 나눈 후 나머지
        System.out.println("result=" + result);
        
    }

}

