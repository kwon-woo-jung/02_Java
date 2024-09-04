package edu.kh.control.loop;

import java.util.Arrays;

public class ArrayExample2 {

	// 얕은 복사 ( shallow copy)
	// -> 주소를 복사하여 서로 다른 두 변수가
	// 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	public void shallowCopy() {
		
		int arr = {1, 2, 3, 4, 5};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr) );
		System.out.println("copyArr : " + Arrays.toString(copyArr) );
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
				
	}
	
}


	// 배열을 이용한 중복데이터 제거 + 정렬
	public void createLottoNumber() {
		
		// 1. 1 ~ 45 사이 중복되지 않은 난수 6개 생성
		// 2. 생성된 난수가 오름차순으로 정렬
		// [5, 11, 13, 18, 24, 25]
		
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int [6]; 
		
		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i = 0; i < lotto.length; i++) {
			
			// 3) 1 ~ 45 사이 난수 생성
			int random = (int)(Math.random() * 45 + 1);
			// 1 <= x < 46
			// 1 ~ 45
			
			// 4) 생성된 난수를 순서대로 배열 요소 대입
			lotto[i] = random;
			
			// 5) 중복 검사를 위한 for문 작성
			for(int x = 0; x < i; x++) {
				
				// 6) 현재 생성된 난수와 같은 수가
				// 앞쪽 요소에 있는지 검사
				if(random == lotto[x]) {
					
					i--;
					
					// i가 1씩 증가할때마다 난수가 하나 생성됨
					// -> 중복 값이 있으면 난수를 새로 하나 더 생성해야 함.
					// -> i값을 인위적으로 1 감소시켜서 난수 발생의 기회를 한번 더 주는 것.
					
					break; 
					// 앞쪽에서 중복데이터를 발견하면
					// 남은 값을 비교할 필요 없다.
					// -> 효율 향상을 위해서 중복 검사하는 for문 종료
					
					
					
				}
				
			}
			
			// 정렬은 되어있지 않지만, 중복 제거가 된 배열이 완성됨
			
			// 7) 오름차순 정렬
			// -> 선택, 삽입, 버블, 퀵 등등
			// --> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
			// Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨
			
			Arrays.sort(lotto);
						
			// 결과 출력
			System.out.println( Arrays.toString(lotto) );
			
			
			
		}
		
		
		
	}