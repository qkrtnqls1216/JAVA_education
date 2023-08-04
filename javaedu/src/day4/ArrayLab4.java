package day4;

public class ArrayLab4 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 5;
        int[] intArr = new int[num];
        char[] charArr = new char[num];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 26) + 1;
            charArr[i] = (char) ('a' + intArr[i] - 1);
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i != intArr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
            if (i != charArr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
