package day3;

public class WhileLab1 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 5;
 
        System.out.println("for 결과");
        for (int i = 1; i <= num; i++) {
            int square1 = i * i;
            System.out.println(i + "->" + square1);
        }
        
        System.out.println("while 결과");
        int j = 1;
        while(j <= num) {
        	int square2 = j * j;
        	System.out.println(j + "->" + square2);
        	j++;
        }
    }

}

