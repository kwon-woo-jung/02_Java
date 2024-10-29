package edu.kh.control.loop;

public class MaxFinder {
	public static void main(String[] args) {

		int [] numbers = { 3, 5, 7, 2, 8 };
		int max = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("가장 큰 수는: " + max);
	}

}


