package edu.kh.oop.practice.model.vo;

import edu.kh.oop.practice.model.vo.Book;

public class Book {
		// 필드
		private	String title;
		private	int price;
		private	double discountRate;
		private	String author;
	
		// 생성자
		public Book() {} // 기본생성자(ctrl + space + enter)
		
		// 매개변수생성자
		// alt +shift + s -> Generate Constructor using Fields.. -> generate
		public Book(String title, int price, double discountRate, )
		
		
		
		// 메서드	
		
		
		
		
		
		}


		// 어노테이션 : 컴파일러용 주석
		// 0verriding : 재정의(메서드)
		@Override
		public String toString() {
			return title + " / " + price + " / " + discountRate + " / " + author;
			
		}
		
			/*
			
			현실 객체 : 자동차, 사람, 이름, 혈액형, 키, 몸무게(즉 지정할수 있는 것을 뜻함)
			객체 지향 언어 : 다수의 객체들간의 상호작용을 주고 받음
			
			자바 객체 : 클래스에 정의된 내용으로 new 연산자를 통해 메모리 영역에 생성된 것
			class : 객체의 특성(속성, 기능)에 대한 정의를 한 것
			
			new 연산자 : 
			
			추상화 : 프로그램에서 필요한 공통점을 추출하고, 불필요한 부분을 제거하는 과정
			
			캡슐화 : 객체의 필드와 메소드를 하나로 묶고 데이터의 직접 접근을 제한함
			
			캡슐화 원칙 : 클래스의 멤버 변수에 대한 접근 권한은 private을 원칙으로 한다.
			
			클래스의 멤버변수에 대한 연산처리를 목적으로 하는 멤버 메소드는 클래스 내부에 작성한다.
			
			멤버 메소드는 클래스 밖에서 접근할 수 있도록 public으로 설정한다.
			
			메서드/기능의 '정의'란 : 수학의 함수와 비슷하며 호출을 통해 사용, 전달 값이 없는 상태로 호출하거나
			어떤 값을 전달하여 호출을 하며, 함수 내에 작성된 연산 수행
			수행 후 반환 값 / 결과 값은 있거나 없을 수 있음
			
			메서드의 '호출' 이란 : 객체안의 필드와 메소드를 객체 참조 연산자를 통해서 호출하는 과정
			
			return : 현재 메소드를 종료하고 자신을 호출한 메소드로 돌아가는 예약어
			반환 값이 있다면 반환 값을 가지고 자신을 호출한 메소드로 돌아감
			
			public String ex1() {
				    return "Hi";
				}

			위 메서드 상세히 해석 :  

		
			
			*/
			