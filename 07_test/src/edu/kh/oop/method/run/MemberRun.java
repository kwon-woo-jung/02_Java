package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun { // 실행용 클래스

	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.displayMenu();
		
	}
}
