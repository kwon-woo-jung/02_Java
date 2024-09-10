package edu.kh.inheritance.model.dto;

/*
 * Object
 * 	  ㄴ Person
 * 	  	  ㄴ Student
 * 
 * 
 * 
 * */

//	상속방법:	 자식 extends 부모
public class Student extends Person{
	// Student 클래스에 person 클래스 내용을 연장한다
	// == Student 클래스에 person 클래스의 필드, 메서드를
	// 추가하여 확장한다	

	// 속성(필드)
	/*
	private String name;
	private int age;
	private String natinality;
	*/
	
	private int grade; // 학년
	private int classRoom; // 반
	
	public Student() {}
	
	// 매개변수 생성자
	public Student(String name, int age, String nationality,
						int grade, int classRoom) {
		
//		Person(부모) 상속받은 메서드 setter
 		/*setName(name);
		setAge(age);
		setNationality(nationality);
		
//		부모의 settet를 이용할 수는 있지만 비효율적
		*/
		
		// super(); : 부모의 기본생성자
		// super(매개변수...); : 부모의 매개변수생성자
		super(name, age, nationality); // Person의 매개변수기본생성자 의미	
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	
	
	
	
	
	
	// 기능(메서드)
	/*
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
	public String getNatinality() {
		return natinality;
	}
	public void setNatinality(String natinality) {
		this.natinality = natinality;
	}
	*/
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()
				+ " / " + grade +
				" / " +classRoom;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
