package edu.kh.oop.practice.model.vo;

public class hero {

	// 속성
	// 필드 == 멤버 변수
	
	private String nickName; // 닉네임
	private String job;		// 직업
	private int hp;			// 체력
	private int mp;
	private int level;
	private int exp;
	
	// 기본 생성자
	public hero() {
		// TODO Auto-generated constructor stub
		
		
		
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	// 기능
	
	// getter/setter
	
	
	public void attack(double exp) {
		this.exp += exp;
		
		System.out.printf("'%s' 은/는 공격을 했다 !!! 현재 경험치 : %.1f\n",
					nickName, this.exp);
		
		if(this.exp >= 300 ) {
			level += 1;
			System.out.println("레벨이 올랐습니다!! 현재레벨 : " + level);
		}
	}
	
	public void dash() {
		if(mp <= 0) {
			System.out.println("[마력 무족]더 이상 대시 할 수 없어요~!");
		} else {
			mp -= 10; // mp = mp -10;
			System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력 : %d\n",
							nickName, mp );
		
			
		}
		
	}
	
	public String toString() {
		return "===='%s'님의 정보====\n"
	}
}













