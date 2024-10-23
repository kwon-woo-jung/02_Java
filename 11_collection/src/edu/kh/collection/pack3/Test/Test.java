package edu.kh.collection.pack3.Test;

import java.util.HashMap;
import java.util.Map;

import edu.kh.collection.pack3.model.dto.Member;

public class Test {

	public void ex1() {
		
//	Map<Integer, String> map = new HashMap<Integer, String>();
//	key에 Integer Value에 String new HashMap을 클래스를 사용하여 새로운 HashMap객체를 생성하고, 이를 map 변수에 할당함
	
//	mem.put(1, "김영희");
//	mem.put(2, "홍길동");
//	mem.put(3, "김철수");
//	mem.put(4, "이유리");
//	mem.put(5, "박맹구");
		
		Member mem = new Member();
		
		mem.setId("김영희");
		mem.setId("홍길동");
		mem.setId("김철수");
		mem.setId("이유리");
		mem.setId("박맹구");

		System.out.println( mem.getId() );
		System.out.println( mem.getId() );
		System.out.println( mem.getId() );
		System.out.println( mem.getId() );
		System.out.println( mem.getId() );
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", 85);
		map.put("id", 92);
		map.put("id", 77);
		map.put("id", 60);
		map.put("id", 95);
	
		System.out.println( map.get("id") ); // 김영희
		System.out.println( map.get("id") ); // 홍길동
		System.out.println( map.get("id") ); // 김철수
		System.out.println( map.get("id") ); // 이유리
		System.out.println( map.get("id") ); // 박맹구
		
		System.out.println("성적을 조회할 학생의 이름을 입력하세요 : 점 ");
		
		System.out.println("keySet() : " + set);
		
		for(String key : set) {
			System.out.println( map.get(key) );
		}
	}
}
