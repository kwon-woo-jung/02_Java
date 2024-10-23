package edu.kh.collection.pack2.model.service;


import java.util.LinkedHashSet;
import java.util.Set;
import edu.kh.collection.pack2.model.dto.Person;

public class SetService3 {

	public void method1() {
//	반환할 값 없이 출력하고 싶을떄 void를 작성하면 가능하다
		
	Set<String> set = new LinkedHashSet<String>();
//	set은 중복되지는 않지만 순서 상관없이 저장하는 객체이다 그런데 LinkedHashSet은 순서를 유지하면서 중복또한 없게 저장할 수가 있다
	
	System.out.println("학생 이름을 입력하세요 : ");
	System.out.println("(종료하려면 'exit' 입력) ");
//	학생 이름을 입력하세요 (종료하려면 'exit'입력)을 추가할 예정이다
	
	set.add("길동");
	set.add("수희");
	set.add("민지");
	set.add("민지");
	set.add("길동");
//	set떄문에 중복은 불가능 하지만 .add 때문에 문자열을 나열할 수 있다
	
	System.out.println(set);
//	set을 사용할 수 있게 입력 해준다
	
//	System.out.println( "set.size() : " + set.size() );
//	set.size()는 중복되지 않으면서 유일한 요소들만 출력해주는 메서드이다
	
	System.out.println( set.remove("길동") );
	System.out.println( set.remove("수희") );
	System.out.println( set.remove("민지") );
	System.out.println( set );
//	remove() 메서드는 set에 있는 문자열 중에서 제거하고자 하는 문자열을 제거할수 있는 메소드입니다
//	그리고 remove() 메서드를 통해서 제거하는 문자열이 존재하면 true, 없으면 false를 반환함
	
	System.out.println("중복이 제거된 학생 이름 목록 : ");
//	중복이 제거된 학생 이름 목록을 말 그대로 입력하기 위해 적은 소스코드이다
	
	set.add("길동");
	set.add("수희");
	set.add("민지");
//	.add를 통해서 문자열을 나열할 예정이다
	
	set.clear();
//	set 에 저장된 모든 요소를 제거하는 메서드 
	
	}
}
	