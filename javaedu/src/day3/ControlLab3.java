package day3;

public class ControlLab3 {

    public static void main(String[] args) {
        String formatStr = "";

        while (true) {
            int num = (int) (Math.random() * 120) + 1;

            if (num < 50) {
                formatStr = "%d : 50 미만\n";
            } else if (num >= 50 && num <= 80) {
                formatStr = "%d : 50 이상 80 이하\n";
                if (num >= 70 && num <= 79) {
                    formatStr += "%d : *턱시팀*\n";
                }
            } else if (num >= 81 && num <= 100) {
                continue;
            } else if (num >= 101 && num <= 120) {
                break;
            }

            System.out.printf(formatStr, num);
        }
    }
}

/*
 72 : 50 이상 80 이하
Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'
	at java.base/java.util.Formatter.format(Formatter.java:2672)
	at java.base/java.io.PrintStream.format(PrintStream.java:1053)
	at java.base/java.io.PrintStream.printf(PrintStream.java:949)
	at day3.ControlLab3.main(ControlLab3.java:24)

 위 에러가 간헐적으로 발생하는데 이유를 잘 모르겠습니다 ... 
 */

