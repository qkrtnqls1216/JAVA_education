package day2;

public class Forlab4 {

    public static void main(String[] args) {
        int evenNum = 0;
        int oddNum = 0;

        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                evenNum += num;
            } else {
                oddNum += num;
            }
        }
        System.out.println("1부터 100까지의 숫자들 중에서 짝수의 합은 " + evenNum + "이고 홀수의 합은 " + oddNum + "이다.");
    }
}
