package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{
//	The public type Person must be defined in its own file
//	Animal의 추상메서드를 오버라이딩 하지 않으면 오류 발생 -> 강제화
	private String name;
	
	public Person() {}
	
	 
	
	
	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구 이용하여 먹는다");

	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨쉰다");
		
	}

	@Override
	public void move() {
		System.out.println("두발로 걷는다");
		
	}
	
	
	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name;
	}
	
	
	
	
	
	
	
}
