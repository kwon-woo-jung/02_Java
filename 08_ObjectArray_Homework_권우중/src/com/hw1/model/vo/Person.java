package com.hw1.model.vo;

public class Person {

	protected String name; // 이름
	// 상속받은 후손클래스에서 직접 접근 가능 
	
	private int age; // 나이
	private double height; // 키
	private double weight; // 몸무게

	public Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String information() {
		
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
							name, age, height, weight);
				
		
		
		
		
		
		System.out.println("--------------------");
		
		// 10명의 사원정보를 기록할 수 있도록 배열을 할당
		Employee[] emps = new Employee[10];
		
		
		
		
	}
	
	
}
