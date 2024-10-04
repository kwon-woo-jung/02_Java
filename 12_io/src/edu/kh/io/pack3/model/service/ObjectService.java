package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/* 직렬화, 역직렬화 파트 O
	 
	 자바에서 객체 데이터를 파일에 저장하거나
	 네트워크로 전송하고, 이를 다시 객체로
	 복원하는데 사용되는 중요한 개념
	 
	 직렬화는 바이트 스트림으로 변환하여 저장하거나
	 전송할 수 있도록 해주며
	 
	 역직렬화는 이 바이트 스트림을 다시
	 자바 객체로 복원하는 과정
	 
	 
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * ObjectOutputStream**과 **ObjectInputStream**을
	 * 사용하여 이루어지며, 바이트 기반 스트림을 보조하는 역할을 합니다.
	 *   
	 *   ObjectOutputStream은 객체를 바이트 스트림으로
	 *   직렬화하여 파일로 출력하는 보조 스트림입니다.
	 *   
	 *   ObjectInputStream은 파일에 저장된 바이트 스트림을
	 *   다시 객체로 역직렬화 하여 읽어오는 보조 스트림입니다.
	 *   (역직렬화)
	 *   
	 *   Java객체를 입/출력 할 때
	 *   사용하는 바이트 기반 "보조" 스트림
	 *   (보조 스트림은 단독 사용 불가능!)
	 *   
	 *   
	 *   
	 *   
	 *   
	 *   *** 직렬화(Serializable) ***
	 *   - 객체를 직렬(직선)형태로 변환
	 * 
	 *   Serializable 예시)
	 *   public class Member implements Serializable {
	 *   	private String id;
	 *   	private String name;
	 *   	private int age; 
	 * 
	 * 		// getter, setter, toString() 등...
	 * 
	 * 
	 * 
	 * 
	 * 	transient 키워드
	 * 	만약 직렬화 시 특정 필드를 제외하고 싶다면
	 * 	transient 키워드를 사용할 수 있습니다,
	 * 	transient 로 선언된 필드는 직렬화 대상에서
	 * 	제외 됩니다.
	 * 
	 *  예)
	 *  public class Member implements Serializable {
	 *   	private String id;
	 *   	private transient String password; // 직렬화 제외!!
	 *   	private String name;
	 *   	private int age; 
	 * 
	 * 	
	 * 
	 * 
	 * 	직렬화는 객체의 상태(필드 값)를 바이트 스트림으로
	 *  변환하여 파일에 저장하거나 네트워크를 통해
	 *  전송할 수 있게 하는 과정입니다. 객체가 직렬화되면
	 *  자바 객체는 메모리 외부에 저장할 수 있습니다.
	 * 	ObjectOutputStream 을 사용해 객체를 직렬화할 수 있습니다.
	 * 
	 *  역직렬화는 바이트 스트림으로 저장된 데이터를
	 *  다시 자바 객체로 복원하는 과정입니다.
	 *  직렬화된 데이터를 원래의 객체 형태로 변환하여
	 *  프로그램 내에서 사용할 수 있습니다.
	 *  ObjectOutputStream을 사용해 직렬화된 객체를 역직렬화 할 수 있습니다.
	 * 
	 * 
	 * */
	
	
	/**
	 * 객체를 외부 파일로 출력
	 * 내부 -> 외부 출력
	 *  직렬화 필요!
	 * 
	 */
	
	public void objectOutput() {
		/* objectOutput(): 객체 직렬화 및 파일로 출력
		   기능: Member 객체를 파일로 직렬화하여 저장합니다.
		   
		   작업 흐름:
		   FileOutputStream: 객체를 출력할 파일을 가리킼는 기반 스트림
		   ObjectOutputStream: FileOutputstream을 이용해 객체를 바이트 스트림으로
		   직렬화하는 보조 스트림.
		   
		   writeObject(): Member 객체를 직렬화하여 파일에 씁니다.
		   
		   
		   
		   writeObject():Member 객체를 직렬화하여 파일에 씁니다.
		   
		   직렬화 문제 해결: 만약 직렬화가 제대로 되지 않으면
		   java.io.NotSerializableException 예외가 발생합니다.
		   
		   이 문제는 Member 클래스에 Serializable 인터페이스를 구현하지 않았기 때문입니다.
		   Member 클래스에 Serializable 인터페이스를 추가해야 합니다.
		*/
		
		
		/*
		 * 코드 사용 흐름
		 * 1. 객체 직렬화 및 파일로 출력:
		 * object() 메서드를 호출하여 Member 객체를 직렬화하고 파일에 저장합니다.
		 * 
		 * 2. 객체 역직렬화 및 파일로부터 입력:
		 * objectIntpu() 메서드를 호출하여 저장된 파일에서 직렬화된 객체를 읽어와
		 * 역 직렬화한 뒤 객체 정보를 출력합니다.
		 * 
		 * */
		
		
		
		
		
		// 스트림 참조 변수 선언
		
		// FileOutputStream: 객체를 출력할 파일을 가리키는 기반 스트림.
		   FileOutputStream fos = null; // 기반 스트림
		
		ObjectOutputStream oos = null; // 객체 출력용 보조 스트림
		/* ObjectOutputStream: FileOutputStream을 이용해
		 * 객체를 바이트 스트림으로 직렬화하는 보조 스트림 */
		
		
		try {
			
			// .dat 확장자 : data를 담고 있는 파일을 나타내는 확장자
			fos = new FileOutputStream("/io_test/20240926/Member.dat");
			
			oos = new ObjectOutputStream(fos); // 객체 보조 스트림 생성
			
			// Member 객체 하나 생성
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			// ObjectOuputStream을 이용해서 Member 객체를 출력하기
			oos.writeObject(member);
			// writeObject(): Member 객체를 직렬화하여 파일에 씁니다
			
			System.out.println("회원 출력 완료");
			
			// [직렬화가 되지 않음]
			// java.io.NotSerializableException: 
			// edu.kh.io.pack3.model.dto.Member
			
			/* java.io.NotSerializableException
			 	예외가 발생합니다. 이 문제는 Member 클래스에
			 	Serializable 인터페이스를 구현하지 않았기 때문입니다
			 	Member 클래스에 Serializable 인터페이스를 추가해야 합니다
			*/
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			// 예외가 발생 하든 안하든 무조건 수행
			// -> 사용 완료된 스트림 메모리 반환
			try {
				if(oos != null) oos.close(); // 기반스트림인 fos 함께 닫힘
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	/**
	 * 외부 파일로 부터 객체 입력 받기
	 * 
	 * 외부 -> 내부
	 * 역직렬화 필요!
	 */
	public void objectInput() {
		
		
		
		
		// 스트림 참조변수 선언
		
		// FileInputStream: 파일로부터 데이터를 읽어오기 위한 바이트 기반 입력 스트림입니다.
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			// FileInputStream: 객체가 저장된 파일을 가리키는 기반 스트림
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240926/Member.dat");
			
			// 객체 입력 보조 스트림 생성
			// FileInputStream을 통해 파일에서 객체를 역직렬화하는 보조 스트림
			
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된
			// 직렬화된 Member 객체를 읽어와
			// 역직렬화를 수행하여 정상적인 Member 객체로 변경
			
			// Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화
			//					+	Member 객체로 변경(다운캐스팅)
			Member member = (Member)ois.readObject();
			// 객체 역직렬화
			
			// 읽어온 내용 확인
			System.out.println(member);
			
			/*readObject(): 직렬화된 객체를 읽어와 원래의 Member 객체로
			  복원합니다. 이때 다운캐스팅을 통해 Object 타입을 Member로
			  변환해야 합니다. 
			*/
			
			/* 객체 역직렬화 및 파일로부터 입력
			 * objectInput() 메서드를 호출하여
			 * 저장된 파일에서 직렬화된 객체를
			 * 읽어와 역직렬화한 뒤 객체 정보를 출력합니다.
			 * */
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if( ois != null ) ois.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	// 예외 처리
	/*	IOException 및 ClassNotFoundException은 파일 입출력 및 직렬화 과정에
	    서 발생할 수 있는 예외입니다. 예외가 발생할 경우 프로그램이 중단되지 않도록
	 *  try-catch 블록을 사용하여 처리합니다.
	 
	 *  NotSerializableException: 직렬화할 객체가 Serializable 인터페이스를
	 *  구현하지 않으면 발생합니다.
	*/
	
	
	
	
	
	
	
}	