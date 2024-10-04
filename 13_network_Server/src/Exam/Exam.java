package Exam;

import java.util.HashSet;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// HashSet 생성 및 값 추가
		HashSet<String> set = new HashSet<String>();
		set.add("문미미");
		set.add("박보배");
		set.add("송성실");
		set.add("윤예의");
		set.add("정재주");
		
		// 사용자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		
		// 입력을 String으로 받기
		String input = sc.next(); // nextInt() 대신 next() 사용하여 문자열 입력 받기
		
		for(int i = 0; i < set.size(); i++) {
			String name = set.get(i);
			if(name == input) {
				isExist = true;
				break;
			}
		}
		
		if(isExist) {
			System.out.println("존재하는 회원입니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}

	}

}
