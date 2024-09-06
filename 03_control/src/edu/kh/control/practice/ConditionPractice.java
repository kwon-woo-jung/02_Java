package edu.kh.control.practice;

public class ConditionPractice {

	
	public void practice1() {
		
		/*
		 * 
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
			짝수가 아니면 “홀수입니다.“를 출력하세요.
			양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 * 
		 * 
		 */
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input <= 0) {
			result = "양수만 입력해주세요";
		} else if (input % 2 == 0) {
			result = "짝수입니다";
			
		} else {
			result = "홀수입니다";
		}
		
		System.out.println(result);
		
	}
	
	
	
		public void practice2() {
	
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		*
		* */
		
		/*System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng; // 합계
			
		double avg = sum / 3.0; // 평균
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) { // 합격
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + kor);
			System.out.println("영어 : " + kor);
			System.out.println("합계 : " + kor);
			System.out.println("평균 : " + kor);
			
			System.out.println("축하합니다. 합격입니다~!!!");
			
		} else { // 불합격
			
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("불합격입니다...");
			
			}*/
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			int sum = kor + math + eng; // 합계			
			
			double avg = sum / 3.0; // 평균
			
			if(kor >= 40 && math >= && eng >= 40 && avg >= 60) { // 합격
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				
				System.out.println("축하합니다. 합격입니다~!!!");
				
			} else { // 불합격
			
				
				
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + sum);
				System.out.println("불합격입니다...");
				
			}
			
			
		}
		
	
	public void practice3() {}
	public void practice4() {}
	public void practice5() {}
	
}
