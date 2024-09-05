package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스

	// import 자동 단축키 : ctrl + shift + o
	Scanner sc = new Scanner(System.in);

	public void ex1() {

		// if 문
		// 조건식이 true일때만 내부 코드 수행

		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력

		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다");
		}

		if (input <= 0) {
			System.out.println("양수가 아니다");
		}
	}

	public void ex2() {
		// if - else 문
		// 조건식 결과가 true면 if문
		// false면 else 구문이 수행

		// 홀짝 검사
		// 입력받은 정수값이
		// 홀수이면 "혼수입니다" 출력
//		0이면 "0입니다"
//		짝수이면 짝수입니다 출력
		// else if 사용 x, 중첩 if 문 사용하기

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input % 2 != 0) {
			System.out.println("홀수 입니다");

		} else { // 짝수 또는 0 입력 시 수행

			// 중첩if
			if (input == 0) {
				System.out.println("0 입니다");
			} else {
				System.out.println("짝수 입니다");
			}

		}
	}

	public void ex3() {
//		if(조건식) - else if(조건식) - else

//		양수, 음수, 0 판별

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {

			System.out.println("양수입니다");

		} else if (input < 0) { // 바로 위에 있는 if 문이 만족되지 않은 경우 수행

			System.out.println("음수입니다");

		} else {
			System.out.println("0 입니다");
		}

	}

	public void ex4() {

		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 "한파 주의보")
		// 3~5 봄
		// 6~8 여름 (35도 이상 : "폭염 경보" / 33도 이상 : "폭염 주의보")
		// 9~11 가을
		// 1~12월 사이가 아닌 달을 입력 했을떈 "해당 하는 계절이 없다" 출력

		System.out.println("달 입력 : ");
		int month = sc.nextInt();

		String season; // 아래 조건문 수행 결과를 저장할 변수 선언

		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";

			System.out.println("온도입력 : ");
			int temperature = sc.nextInt();

			if (temperature <= -15) {
				// 겨울 한파 경보
				season += "한파 경보";
			}

		} else if (month >= 3 && month <= 5) {
			season = "봄";

		} else if (month >= 6 && month <= 8) {
			season = "여름";

			System.out.println("온도 입력 : ");
			int temperature = sc.nextInt();

			if (temperature >= 35)
				;

		} else if (month >= 9 && month <= 11) {
			season = "가을";

		} else {
			season = "해당하는 계절이 없습니다";
		}

	}

	public void ex5() {
		System.out.println("나이입력 : ");
		int age = sc.nextInt();

		String result;

		if (age <= 13) {
			result = "어린이 입니다.";
		}

		else if (age > 13 && age <= 19) {
			result = "청소년입니다.";
		}

		else {
			result = "성인입니다";
		}

	}

	public void ex6() {
		System.out.println("점수 입력");
		int input = sc.nextInt();

		String score;

		if (input < 0 || input > 100) {
			score = "잘못 입력하셨습니다";
		} else if (input >= 90) {
			score = "A";
		} else if (input >= 80) {
			score = "B";
		} else if (input >= 70) {
			score = "C";
		} else if (input >= 60) {
			score = "D";
		} else {
			score = "F";
		}

		System.out.println(score);

		// if(input > 90 ) {
		// score = "A";
		// }

		// else if(input >=80 && input< 90) {

		// score = "B";
		// }

		// else if (input >= 70 && input < 80) {
		// score = "C";
		// }

		// else if (input >= 60 && input < 70) {
		// score = "D";
		// }

		// else if (input <60) {
		// score = "F";
		// }

		// else if (input > 100 && input < 0 ) {
		// score ="잘못 입력하셨습니다";
		// }

	}/*
		 * 
		 * public void ex7() { System.out.println("키 입력 : "); double tool =
		 * sc.nextDouble();
		 * 
		 * System.out.println("나이 입력 : "); int age = sc.nextInt();
		 * 
		 * 
		 * String result;
		 * 
		 * if(tool > 140 && age >12) {
		 * 
		 * result = "탑승가능";
		 * 
		 * }
		 * 
		 * 
		 * 
		 * if(tool < 140) { result = "적정 키가 아닙니다"; }
		 * 
		 * if(age < 12) { result = "적정 연령이 아닙니다."; }
		 * 
		 * if (age < 0 || age > 100) { result = "잘못 입력 하셨습니다."; } }
		 */

	public void ex7() {
//		놀이기구 탑승 제한 검사
//		나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
//		나이가 12세미만인 경우 : "적정 연령이 아닙니다."
//		키가 140.0cm 미만 : "적정 키가 아닙니다."
//		나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		String result;

		if (age < 0 || age > 100) {
			result = "잘못 입력하셨습니다";
		}

		else { // 나이를 잘 입력한경우 0~100 사이

			System.out.print("키 입력 : ");
			double tool = sc.nextDouble();

			if (age < 12) {
				result = "적정 연령이 아닙니다";
			}

			else if (tool < 140.0) {
				result = "적정 키가 아닙니다";
			}

			else {
				result = "탑승 가능";
			}

			System.out.println(result);
		}

	}

	public void ex8() {

		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		String result;

		if (age > 100 || age < 0) {
			result = "나이를 잘못 입력 하셨습니다.";

		} else {

			System.out.println("키 입력 : ");
			double tool = sc.nextDouble();

			if (tool > 250 || tool < 0) {
				result = "키를 잘못 입력하셨습니다.";
				
			} else { // 0 ~ 250 잘 입력한 경우
				
				if (age >= 12 && tool >= 140.0) {  // 나이 o, 키 o,
					result = "탑승 가능";

				} else {

					if (age > 12 && tool < 140.0) { // 나이 O, 키 X
						result = "나이는 적절하나, 키가 적절치 않음"; // 나이 o 키 x

					} else if (age < 12 && tool > 140.0) { // 나이 X, 키 O

						result = "키는 적절하나, 나이는 적절치 않음"; // 나이 x 키 o
						
					} else {
						result = "나이와 키 모두 적절치 않음";
					}

				}

			}

			System.out.println(result);

		}

		/*
		 * System.out.println("나이 입력 : "); int age = sc.nextInt();
		 * 
		 * System.out.println("키 입력 : "); double tool = sc.nextDouble();
		 * 
		 * String result;
		 * 
		 * if(age > 12 && tool >140.0) { // 탑승 가능한 경우
		 * 
		 * result = "탑승가능";
		 * 
		 * } else { // 탑승 불가능한 경우
		 * 
		 * if(age > 12 && tool < 140.0) { result = "나이는 적절하나, 키가 적절치 않음"; // 나이 O, 키 X }
		 * 
		 * else if(age < 12 && tool > 140.0) { result = "키는 적절하나, 나이가 적절치 않음"; // 나이 X,
		 * 키 O }
		 * 
		 * else { result = "나이와 키 모두 적절치 않음"; }
		 * 
		 * } System.out.println(result);
		 */

	}

}
