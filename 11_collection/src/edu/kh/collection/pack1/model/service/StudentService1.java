package edu.kh.collection.pack1.model.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService1 {

	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
//	* 인터페이스 객체 생성 X, 부모 참조변수 O

//	java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
//	new ArrayList() : 기본생성자 -> 기본 크기가 10 짜리 리스트 생성
//	-> 하지만 리스트는 크기가 늘었다 줄었다 하기때문에 큰 의미 없음
	
//	ArrayList(용량) : 용량만큼의 리스트 생성
//	-> 너무 큰 값을 작성하면 메모리를 많이 소모함.
	
//	필드
	
	private Scanner sc = new Scanner(System.in);
	
	// private List<Object> testList = new ArrayList<Object>();
	
	// 학생 정보를 저장할 List 생성
//	private List<Student> studentList = new ArrayList<Student>(); // 검색(조회) 효율적
	private List<Student> studentList = new LinkedList<Student>(); // 추가, 수정, 삭제에
//	효율적
//	부모타입(List) 참조변수(testList) = 자식객체(ArrayList) 주소 대입
//	다형성 중 업캐스팅 적용
	
//	제네릭(Generics_
//	-> 컬렉션에 저장되는 객체 타입을 한가지로 제한 : <E> == Element
//	다양한 타입을 처리할 수 있도록 만들어짐
	
	public StudentService() { // 기본생성자
		
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 안산시", 'M', 100));
		studentList.add(new Student("강아지", 23, "서울시 강남구", 'M', 100));
		studentList.add(new Student("오미나", 23, "충북 청주시", 'M', 100));
		studentList.add(new Student("박주희", 23, "서울시 서대문구", 'M', 100));
	}
	
	/*
	 * public void ex() { // List 테스트용
	 * 
	 * // List.add(Object e) : 리스트에 객체를 추가  
	 * // * 매개변수 타입이 Object == 모든 객체 매개변수로 전달할 수 있음
	 * 
	 * testList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
	 * testList.add("문자열");
	 * testList.add(sc);
	 * testList.add(new Object());
	 * 
	 * 컬렉션의 특징이란? 여러 타입의 데이터를 저장할 수 있다.
	 * 
	 * // Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환 // 반환형이 Object == 모든
	 * 객체를 반환할 수 있다
	 * 
	 * System.out.println( testList.get(0) );
	 * System.out.println( testList.get(1) );
	 * System.out.println( testList.get(2) );
	 * System.out.println( testList.get(3) );
	 * 
	 * // testList에서 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사 // 만약 Student 라면 이름을 꺼내옥 ㅗ싶다
	 * for(Object e : testList) {
	 * 
	 * if(e instanceof Student ) { // 맞다면 접근하여 이름을 출력하기 System.out.println(
	 * "testList Student 타입 인덱스 요소의 이름 : " + ((Student)e).getName() ); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
	
	// 메뉴 출력용 메서드
	
	/**
	 * alt + shift + j 메서드 설명용 주석
	 * 
	 * @author mihyun@iei.or.kr
	 */
	
	public void StudentService2 () {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
