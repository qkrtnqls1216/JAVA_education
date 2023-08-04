package day4;

import java.util.Arrays;
public class LottoMachine {

    public static void main(String[] args) {
        int[] array = new int[6];
        int count = 0;

        while (count < 6) {
            int rmd = (int)(Math.random() * 45) + 1;
            boolean isDuplicate = false;

            for (int i = 0; i < count; i++) {
                if (array[i] == rmd) {
                    isDuplicate = true;
                    break; // 중복이면 더 이상 검사하지 않고 반복문 종료
                }
            }

            if (!isDuplicate) {
                array[count] = rmd;
                count++;
            }
        }

        System.out.println("[ 출력형식 ]");
        System.out.println("오늘의 로또 번호 - " + Arrays.toString(array).replaceAll("[\\[\\]]",""));
    }
}