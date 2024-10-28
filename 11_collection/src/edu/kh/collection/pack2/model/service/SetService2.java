package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService2 {
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public void method1() {
		
		Set<String> set = new HashSet<String>();
//		set과 HashSet을 import 해준 다음 제네릭에 <String>을 해줘서 Set과 HashSet에 String 값을 넣어줬다
//		HashSet은 객체들을 순서없이 저장하고 동일한 객체는 중복 저장하지 않는다
//		HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어낸다
//		즉 new HashSet<>(); 으로 객체 선언 해준것이다
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
//		boolean add(E e) : 추가
		
//		우선 set은 중복을 허용하지 않는다 다만 여러개의 문자열을 각 메서드 마다 호출하기 위해선 각 문자열 마다 set.add를 붙이는 것이다
//		또한 순서조차 존재하지 않으며 add()는 boolean 값을 반환합니다 만약 새로운 요소가 성공적으로 추가 된다면 true를 반환하고
//		중복된 요소가 이미 set에 존재한다면 추가하지 않고 false를 붙입니다
		
		System.out.println(set);
//		여기서 set의 역할은 위에 여러개의 문자열을 중복되지 않으며 순서에 상관없이 저장할 수 있게 해주는 역할을 한다
//		더 나아가서 HastSet은 순서 유지 없이 저장하고
//		LinkedHashSet은 순서를 유지하며 저장한다
//		마지막으로 TreeSet은 자동으로 정렬 되며 저장한다
		
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
//		마찬가지로 해당 소스코드도 중복되게 저장해 두었지만 set.add를 붙이며 System.out.println(set); 덕분에 순서는 상관없지만 중복되지 않게 출력될수 있다
		
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
//		또한 문자열 대신 null을 붙이다고 하더라도 중복되게 저장되지 않는다 다만 null은 여러번 적어도 오류는 안나오는대신 1번만 나오게 출력이 된다
		
		System.out.println("set.size() : " + set.size());
//		set.size()에서 size() 메서드는 컬렉션에 저장된 요소의 개수를 반환하는 메서드입니다.
//		set은 중복된 요소는 저장하지 않고 null처럼 중복된 값은 하나만 저장된다 그 결과 유일한 요소들의 개수들만 반환된다
//		즉 set.size()는 set안에 고유한 요소의 총 개수를 반환합니다
		
		System.out.println( set.remove("배달의민족") );
//		remove() 메서드는 set에서 특정 요소를 제거하는 메서드입니다.
//		set.remove("배달의민족") 는 set에서 배달의민족 이라는 문자열을 제거하려고 시도합니다.
//		만약 remove()메서드를 통해 제거하려는 요소가 존재하면 true를 반환하고, 존재하지 않으면 false를 반환합니다.
		
		System.out.println( set.remove("유플러스") );
//		set에서 유플러스라는 문자열을 제거하려고 시도합니다
//		하지만 제거할 요소가 존재하지 않으므로 false로 반환됩니다
		
		System.out.println( set );
//		set에 저장된 모든 요소를 출력하는 코드입니다.
//		set은 중복을 허용하지 않기 때문에 동일한 값이 여러 번 추가되어도, 중복된 값은 하나만 출력됩니다.
//		추가된 순서와 관계없이 HashSet은 저장된 순서를 유지하지 않으며, 요소들이 무작위 순서로 출력됩니다.
		
		// 4. boolean contains(E e) :
		//  전달받은 e가 Set에 있으면 true, 없으면 false
		System.out.println("쿠팡 있는지 검사 : " + set.contains("쿠팡"));
		System.out.println("삼성 있는지 검사 : " + set.contains("삼성"));
//		**contains (E e)**는 Set에 특정 요소가 있는지 확인하는 메서드입니다.
//		E e는 찾고자 하는 요소의 값이며, 이 값이 Set에 존재하면 true를 반환하고 존재하지 않으면 false를 반환함
		
		// 5. void clear() : Set에 저장된 내용을 모두 삭제
		set.clear();
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println( set.isEmpty() );
		System.out.println( set );
//		비어있는지 여부를 확인하는 메서드이며 set이 비어있으면 true를 반환하고 요소가 하나라도 있으면 false를 반환합니다.
	}
	
	public void method2() {
		
		Set<String> set = new HashSet<String>();
//		HashSet을 사용하여 set이라는 집합을 생성합니다. HashSet은 순서없이 데이터를 저장하며, 중복된 값을 허용하지 않습니다.
//		제네릭 타입에 String은 이 HashSet이 문자열에 저장하도록 지정하는 역할을 합니다
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");
//		set.add() 메서드를 사용하여 HashSet에 문자열 데이터를 추가합니다.
//		중복된 값이 없는 경우에만 추가가 이루어지며, HashSet은 중복된 값을 허용하지 않습니다.
//		그리고 HashSet은 순서를 보장하지 않습니다, 중복된 값이 저장되지 않기 때문에 동일한 값이 여러 번 추가되더라도 하나만 저장됩니다.
		
		Iterator<String> it = set.iterator();
//		우선 Iterator를 import 지정 해준다
//		HashSet에 저장된 요소들을 반복하기 위한 Interator 객체를 생성하는 역할을 합니다.
//		Iterator란? 컬렉션에 저장된 요소들을 하나씩 순차적으로 접근할 수 있는 도구입니다.
//		Set, List, Map 등과 같은 컬렉션에 저장된 요소들을 순차적으로 처리할떄 사용됩니다
//		Iterator는 일종의 커서로, 컬렉션 내부에서 반복적으로 요소에 접근할 수 있는 방법을 제공합니다.
//		그럼 여기서 set.iteratior()은 HashSet에서 Iterator 객체를 반환하는 메서드입니다.
//		이 Iterator는 set에 저장된 요소들을 차례대로 꺼낼 수 있게 해줍니다.
//		HashSet은 요소의 순서를 보장하지 않지만, Iterator는 HashSet 내부에서 순서에 상관없이 저장된 요소들을 차례대로 접근할 수 있습니다.
//		Iterator<String> it 은 Iterator<String> 부분에선 문자열 String 요소들에 대한 반복을 지원하는 Iterator 객체입니다.
//		즉 이 it 객체는 set에 저장된 문자열 요소들을 하나씩 접근할 수 있도록 도와줍니다.
		
		System.out.println("[Iterator]");
//		단순히 문자열 [Iterator]를 콘솔에 출력하기 위해 적은 소스코드입니다
		
		while(it.hasNext()) {
//			이 부분은 Interator를 사용하여 HashSet에 저장된 요소들을 하나씩 순차적으로 처리하는 반복문 입니다 it.hashNext는 Iterator에 다음으로 꺼낼 요소가 있는지 여부를 확인하는 메서드입니다
//			다음 요소가 존재하면 true를 반환하고, 반복문은 계속 실행됩니다 요소가 더 이상 존재하지 않으면 false를 반환하고 반복문은 종료됩니다.
			
			String temp = it.next();
//			it.next()는 Iterator가 현재 가리키는 요소를 반환하고, 그 위치를 다음 요소로 이동시킵니다.
//			Iterator는 ArrayList, Hashmap, HashSet과 같은 Collection을 반복하는 데 사용할 수 있는 객체를 뜻하며 Iterator를 사용하면 원하는 요소에 도달할 때까지 next() 메서드를 반복적으로 호출해 특정 요소를 검색할 수 있다
//			해당 코드는 set에 저장된 문자열 요소중 하나를 꺼내 temp 변수에 저장하는 역할을 해주는 코드입니다
			
			System.out.println(temp);
//			temp에 저장하는 역할을 합니다 Iterator는 한 번 꺼낸 요소는 다시 반환하지 않으며, 계속해서 다음 요소로 이동합니다.
		}
		
		System.out.println("-------------------------------");
		System.out.println("[List로 반환]");
//		문자열에 ["List로 반환"] 한다는 언어이다
		
		List<String> list = new ArrayList<String>(set);
//		문자열 유형의 목록을 만들고 목록은 잠재적으로 다른 유형의 목록으로 타입 캐스팅 될 수 있음
//		해당 코드는 대량의 코드를 작성할 때 유형에 맞게 전활 할 수 있음
//		나중에 ArrayList에 만족하지 않으면 코드 한 줄만 변경하면 됩니다.
		
//		new ArrayList<String>(set); 는 ArrayList의 생성자 중 하나로, 컬렉션을 인수로 받아 해당 컬렉션의 요소들을 모두 복사하여 ArrayList에 저장합니다.
//		여기서는 set에 저장된 요소들을 ArrayList로 복사하여 새로운 리스트 list를 생성합니다.
//		즉 set에 있는 값들이 그대로 list에 복사되지만, 리스트는 순서를 보장하고 이후에는 리스트의 특성을 사용 할 수 있습니다.
//		한마디로 set에 있던 요소들이 ArrayList로 변환한 후 , 변환된 리스트 요소들을 순차적으로 출력합니다.
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}
//		전통적인 for문이므로 int i = 0; 은 i는 0부터 시작하며 i는 인덱스 역할을 합니다
//		i < list.size(); 는 i가 list의 크기보다 작을 때까지 반복합니다. list.size();는 리스트에 저장된 요소의 개수를 반환합니다.
//		i++는 반복이 끝날 때마다 i의 값이 1씩 증가하여 리스트의 다음 요소로 이동합니다
		
		System.out.println("--------------------------");
		System.out.println("[향상된 for문]");
		
		for(String snack : set) {
			System.out.println( snack );
//		향상된 for문으로, 주로 컬렉션이나 배열의 모든 요소를 간편하게 접근할때 사용 됨
//		for(String snack : set) : set에 저장된 모든 요소를 하나씩 snack 변수에 할당하면서 반복합니다. set의 요소는 순서가 없기 때문에 어떤 순서로 출력될지는 보장되지는 않는다
//		System.out.println( snack ); : 현재 snack 변수에 저장된 set의 요소를 출력하는 코드입니다.
			
//		일반적인 for문을 사용하면 순서대로 출력이 되겠지만 set의 요소를 사용한 향상된 for문은 순서에 상관없이 출력될 것이다
			
			
		}
	}
	
	public void method3() {
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
//		p1 ~ p4 객체 생성 후 새로운 Person 클래스를 통해 ("홍길동", 25, '남')을 출력할 것이다
		
		Set<Person> personSet = new HashSet<Person>();
//		제네릭 Person은 personSet 변수저장해두고, new HashSet<Person>();을 출력할 예정이다.
//		HashSet은 중복을 허용하지 않는 자료 구조이다 해당 객체가 이미 존재한다면 새로운 객체는 저장되지 않는다.
		
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
//		.add를 통해서 personSet의 객체들을 나열할 것이다 p1 ~ p4들을 대입해서
		
//		이 코드들은 HashSet<Person>에 person 객체들을 추가하는 과정입니다.
//		각각 p1, p2, p3, p4 라는 person 객체들을 HashSet인 personSet에 저장하는 역할을 합니다
//		이 코드들은 HashSet<Person>에 person 객체들을 추가하는 과정입니다. 각각 p1, p2, p3, p4 라는 person 객체들을 HashSet인 personSet에 저장하는 역할을 합니다.
//		
		System.out.println("-------------------------");
//		단순하게 ("-------------------------");를 콘솔에 출력할 코드입니다.
		
		for(Person p : personSet) {
			System.out.println(p);
//		향상된 for문을 사용해서 순서에 상관없이 출력할 예정이다 personSet에 저장된 모든 요소를 하나씩 p 변수에 할당하면서 반복할것이다.
			
		}
		
		System.out.println("------------------------");
		
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
//		p1 ~ p4 라는 person 객체들의 해시코드를 출력하는 부분입니다.
//		각 객체의 해시코드는 고유한 값이 될 수 있으며, 이 값에 따라 HashSet과 같은 자료구조에서 객체가 어떻게 구분되는지가 결정됩니다.
//		각 객체의 해시코드는 고유한 값이 될 수 있으며, 이 값에 따라 HashSet과 같은 자료구조에서 객체가 어떻게 구분되는지가 결정됩니다.
//		hashCode를 왜 출력하냐면 HashSet에서 중복 여부를 결정할 떄, hashCode()가 얼마나 중요한지를 보여주기 위한 목적이 있습니다.
//		HeshSet은 객체를 추가할 때 hashCode()를 먼저 비교하고, 같은 해시코드일 떄만 equals()를 사용하여 두 객체가 동일한지 확인합니다.
		
//		p1과 p2는 필드 값이 같다 그래서 hashCode()가 필드를 기준으로 오버라이딩되어 있다면, 두 객체의 해시코드는 동일하게 나옵니다.
//		p3와 p4는 필드 값이 다르므로 서로 다른 해시코드를 가집니다.

		// A.equals(B) : A와 B가 가지고있는 필드값이 같다면 true
		System.out.println( p1.equals(p2) );
		System.out.println( p1.equals(p3) );
//		p1.equals(p2)는 **같은 필드 값을 가지므로 true** 가 반환됩니다
//		p1.equals(p3)는 **나이가 다르기 때문에 false**가 반환됩니다
		
		// **********************************************
		// Hash 라는 단어가 포함된 컬렉션 이용 시
		// hashCode(), equals() 오버라이딩 필수적으로 진행해야 한다!!!!!!
		// **********************************************
		
//		hashCode()란? 객체를 식별하고 고유한 정수 값을 반환하는 메소드입니다. 이 값은 객체를 빠르게 구분하기 위해 사용됩니다
//		자바의 object 클래스에서 제공하는 메서드로, 일반적으로 객체의 메모리 주소를 기반으로 해시코드를 반환합니다.
//		하지만 객체의 필드 값을 기반으로 hashCode()를 오버라이딩하여 두 객체가 동일한 필드 값을 가질 경우 동일한 해시코드를 반환하도록 할 수 있습니다.

//		HashSet은 해시 기반의 자료구조로, 중복을 허용하지 않는 컬렉션입니다. 중복된 객체를 구분하기 위해 hashcode()와 equals() 메서드를 사용합니다.
		
//		hashCode()와 equals()의 오버라이딩
//		HashSet과 같은 해시 기반 컬렉션을 사용할 때는, hashCode()와 equals()를 반드시 오버라이딩해야 합니다. 그 이유는 논리적으로 동일한 객체를 중복으로 저장하지 않기 위해서 입니다.
//		hashCode()와 equals()를 오버라이딩하지 않으면, 값이 같더라도 메모리 주소가 다르기 때문에 중복된 객체로 처리되지 않고 모두 저장될 수 있습니다.
		
	}
	
	public void method4() {
//		난수생성하는 방법
//		1) Math.random()
//		2) Random.nextInt()
		
		Random random = new Random(); // 난수 생성
//		Random 클래스의 인스턴스 random을 생성합니다
//		생성된 random 객체를 통해 다양한 유형의 난수를 생성할 수 있습니다
		
		Set<Integer> lotto = new TreeSet<Integer>();
//		Set, TreeSet 모두 제네릭 Integer를 넣는다 Set은 중복없고 순서 상관없고 TreeSet은 자동정렬이다
//		Set은 중복을 허용하지 않기 때문에, 중복된 번호가 자동으로 제거됩니다.
//		TreeSet은 자동으로 정렬을 지원하기 때문에, 로또 번호가 오름차순으로 정렬되어 저장됩니다.
		
		while(lotto.size() < 6) {
			
			lotto.add( random.nextInt(45) + 1 ); // 1 ~ 45
		}
		System.out.println( lotto );
//		while 반복문을 통해서 lotto 크기가 6이 될때까지 무작위로 난수를 생성해준다
//		random.nextInt(45)는 0부터 44까지의 난수를 생성하므로, 여기서 +1을 하여 1부터 45까지의 숫자를 생성합니다.
		
	}
		
		/** 로또 번호 생성기
		 * 금액을 입력받아 (천원 단위)
		 * 1000원 당 1회 씩 번호를 생성해서 List에 저장한 후
		 * 생성 종료 시 한 번에 출력
		 * 
		 * <pre>
		 * 금액 입력 : 3000
		 * 
		 * 1회 : [11, 20, 34, 35, 42, 43]
		 * 2회 : [1, 12, 22, 33, 35, 44]
		 * 3회 : [5, 6, 24, 43, 44, 45]
		 * 
		 * </pre>
		 * 
		 */
	
	public void lottoNumberGenerator() {
		
		Scanner sc = new Scanner(System.in);
//		Scanner는 자바에서 사용자로부터 입력을 받기 위한 클래스이다
//		Scanner 객체를 생성하고 System.in은 포준 입력을 통해 데이터를 읽어온다
		
		System.out.print("금액 입력 : ");
		int amount = sc.nextInt();
//		nextInt() 메서드는 사용자가 입력한 정수를 받아서 amout 변수에 저장합니다. amout는 금액을 저장하는 역할을 한다
//		amount는 사용자가 입력한 금액을 저장하는 정수형 변수이다
		
		Random random = new Random();
//		Random 클래스를 통해 random 객체를 만들어서 새로운 기본 생성자를 만듬
//		new Random(); 은 Random 클래스의 인스턴스를 생성하여 이 객체가 다양한 난수를 만들 수 있게 해줌
//		이후 random.nextInt(45) 메서드를 사용해 0부터 44까지의 정수 중 무작위 값을 생성하고, 이를 +1 하여 1부터 45까지의 난수를 생성합니다.
		
		// 생성된 로또 번호 묶음(TreeSet)을 저장할 List
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
//		제네릭은 클래스나 메서드에 사용할 데이터 타입을 컴파일 시점에서 명시할 수 있도록 하는 자바의 기능이다
//		제네릭을 사용함으로서 타입 안정성을 보장한다
//		List는 순서가 있는 요소들의 집합으로, 같은 값을 중복해서 저장 하다 또한 로또 번호 세트를 여러개 저장하는데 사용됨
//		Set<Integer>는 중복을 허용하지 않으며 자동으로 정렬됩니다 set은 각 회차의 로또 번호 6개를 저장하며 Integer는 로또 번호가 정수이므로 제네릭 타입으로 사용됩니다.
//		즉 List<Set<Integer>>는 여러 개의 Set을 저장하는 리스트로, 각 Set에는 로또 번호가 6개씩 저장됩니다.
//		정의하면 여러 개의 로또 번호 세트를 저장하는 리스트이다 이때 각 세트는 Set<Integer>로, 로또 번호 6개가 들어있습니다.
		
		// for문 반복될 때 마다 새로운 TreeSet 객체 생성
		for( int i = 0; i < amount/1000; i++ ) {
//			일반 for문은 i가 0이랑 같고 i가 amount/1000; 보다 낮을 때 까지 반복할 것이며 i++는 반복될 때마다 1씩 증가할 예정이다
//			해당 코드는 사용자가 입력한 금액에 따라 로또 번호를 몇 번 생성할지 결정합니다.
//			amount/1000은 입력한 금액을 1000으로 나눈 값만큼 반복합니다. 이는 1000원당 1번의 로또 번호를 생성하는 의미입니다.
//			예를 들어, 사용자가 3000원을 입력했다면 3000 / 1000 = 3회가 되므로, for문은 3번 반복됩니다.
			
//			초기식 int i + 0; 은 i는 반복 횟수를 세기 위한 변수로, 처음에는 0으로 설정됩니다.
//			조건식 i < amout/1000; 은 i가 입력된 금액을 1000으로 나눈 값보다 작은 동안 반복이 계속됩니다.
//			증감식 i++ 각 반복이 끝날 때마다 i의 값이 1씩 증가합니다.
			
			Set<Integer> lotto = new TreeSet<Integer>();
//			Set은 중복을 허용하지 않는다 TreeSet은 자동으로 정렬된다 따라서 즉 로또번호를 중복되지 않게 뽑아야 하며 자동으로 번호가 정렬되게 해주는 코드이다
//			해당 코드는 중복된 값을 제거하면서 자동으로 번호가 정렬된다
//			TreeSet<Integer>은 사용한 로또 번호를 저장하는 소스코드이다
//			
			
			while(lotto.size() < 6) {
				lotto.add( random.nextInt(45) + 1 ); // 1 ~ 45 사이 난수 발생
			}
//			로또 번호가 6개 될떄까지 계속해서 번호를 생성하는 역할을 한다. 즉 lotto의 크기가 6이 될 때까지 반복됩니다.
//			조건식: lotto.size() < 6 
//			Set<Integer> lotto 에 저장된 요소의 개수를 나타내는 size() 메서드를 사용하여, 로또 번호가 6개 미만일 때만 계속 반복합니다.
//			random.nextInt(45)는 0부터 44까지의 난수를 생성하고 여기서 +1dmf ejgotj 45개 까지의 난수를 만들어 줍니다
//			생성된 난수에 lotto를 추가할려면 lotto.add를 작성해야한다
//			set 덕분에 중복된 값은 자동으로 걸러진다
			
			lottoList.add(lotto); // List Set 추가
//			lottoList는 여러 회차의 로또 번호 세트를 저장하는 리스트이며 각 회차에 로또 번호에 저장된 Set<Integer>**를 하나씩 리스트에 추가합니다
//			그리고 각 회차의 로또번호를 관리합니다.
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
