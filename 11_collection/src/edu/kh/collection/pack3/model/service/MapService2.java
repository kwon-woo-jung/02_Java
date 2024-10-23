package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService2 {

//	Map : key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
//	key를 모아두면 Set의 특징(중복 x)
//	Value를 모아두면 List의 특징(중복 o)
	
	public void ex1() {
		
//	HashMap<K, V> : Map 의 자식 클래스 중 가장 대표되는 Map
	Map<Integer, String> map = new HashMap<Integer, String>();
	
//  Map<Integer, String>: 
//	Map 타입의 변수 map을 선언하고, 이 map은 Key가 Integer, **Value가 String**인 Key-Value 쌍을 저장할 수 있음
	
//	new HashMap<Integer, String>():
//	HashMap 클래스를 사용하여 새로운 HashMap 객체를 생성하고, 이를 map 변수에 할당합니다.
	
//	Key는 중복을 허용하지 않음:
//	예를들어, map.put(1, "홍길동"); 이후에 다시 map.put(7, "최길동"); 을 추가하면, 다른 Key가 동일한 Value("최길동")를 가질 수 있습니다.

//	빠른 검색:
//	HashMap은 내부적으로 해시테이블을 사용하여, Key를 기반으로 값을 빠르게 검색할 수 있습니다.
	
	
//	Map, HashMap 둘다 import 처리를 했다
	
//	Map.put(Integer Key, String Value) : 추가
	map.put(1, "홍길동");
	map.put(2, "고길동");
	map.put(3, "김길동");
	map.put(4, "박길동");
	map.put(5, "이길동");
	map.put(6, "최길동");
	
//	key 중복 테스트
	map.put(1, "홍홍홍"); // 중복 허용 x, eotls Value 덮어쓰기
	
//	value 중복 테스트
	map.put(7, "최길동");
	
//	{K=V , K=V...}
	System.out.println( map ); // map.toString() 오버라이딩 되어있음
	
}
	
	public void ex2() {
		
//		Map 사용 예제
		
//		VO란? Value Object 또는 DTO라고 불림 주로 값을 저장하고 전달하는 용도로 사용됨
//		VO(값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용
//		-> 재사용이 적은 VO는 오히려 코드 낭비
//		-> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있음.
		
		
//		1) VO 버전
		Member mem = new Member();
//		mem 변수에 new Member();를 저장함 VO 버전?
//		Member 클래스는 사용자 정보 (예: ID, 비밀번호, 나이 등)를 저장하기 위한 객체다 일반적으로 Member 클래스는 필드와 getter/setter 메서드를 포함하여 데이터를 관리하는 방식으로 사용됨
		
//		new Member(); :
//		객체 생성: new 키워드를 통해 Member클래스의 인스턴스를 생성합니다.
//		Member 클래스에 인스턴스를 생성한다면 메모리에 이 클래스의 객체가 할당됩니다. 이 객체는 사용자 정보를 저장할 준비가 됩니다.
//		mem 변수는 이 Member 객체를 참조합니다.
		
//		이 코드는 새로운 Member 객체를 생성하고 그 객체를 mem 이라는 참조변수에 할당하는 코드이다
//		이후 setter 메서드를 통해 사용자 정보를 mem 객체에 저장할 수 있다
		
		// 값세팅
		mem.setId("user01");
		mem.setPw("user01");
		mem.setAge(30);
//		mem 변수를 통해서 값을 세팅함
//		해당 코드를 통해 값을 설정하고, mem.getId()로 값을 출력할 수 있습니다.
		

		// 값출력
		System.out.println( mem.getId() );
		System.out.println( mem.getPw() );
		System.out.println( mem.getAge() );
		
//		2) Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
//		Key는 String으로 각의 정보를 구분할 때 사용되며 Object는 Value이고 다양한 타입의 데이터를 저장할 수 있다
//		value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있다.
//		Key는 중복을 허용하지 않으며, Value는 중복이 가능합니다.

//		Map<String, Object>
//		String 타입의 Key와 object 타입의 Value를 갖는 Map입니다.
//		Key는 String으로, 각각의 정보를 구분할떄 사용 ("id", "pw", "age")
//		Value는 Object로 지정되어 있기 때문에 어떤 타입의 데이터도 저장할 수 있습니다 이는 int, String, boolean 등 다양한 데이터를 저장하는데 유리
//		예를 들어 "id"는 String 값을 가질 수 있고, "age"는 Integer 값을 가질 수 있습니다.
		
//		new HashMap<String, Object>()
//		HashMap은 Map 인터페이스를 구현한 대표적인 클래스이다
//		Map<String, Object> map 에서 Key는 String, Value는 Object라고 말해두었다 
//		Key-Value 쌍으로 데이터를 저장하며, Key로 Value에 빠르게 접근할 수 있습니다.
//		Key는 중복될 수 없지만, Value는 중복 가능합니다.
		
//		이후에는 put() 메서드를 통해 Key-Value 쌍을 추가할 수 있음
		
//		값세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
//		Key "id"와 Value "user02"를 저장했음
//		Key "pw"와 Value "pass02"를 저장했음
//		age는 Object 타입으로 저장되었지만, 실제 값은 Integer(25)로 자동 변환된다
		
		
		// 값출력
		System.out.println( map.get("id") );
//		key를 적으면 value를 반환함
//		System.out.println(): 콘솔에 값을 출력하는 자바의 기본 메서드입니다
//		여기에 map.get("id")를 전달하면 get 메서드의 결과(즉, "id"에 해당하는 Value)가 콘솔에 출력됩니다.
//		위 코드의 동작을 설명하자면 map.get("id")가 호출되어 Key "id"에 저장된 Value를 반환하며 Value의 값은 user02 이다
//		한마디로 map.get"id"를 적으면 user02가 호출된다는 뜻이다
		
		
		
//		Auto Boxing / Auto UnBoxing
//		Auto Boxing : 기본 자료형 데이터를 객체 타입 Wrapper 클래스로 자동 변환
//		int -> Integer
//		map.put("age", 25);
//		-> map.put("age", Integer.valueOf(25));
		
//		Auto UnBoxing	:	Wrapper클래스인 객체를 기본 자료형 데이터로 자동 변환
//		int num = Integer.valueOf(100);
		
//		값출력
//		Object(Value) Map.get(Object Key) : 매개변수로 전달받은 Key와 대응되는 value 반환
//		이 메서드는 매개변수로 전달된 Key에 해당하는 Value를 반환함
//		만약 Key가 존재하지 않으면 null을 반환함 즉 "id"라는 Key가 map에 저장되지 않은 경우, map.get("id")는 null을 반환하게 된다
		System.out.println(	map.get("id") );	// "user02" 출력
		System.out.println(	map.get("pw") );	// "pass02" 출력
		System.out.println(	map.get("age") );	// 25 출력
//		get() 메서드는 Key로 저장된 값을 빠르게 검색하고 반환해주는 역할을 한다 Key가 없을 경우에는 null을 반환함
		
		System.out.println("--------------------------------------");
		
		
//		** Map에 저장된 데이터 순차적으로 접근하기
		
//		Map에서 Key만 모아두면 Set의 특징을 가진다.
//		-> 이를 활용해서 Map에서 KeySet() 메서드 제공
//		-> Key만 모아서 Set으로 반환
		
		Set<String> set = map.keySet(); // id, pw, age 가 저장된 Set반환
//		map.keySet() 메서드는 Map 인터페이스에서 제공하는 메서드로, Map에 저장된 모든 Key를 Set 형태로 반환됩니다
//		Set의 특징: 중복을 허용하지 않기 때문에, Map에서 Key들은 중복되지 않는 고유한 값이어야 한다
//		즉 Set의 원소는 Map의 Key들이다
		
//		map.KeySet() 은 map 객체에 저장된 모든 Key를 모아서 Set으로 반환됨
//		여기서 반환된 Set은 String 타입의 Key들이 저장된 집합이다
//		예를 들어, map에 id, pw, age 라는 Key가 있다면 keySet()은 ["id", "pw", "age"]와 같은 Key들로 구성된 Set을 반환함
		
		
		
		System.out.println("keySet() : " + set);
//		System.out.println() 은 콘솔에 값을 출력하는 메서드입니다.
//		이 부분에서는 set 에 저장된 Key값을 출력하게 됩니다.
//		"keySet() : " 이라는 문자열과 함께 set 변수에 저장된 값들이 출력됩니다.
		
		
		
		
//		향상된 for문
		for(String key : set) {
			System.out.println( map.get(key) );
			
//			map에 저장된 데이터가 많거나
//			어떤 key가 있는지 불분명 할 떄
//			또는 map에 저장된 모든 데이터에 접근해야 할 때
//			keySet() + 향상된 for문 코드 사용
			
//			set에 저장된 Key를 하나씩 순차적으로 가져와서, 해당 Key에 대응되는 Value를 **map.ger("id")는 "user02"가 되므로, Key에 대응하는 Value가 출력됨
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	}

