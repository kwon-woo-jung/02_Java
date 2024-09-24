package edu.kh.oop.method.model.vo;

public class Member { // 속성 + 기능
	
	// 필드
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; // 이름
	private int memberAge; // 나이
	
	// 생성자
	// 생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야한다.
	
	// 기본생성자
	// ctrl + space -> enter(제일 첫번째)
	public Member() {}

	// 매개변수 생성자 (필드 모두 초기화)
	// alt + shift + s => o
	
	/*  매개변수란? 메서드나 생성자에 값을 전달하기 위해 사용하는 변수입니다.
		매개변수는 메서드가 호출될 때 외부에서 전달되는 값을 받아
		그 값을 메서드 내부에서 처리할 수 있도록 해줍니다.
		매개변수를 통해 메서드나 생성자는 다양한 입력값에 따라 다른 동작을 수행할 수 있습니다. 
	*/
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수의 개수 다름)
		
		// 매개변수로 전달받은값을 필드에 대입 과정
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	
	// 메서드
	// getter/setter
	// alt + shift + s => r
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	// 매개변수 생성자 (필드 모두 초기화)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

