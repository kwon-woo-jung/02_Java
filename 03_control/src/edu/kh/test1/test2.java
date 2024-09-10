package edu.kh.test1;

import java.util.Scanner;

public class test2 { //소스제공용 클래스

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};

		System.out.print("검색할 회원 이름을 입력하세요 : ");
		
		String searchName = sc.next();
//		string searchName = sc.nextInt(); 
		
		
		boolean result = false;

		for(int i= 0; i <= memberArr.length ; i++) {
//		for(int i= 1; i <= memberArr.length ; i++) {

			if( memberArr[i].equals(searchName) ) {
				
//				if( memberArr (String 앞에 표기된 변수) 
//				[i].equals(searchName) ) { next를 쓸때 string 앞에 searchName이 앞에 있음
				
//			if(memberArr[i] == searchName) {
				
				result = true;
				break;
			}
			
		}
		
//		if(result) {
		if( !result) {
			System.out.println("회원이 존재하지 않습니다.");
			
		} else {
			System.out.println("회원이 존재합니다");
		}
		
	}

}
