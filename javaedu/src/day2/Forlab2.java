package day2;

public class Forlab2 {

    public static void main(String[] args) {
        int n = 9;
        for (; n >= 4; n--) {
            if (n % 2 == 0) {
                System.out.println(n + ": 짝수");
            } else {
                System.out.println(n + ": 홀수");
            }
        }
    }
}
