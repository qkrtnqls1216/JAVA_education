package day3;

public class ControlLab2 {

    public static void main(String[] args) {
        int num = 1;

        while (num <= 10) {
            if (num % 3 == 0 || num % 4 == 0) {
                num++;
                continue;
            }

            System.out.println(num);
            num++;
        }
    }

}
