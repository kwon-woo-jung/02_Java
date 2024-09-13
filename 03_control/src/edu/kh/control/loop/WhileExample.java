package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/*
	 * while문
	 * 
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 * 	반복 종료 조건을 자유롭게 설정하는 반복문.
	 * 
	 * ** 확실히 언제 반복이 끝날지는 모르지만
	 * 	언젠가 반복 조건이 false가 되는 경우 반복을 종료함.
	 * 
	 */
	
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 9;
		
		while( input != 0 ) { // input이 0이 아니면 무한반복, 0이면 멈춤
			
			System.out.println("-----메뉴선택-------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떢볶이를 주문했다."); break;
			case 2 : System.out.println("쫄면을 주문했다."); break;
			case 3 : System.out.println("김밥을 주문했다."); break;
			case 0 : System.out.println("메뉴선택을 종료합니다..."); break;
			default : System.out.println("잘못 입력하셨어요!!!"); 
			}
			
			
		}
		
		
		
	}
	
	public void ex2() {
		
// 		입력되는 모든 정수의 합 구하기
//			단, 0이 입력되면 반복 종료 후 결과 출력
//		-> 0이 입력되지 않으면 계속 반복
//		do ~ while 문
		
		/*
		 * do {
		 * 		반복 수행할 코드;
		 * 		-> 무조건 한번은 수행
		 * 
		 * } while(조건식);
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0; // 입력받은 값을 저장할 변수
		int sum = 0; // 합을 저장할 변수
		
		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
			
		} while (input != 0);
		
		System.out.println("합계 : " + sum);
		
		
		
	}
	
	
	public void practice7() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 
		 ex.
		 정수 입력 : 4
		 * 
		 **
		 ***
		 ****
		
		 -행 (row)은 입력한 input만큼
		 -열 (col)은 현재행 (row)만 반복
		 */
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("정수 입력 : ");
		 int input = sc.nextInt();
		
		 for(int row = 1; row <= input; row++) {
			 
			 for(int col = 1; col <=row; col++) {
				 
				 System.out.print("*");
				 
			 }
			 
			 System.out.println(); // 한 행의 모든 열 출력 끝나면 줄바꿈(다음행)
			 
		 }
		
		
		}
	
	
	public void practice8() {
		/* 다음과 같은 실행 예제를 구현하세요.
		 
		 ex.
		 정수 입력 : 4
		 ****
		 *** 
		 ** 
		 *
		  
		  - 행(row)은 입력한 input 만큼 반복
		  (단, 안쪽 for문을 생각해서 1씩 감소하는 형태로 작성.)
		  -열(col)은 1부터 현재행(row) 범위만큼 반복
		  
		  
		 */
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 입력 : ");
		 int input = sc.nextInt();
		 
		 for(int row = input; row >= 1; row--) {
			 // 내가 입력한 input 값을 row에 대입하여 반복할때마다 1씩 감소
			 // 4 3 2 1..
			 
			 for(int col = 1; col <= row; col++ ) {
				 System.out.print("*");
			 }
			 
			 System.out.println();
			 
		 }
		
	}
	
	
	public void practice9() {
		
		/*
		 
		 정수 입력 : 4
		  
		  
		 *
		** 
	   *** 
	  ****
	  
	 - 공백 부분이 input 보다 1 작은수에서 시작하여
	   1씩 감소하는것 처럼 보임
	 
	 - * 부분은 현재행(row)만큼 찍힌것으로 보임
	 
	  * */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 입력 : ");
	int input = sc.nextInt();
	
	for(int row=1; row <= input; row++) {
		
		// 공백 부분 입력할 for문
		for(int i = input-1; i >= row; i--) {
			System.out.print(" ");      
		}
		
		
		
		
		// 현재 row만큼 반복하여 * 출력해줄 for문
		for(int col = 1; col <= row; col++) {
			System.out.print("*");
		}
		
		System.out.println("*");
		
	}
	
	
	
	
	
	
	
	
	
	}
	
	public void practice10() {
		
		/*
		  
		 정수 입력 : 3
		 
		 *
		 **
		 *** (여기까지 위쪽삼각형)
		 **
		 *
		  
		  -위쪽삼각형 : 행(row)은 input 만큼 반복, 열(col)은 현재행(row)만큼 반복
		  -아래삼각형 : 행(row)은 input보다 1작은수에서부터 1씩 감소하며 반복
		  		열(col)은 현재행(row)만큼 반복
		  		
		 두개 합치기!
		 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽삼각형
		for(int row = 1; row<= input; row++) {
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
		
		
		// 아랫쪽삼각형
		for(int row = input - 1; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.println("*");
			}
			
			System.out.println(); // 줄바꿈
		}
	
		
		
	}
	
	public void practice11() {
		
		/*
		  
		 정수 입력 : 4 // 왼쪽에서부터 공백 포함
		  *       // input(4) + row(1) - 1 == 4 -> 한 행에 열(col)이 4번 반복하여 공백이나 * 찍음
		 ***	  // input(4) + row(2) - 1 == 5 -> 한 행에 열(col)이 5번
	    *****	  // input(4) + row(3) - 1 == 6 -> 한 행에 열(col)이 6번
	   *******	  // input(4) + row(4) - 1 == 7 -> 한 행에 열(col)이 7번
	   
	   
	   - " " 규칙 : input - row 값이 col 이상일 때 
	   - "*" 규칙 : col이 더 클 때
	   
	  	(1행 : 공백규칙 -> input(4) - row(1) == 3 >= col(1,2,3,4)
		 		col이 4 일 때 false으므로 * 찍힘
		 		
		 (2행 : input(4) - row(2) ==> 2 >= col(1,2,3,4,5)
		 		col이 3,4,5 일때 false 이므로 * 찍힘
		 		
		 (3행 : input(4) - row(3) ==> 1 >= col(1,2,3,4,5,6)		
		 		col이 2,3,4,5,6 일때 false 이므로 * 찍힘
		 		
		 (4행 : input(4) - row(4) ==> 0 >= col(1,2,3,4,5,6,7)
		 		col이 1,2,3,4,5,6,7 일때 false 이므로 * 찍힘(공백찍힐일 없음)
		* */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4일떄
		
		// 1부터 시작해서 input 까지 1씩 증가
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= input + row -1; col++) {
				// [1-1턴] 	1 <= (4 + 1 - 1) 4
				// [1-2턴] 	2 <= 4
				// [1-3턴] 	3 <= 4
				// [1-4턴] 	4 <= 4
				
				if(input-row >= col) { // 공백 조건
			// [1-1턴] (4 - 1) 3 >= 1 (true) " " 출력
			// [1-2턴]         3 >= 2 (true) " " 출력
			// [1-2턴]         3 >= 3 (true) " " 출력
			// [1-2턴]         3 >= 4 (false) "*" 출력
					System.out.print(" ");
					
				} else { // * 조건
					System.out.print("*");
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	public void practice12() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

