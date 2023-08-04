package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int random = (int)(Math.random()*5)+1; // 0~4 -> 1~5
		int result;
		
		if(random == 1)
			result = 300 + 50;
		else if (random == 2)
			result = 300 - 50;
		else if (random == 3)
			result = 300*50;
		else if (random == 4)
			result = 300 / 50;
		else 
			result = 300 % 50;
		System.out.println("결과값: " + result);

	}

}
