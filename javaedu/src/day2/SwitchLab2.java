package day2;

public class SwitchLab2 {

    public static void main(String[] args) {
        int random = (int)(Math.random() * 5) + 1; // 1~5 사이의 값
        int result;

        switch (random) {
            case 1:
                result = 300 + 50;
                break;
            case 2:
                result = 300 - 50;
                break;
            case 3:
                result = 300 * 50;
                break;
            case 4:
                result = 300 / 50;
                break;
            default:
                result = 300 % 50;
        }

        System.out.println("결과값: " + result);
    }

}
