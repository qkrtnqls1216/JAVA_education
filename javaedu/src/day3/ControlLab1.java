package day3;

public class ControlLab1 {

    public static void main(String[] args) {
        int count = 0;

        while (true) {
            int num = (int) (Math.random() * 11) + 10; // (1) 10~20

            if (num % 3 == 0 || num % 5 == 0) {
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("추출된 숫자: " + num + ", 합: " + sum); // (2)

            } else if (num == 11 || num == 17 || num == 19) {
                System.out.println(count + "회 반복함");
                break; // (3)

            } else {
                System.out.println("재수행");
                continue; // (4)
            }

            count++;
        }
    }
}