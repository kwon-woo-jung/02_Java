package edu.kh.test;

public class MaxFinder {
	public static void main(String[] args) {

		int[] numbers = { 3, 5, 7, 2, 8 };
		 int max = numbers[0]; 
		
		for (int i = 0; i < numbers.length; i++) { // i는 numbers의 개수보다 작은 동안 계속 i값을 1씩 증가하며 for문의 문장들을 수행한다는 의미
			if (numbers[i] > max) { // numbers[i]가 max보다 큰지 대입 
				max = numbers[i];  
			}
		}

		System.out.println("가장 큰 수는: " + max);
	}

}
