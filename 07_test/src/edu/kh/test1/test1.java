package edu.kh.test1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2 ~ 9 사이 정수 입력 : ");
			
//			int input = sc.next();
			int input = sc.nextInt();
			
			if(input <= 9) {
				
//				for(int num = 1 ; num <=9 ; num++) {
//				if(input >= 2 && input <= 9) {
				if (input >= 2 && input <= 9) {
					
                    for(int num = 1; num <=9 ; num++) {
					//System.out.printf("%d * %d = %d\n", input, num);
//					System.out.printf("%d * %d = %d\n", input * input);
					System.out.printf("%d * %d = %d\n", input, num, input * num);
					
//					System.out.printf("input, num, input * num");
					
					
				}
			
             break;   
			} else {
				System.out.println("2이상 9이하의 정수만 입력해주세요.");
			}
		}
	}	
}
			
}	

