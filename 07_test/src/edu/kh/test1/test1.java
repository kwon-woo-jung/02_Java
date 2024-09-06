package edu.kh.test1;

import java.util.Scanner;


public class test1 {
			
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		while(true) {
			System.out.print("2 ~ 9 사이 정수 입력 : ");
			
			int input = sc.nextInt();
			
			if(input <= 9) {
				for(int num = 1 ; num <9 ; num++) {
					System.out.printf("%d * %d = %d\n", input, num);
				}
			} else {
				System.out.println("2이상 9 이하의 정수만 입력해주세요.");
			}
		}
	
	}
	
	
	/*
	 * 조치내용
	 * 
	 * 6파트에 public static void main(String[] args)는
	 *  다른 실행용 클래스를 만들어 둔 뒤에 그곳에 적용 시켜야함
	 * 
	 * 	package edu.kh.test1;
		public class test1Run {
		public static void main(String[] args)
		
		
		조치내용 2
		
		Scanner sc = new Scanner(System.in);
		밑에 현재 문제들은 작성하는게 아닌
		public void ex1() {}을 만들어 둔 뒤에
		그 후에 나머지 문제들을 해당 코드에 집어 넣어야 함
		
		public void ex1() {
		
		while(true) {
		System.out.print("2 ~ 9 사이 정수 입력 : ");
			int input = sc.nextInt();
			if(input <= 9) {
			for(int num = 1 ; num <9 ; num++) {
			System.out.printf("%d * %d = %d\n", input, num);
				}
			} else {
				System.out.println("2이상 9 이하의 정수만 입력해주세요.");
			}
		}
	}
		*/
	
	/*
	 * 조치내용 3
	 * 
	 * 12번 파트에서 int input = sc.next();로 적용 시키는것이 아니라
	 * int input = sc.nextInt();를 작성해야 한다
	 * int 정수형을 통해 작성할땐 Int를 뒤에 덧붙여야 함
	 * 
	 */
	
	
}

