package com.kh.test;

import java.util.ArrayList;
import com.kh.test.model.vo.Student;

public class Test {
	public static void main(String[] args) {
		 // Student 객체를 담을 ArrayList 생성
		ArrayList<Student> list = new ArrayList<Student>();
		
		// ArrayList에 Student 객체 추가
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대남", 96));
		list.add(new Student("류라라", 67));

		 // ArrayList의 크기만큼 반복하면서 Student 객체 출력
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s); // toString()이 자동 호출되어 객체 정보 출력
			
		}
		
	}

}
