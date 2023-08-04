package day3;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for (int i =1; i < ary.length; i++) {
			ary[i] = 0;
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		int num = 10;
		for (int i = 0; i < ary.length; i++) {
			ary[i] = num;
			num += 10;
		}
		System.out.println("첫 번째 원소: " + ary[0]);
		System.out.println("마지막 원소: " + ary[ary.length -1]);
		
		int sum = 0;
		for(int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		System.out.println("합: " + sum);
		
		for (int i = ary.length -1; i >= 0; i--) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < ary.length; i++) {
			if(ary[i] % 2 == 0) {
				System.out.print(ary[i] + " ");
			}
		}
	}

}
