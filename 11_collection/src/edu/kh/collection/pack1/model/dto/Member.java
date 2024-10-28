package edu.kh.collection.pack1.model.dto;

import java.util.Comparator;

public class Member{
	private int memberNo;
	private String memberName;
	private String memberId;
	private String memberPw;
	
	public Member(int memberNo, String memberName, String memberId, String memberPw) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberId = memberId;
		this.memberPw = memberPw;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", memberId=" + memberId + ", memberPw="
				+ memberPw + "]";
	}
	
}

