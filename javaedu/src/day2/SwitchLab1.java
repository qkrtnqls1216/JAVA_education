package day2;

public class SwitchLab1 {

    public static void main(String[] args) {
        int grade = (int) (Math.random() * 6) + 1; // 1~6 사이의 값

        switch (grade) {
            case 1:
            case 2:
            case 3:
                System.out.println(grade + "학년은 저학년입니다.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(grade + "학년은 고학년입니다.");
//                break; // 마지막 break는 필요없음
        }
    }
}
