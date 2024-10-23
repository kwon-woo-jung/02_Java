package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService3 {

	public void ex1() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
//		key는 Integer Value는 String이라는 뜻이다 new HashMap은 HashMap 클래스를 사용하여 새로운
//		HashMap 객체를 생성하고, 이를 map 변수에 할당함
//		HashMap은 내부적으로 해시테이블을 사용해서 Key 덕분에 값을 빠르게 검색 가능
		
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
//		Key 중복 테스트
		map.put(1, "홍홍홍");
//		해당 코드는 key에 1이 이미 존재 하는데 중복되는 "홍홍홍" Value를 넣어서 Key 1에 홍길동이 아닌 "홍홍홍"을 넣을것이다
		
//		value 중복 테스트
		map.put(7, "최길동");
//		해당 코드는 Key 7은 없지만 Value에 최길동은 중복되어 있다 하지만 Key만 중복허용이 불가능하기에
//		Value가 중복되어도 상관없으며 똑같이 출력될것이다
		
//		{K=V , K=V...}
		
		System.out.println( map ); // map.toString() 오버라이딩 되어있음
//		해당 코드는 map 객체에 모든 Key-Value 쌍을 출력할때 사용됨
		
	}
	
		public void ex2() {
			
			Member mem = new Member();
//			해당 코드는 새로운 Member 객체를 생성하고 그 객체를 mem 이라는 참조변수에 할당하는 코드이다
//			이후 setter 메서드를 통해 사용자 정보를 mem 객체에 저장할 수 있다
			
			// 값세팅
			mem.setId("user01");
			mem.setPw("user01");
			mem.setAge(30);
//			mem 변수를 통해서 값을 세팅하며 해당 변수를 통해 mem.getId()로 값을 출력할 수 있다
			
			// 값출력
			System.out.println( mem.getId() );
			System.out.println( mem.getPw() );
			System.out.println( mem.getAge() );
//			mem.setId
//			mem.setPw
//			mem.setAge
//			에서 세팅한 값을 출력하는 코드
			
			Map<String, Object> map = new HashMap<String, Object>();
//			Map<String, Object> map 은 Key는 String, Value는 Object 이란 뜻이며
//			Key는 값을 구분할때 사용되며 중복 허용이 안되고 Value는 어떤 타입의 데이터도 저장할 수 있음
//			Key : (id, pw, age) Value : (int, String, boolean)
			
			
			map.put("id", "user02");
			map.put("pw", "pass02");
			map.put("age", 25);		
//			key "id"와 Value "user02"를 저장했음
//			key "pw"와 Value "pass02"를 저장했음
//			age는 Object 타입으로 저장되었지만, 실제 값은 Integer(25)로 자동 변환된다
			
			System.out.println( map.get("id") );
//			System.out.println(); : 콘솔에 값을 출력하는 자바의 기본 메서드
//			여기에 map.get("id")를 전달하면 get 메서드의 결과가 출력되는데 바로 "user02" 이다
//			위 코드의 동작을 설명하자면 map.get("id")가 호출되어 key "id"에 저장된 Value를 반환하며 값은 user02 이다
//			또 여기서 map.ger("pw") );를 입력하면 pass02가 호출된다
			
			System.out.println(map.get("id")); // user02
			System.out.println(map.get("pw")); // pass02
			System.out.println(map.get("age")); // 25
			
			System.out.println("---------------------------------------");
			
			Set<String> set = map.keySet(); // id, pw, age 가 저장된 Set반환
//			Set<String> 은 Set에 중복되지 않는 String 타입의 Key의 값들만 들어간다는 뜻이다
//			map.keySet() 메서드는 Map에 저장되어 있는 모든 Key를 Set 형태로 반환 한다는 뜻이다 
//			Set은 중복이 안되며 Map에서 Key들은 중복되지 않는 고유한 값이여야 함
//			반환된 Set은 String 타입의 Key들이 저장된 집합이다
//			예를 들어 map에서는 id, pw, age 라는 Key 형태 KeySet()은 ["id", "pw", "age"]와 같은 Key들로 구성된 Set을 반환함
			
			System.out.println("ketSet() : " + set);
//			KeySet 이라는 문자열과 함께 set 변수에 저장된 값들이 출력됨
			
			for(String key : set) {
				System.out.println( map.get(key) );
//			향상된 for문을 사용한다
				
//			for(String key : set)은 **Set<String> set**에 저장된 Key 값들을 하나씩 가져와 
//			Key 변수에 저장하면서 반복할것임
				
//			map.get(key) : 각 Key에 대응하는 Value를 가져올것임
				
//			System.out.println(map.get(key)); 란 해당 Value를 출력할 예정
//			결과적으로 Map에 저장된 Key-Value 쌍에서 Value를 순차적으로 출력하는 역할을 함
				
				
			}
			
			
		}
	}

