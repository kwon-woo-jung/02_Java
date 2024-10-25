package edu.kh.collection.pack3.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.pack1.model.dto.Student;
import edu.kh.collection.pack3.model.dto.Member;

public class Test {
	
	private List<String> testList = new ArrayList<String>();
//	부모타입(List) 참조변수(testList) = 자식객체 (ArrayList) 주소 대입
//	List를 이용해서 학생들의 이름을 저장할 예정이라 List<String>을 입력함

	
//	private List< Map<String, Integer> > testList = new ArrayList<Map<String, Integer> > ();
//	부모타입(List) 참조변수(testList) = 자식객체 (ArrayList) 주소 대입
//	List를 이용해서 학생들의 이름을 저장할 예정이라 List<String>을 입력함 그리고 List와 Map을 이용해야 하기 때문에 List와 Map을 같이 붙이는 메서드를 입ㄹ
	
		
	public void ex1() {
		
		
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		key에 Integer Value에 String new HashMap을 클래스를 사용하여 새로운 HashMap객체를 생성하고, 이를 map 변수에 할당함
		
//		mem.put(1, "김영희");
//		mem.put(2, "홍길동");
//		mem.put(3, "김철수");
//		mem.put(4, "이유리");
//		mem.put(5, "박맹구");
			
		testList.add("김영희");
		testList.add("홍길동");
		testList.add("김철수");
		testList.add("이유리");
		testList.add("박맹구");
		
//		참조변수에 testList를 넣어 두었으며 String 타입의 매개변수만 저장할 수 있게 설정 해두었음
		
			System.out.println( testList.get(0) );
			System.out.println( testList.get(1) );
			System.out.println( testList.get(2) );
			System.out.println( testList.get(3) );
			System.out.println( testList.get(4) );
//			List는 배열과 비슷하다 순서가 있는 데이터를 저장할 수 있으며 삭제 및 추가가 가능하다
//			다만 배열과 다르게 크기가 고정 되어 있지는 않다
			
			System.out.println("학생 이름을 입력하세요 : " + testList);
//			testList에 입력된 학생의 이름을 입력하면 출력될 것이다
	}
	
		public void ex2() {
			Map<String, Integer> map = new HashMap<String, Integer>();
//			해당 코드를 통해서 List에 입력한 학생들을 Map에 점수를 
			
			map.put("김영희", 85);
			map.put("홍길동", 92);
			map.put("김철수", 77);
			map.put("이유리", 60);
			map.put("박맹구", 95);
//			map.put을 이용해서 key는 String인 문자열 Value는 정수인 Integer를 입력 했다
			
			System.out.println( map.get("김영희") );
			System.out.println( map.get("홍길동") );
			System.out.println( map.get("김철수") );
			System.out.println( map.get("이유리") );
			System.out.println( map.get("박맹구") );
//			만약 key에 입력된 문자열중에서 예시로 김영희를 입력 한다면 value값은 85가 출력될 것이다
//			
			
			Set<String> set = map.keySet();
//			Set<String> 은 Set에 중복되지 않는 String 타입의 Key의 값들만 들어간다는 뜻
//			map.KeySet() 메서드는 Map에 저장되어 있는 모든 Key Set 형태로 반환 한다는 뜻이다
//			Set에 중복되지 않으면서 key 안에 들어갈 String 타입의 문자열을 집어 넣는 다는 뜻이다 
			
			System.out.println("성적을 조회할 학생의 이름을 입력하세요 : " + set);
//			set 변수에 저장되어 있는 값들이 입력한 값에 따라 출력될 예정
			
			for(String key : set) {
				System.out.println( map.get(key) );
			}
//			향상된 for문을 사용한다
			
//			일반 for문이 아닌 향상된 for문에 해당됨
//			key값에 String을 입력해 두었다 그래서 set<String> set**에 저장된 Key 값들을 하나씩 가져와서 Key 변수에 저장하면서 반복할것임
//			그리고 key에 대응되는 Value를 출력되게 해줄 예정
			
			
	
	/*public void ex3() {
//		List 안에 Map을 넣을 예정
		List< Map<String, Integer> > list = new ArrayList<Map<String, Integer> >();
		
		for(int i=0; i< 5; i++) {
			
			// Map 생성
			Map<String, Integer> map = new HashMap<String, Integer>();
			
//			Map에 데이터 추가
			map.put("id", "user0" + i);
			map.

			// Map을 List에 추가
			list.add(map);
			
		}
		
		// for문 종료 시 list에 10개의 Map
		
		// 향상된 for문 이용하여 key가 
		
		
	}
	
	*/
		}
}
	
