package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
//	Person 클래스를 만들어 준다 
	
	private String name;
	private int age;
	private char gender;
//	
	
	public Person() {}
//	기본 생성자 역할은 클래스가 인스턴스화될 때 호출 되어 객채 초기 상태를 설정 하는 것이다. 인스턴스화는 객체가 만들어 질떄를 뜻함

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//	매개변수 생성자는 객체가 생성될떄 필드에 name, age, gender에 초기 값을 설정할 수 있도록 매개변수를 받아 객체를 초기화 하는 생성자입니다.
//	this 키워드를 사용하여 전달받은 매개변수(name, age, gender)를 해당 객체의 인스턴스 변수에 할당합니다.
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

//	getter / setter는 캡슐화 원칙을 따른다 private으로 선언하고 외부에 접근하기 위해서는 getter와 setter를 통해서만 가능함
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
//	toString()메서드는 객체의 정보를 사람이 읽을 수 있는 문자열로 반환 하는 메서드입니다.
//	모든 클래스는 최상위 부모인 Object 클래스를 상속 받음 그리고 Object 클래스에 정의된 toString() 메서드를 오버라이딩하여 객체 정보를 원하는 방식으로 출력 가능
//	위 예시는 Person 객체의 필드 값 name, age, gender를 쉽게 확인 할 수 있도록 문자열로 반환함


	// 객체가 같다(동일, 동등)를 어떻게 비교할까?
	// - 동일 : 가리키고 있는 것이 같다
	// - 동등 : 값이 같음
	
	// 동일 객체 : 메모리 주소가 같은 완전히 같은 객체
	//				hashCode()는 주로 이런 객체를 식별하는데 사용
	
	// 동등 객체 : 메모리 주소가 다르더라도, 각 객체의 내부 값들이 같다면
	//				동일한 객체로 간주하는 경우를 말함
	//				equals() 메서드는 이러한 객체가 같은지 판단할때 사용
	
	// 동일 비교 : Object.hashCode() 메서드 오버라이딩
	// hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수
	// ex) 123   				->  qwerty
	//     asfagsgwegsdgQWEGgsdg -> asdfgh
	// 암호화에 많이 사용
	
	// alt + shift + s -> Generate hashCode() and equals() ... 
	
	@Override
	public int hashCode() {
		// 필드에 저장된 값을 이용해서 hashcode 생성
		// hashcode : 객체별 식별 코드
		return Objects.hash(age, gender, name);
	}
//	hashCode()란? hashCode() 메서드는 객체를 식별할 수 있는 고유한 정수를 반환함
//	HashSet, HashMap, HashTable 등의 컬렉션에서 객체를 관리할 때 객체를 빠르게 찾기 위해서 hashCode()를 사용한다
	
//	hashCode()를 오버라이딩 할땐 객체의 필드 값을 이용해 고유한 식별자를 만들어 낸다 이 예시에서는 Objects.hash() 메서드를 사용하여
//	age, gender, name 필드 값을 기반으로 해시 코드를 생성한다
	
	// 동등 비교 : Object.equals() 메서드 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
//	equalse() 메서드는 두 객체가 논리적으로 동일한지 확인 하기위해 비교하는 메서드 public boolean equals(Object obj)
//	이 예제에서는 name, age, gender 필드가 모두 같은 경우에만 두 객체가 동일하다고 판단합니다.
//	그러면 hashCode() 와 equals()의 관계는 무엇인가?
//	hashCode() 와 equals()는 컬렉션(HashSet, HashMap)에서 동일 객체를 찾거나 중복 여부를 체크할 떄 사용됩니다.
//	equals()가 같다면 hashCode()도 같아야 한다 두 객체가 논리적으로 동일(equals() == true)하다면 그들의 hashCode()도 동일해야 한다
//	반대로 hashCode()가 같다고 equals()가 항상 참은 아니다
	
//	기본 생성자: 매개변수 없이 객체를 생성할 수 있게 한다
//	매개변수 생성자: 객체 생성 시 필드 값들을 초기화 할 수 있음
//	getter / setter: 필드에 대한 접근과 수정을 제어하는 메서드
	
//	toString() 오버라이딩: 객체의 필드 값을 사람이 읽을 수 있는 문자열로 반환함
/*	public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}*/
//	equals() 오버라이딩: 객체의 필드 값을 비교하여 논리적으로 동일한 객체인지 확인함	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}