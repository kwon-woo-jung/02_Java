package com.kh.test.model.vo;

public class Student {
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// toString 메서드 재정의 (필드 정보 출력)
	@Override
	public String toString() {
		return name + "학생의점수:" + score + "점";
	}
}
