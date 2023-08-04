package day2;

public class OperTest12 {

    public static void main(String[] args) {
        int num = 100;

        // &&: 두 개의 조건이 모두 true일 때만 true를 반환
        // ||: 두 개의 조건 중 하나라도 true이면 true를 반환
        // ++: 증가연산자
        
        // num이 100보다 큰가? (&&) ++num(101로 증가한 값)이 101과 같은가?
        System.out.println(num > 100 && ++num == 101); // false (첫 번째 조건이 false이므로 ++num이 실행되지 않는다.)
        System.out.println(num); // 100 (++num이 실행되지 않았기 때문에 값은 변하지 않는다.)

        // num이 100보다 크거나 (||) ++num(101로 증가한 값)이 101과 같은지 비교한다.
        System.out.println(num > 100 || ++num == 101); // true (두 번째 조건이 true이므로 전체 결과도 true이다.)
        System.out.println(num); // 101 (두 번째 조건이 true이므로 ++num이 실행되어 값이 101이 된다.)
    }

}
