package day4;

public class ArrayLab3 {

    public static void main(String[] args) {
        char[] arr = {'J', 'a', 'v', 'a'};
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) { // 대문자인 경우 소문자로 변환
                arr[i] = Character.toLowerCase(arr[i]); 
            } else { // 아닌 경우 대문자로 변환
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        for (char element : arr) {
            System.out.println(element);
        }
    }
}
