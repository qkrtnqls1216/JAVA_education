package day3;

public class WhileLab3 {

    public static void main(String[] args) {
        int count = 0;

        while (true) {
            int num = (int) (Math.random() * 31); // 0~30
            char alphabet = (char) (num + 64); // 아스키 변환

            if (num == 0 || (num >= 27 && num <= 30)) {
                break; // 0, 27~30이 추출되면 반복 종료
            }

            System.out.println(num + "-" + alphabet + ", " + (int) alphabet + ", 0x" + Integer.toHexString(alphabet).toUpperCase());
            count++;
        }

        System.out.println("출력횟수는 " + count + "번입니다.");
    }
}
