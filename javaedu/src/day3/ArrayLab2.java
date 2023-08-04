package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i = 1; i < arr.length; i++) {
			int ran = (int)(Math.random()*17)+4;
			arr[i] = ran;
			sum += arr[i];
		}
		System.out.print("모든 원소의 값: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("모든 원소의 합: " + sum);
	}

}
