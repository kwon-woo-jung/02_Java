package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {
	
	/*
	 * 문자 기반 스트림 O
	 * 
	 * 문자 데이터를 처리하기 위한 스트림
	 * 주로 텍스트 파일을 읽고 쓸때 사용,
	 * reader와 writer 클래스 기반으로
	 * 문자 단위 데이터 처리함
	 * 
	 * 
	 * - 2 byte 문자(char) 단위로 입/출력 하는 스트림
	 * - Reader (입력) , Writer(출력) 최상위 클래스
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 * 
	 * Reader: 문자 기반 입력 스트림의 최상위 클래스, 파일이나 문자열을 읽는데 사용됩니다.
	 * Writer: 문자 기반 출력 스트림의 최상위 클래스, 파일이나 문자열을 쓰는데 사용됩니다.
	 * 
	 * */
	
	/** 
	 * 문자 기반 파일 입력(파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 * 
	 */
	public void fileInput() {
		// fileInput : 문자 기반 파일 입력
		
		/* 파일 읽기: fileInput() 메서드를 호출하여 파일에서 데이터를 읽어 콘솔에 출력합니다.
		 */
		
		// 기능 : 파일에서 문자를 읽어와 콘솔에 출력하는 메서드입니다.
			
		// 스트림 참조변수 선언
		FileReader fr = null; 	// 문자 기반 파일 입력 스트림
		//작업 흐름 : FileReader : 파일에서 문자 데이터를 읽는 기본 스트림입니다.
		
		BufferedReader br = null; // 문자 기반 보조 스트림
		
		/* BufferedReader와 BufferedWriter는 각각 파일에서
		   데이터를 빠르게 읽고 쓸 수 있도록 도와줍니다. 이로 인해 파일
		   입출력 작업의 성능이 크게 향상됩니다.
		   
		   버퍼 크기는 기본적으로 설정되어 있지만, 필요하다면 버퍼 크기를
		   조절할 수 있습니다. 
		*/
		
		
		/* 스트림의 닫기
		  BufferedWriter나 BufferedReader 같은 보조 스트림을 닫을 때,
		  연결된 기본 스트림도 자동으로 닫힙니다. 또한 close()에는 flush() 기능이
		  내장되어 있어, 남아 있는 데이터를 모두 출력한 후 스트림을 닫습니다.
		*/
		
		/* BufferedReader : FileReader 를 기반으로 더 빠르게 데이터를 읽어올수 있는
		보조 스트림 입니다. readLine() 메서드를 통해 한 줄씩 읽을 수 있습니다
		파일에서 읽어올 내용이 없을 때까지 반복해서 한 줄씩 읽어와 출력합니다.
		*/
		
		try {
			
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/20240926/노래가사.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			
			String line = null; // 한 줄을 읽어와 저장할 변수
			
			while(true) {
				
				line = br.readLine();
				
				if(line == null) { // 더 이상 읽어올 내용이 없을 때
					break; // 반복 종료
				}
				
				System.out.println(line);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(br != null) br.close(); 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	/**
	 * 문자 기반 파일 출력
	 * + 보조 스트림 Buffered 사용
	 * 
	 */
	
	public void fileOutput() {
	// fileOutput():문자열을 파일에 출력하는 메서드입니다.
	// 파일 쓰기: fileOutput() 메서드를 호출하여 문자열 데이터를 파일에 저장합니다.
		
		// 작업 흐름:
		/* FileWriter: 파일에 문자 데이터를 쓰는 기본 스트림입니다.
		   BufferedWriter : FileWriter를 기반으로 데이터를
		   더 효율적으로 출력 할 수 있는 보조 스트림입니다.
		   데이터를 한꺼번에 모아 출력하는 방식으로
		   성능을 향상시킵니다.
		*/
		
		// 스트림 참조변수 선언
		FileWriter fw = null; // 문자 기반 출력 스트림
		// FileWriter: 파일에 문자 데이터를 쓰는 기본 스트림입니다.
		
		BufferedWriter bw = null; // 문자 출력 보조 스트림
		/* BufferedWriter: FileWriter 를 기반으로 데이터를
		   더 효율적으로 출력 할 수 있는 보조 스트림입니다.
		   데이터를 한꺼번에 모아 출력하는 방식으로 성능을 향상시킵니다
		*/
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("오늘은 9월 27일! 금요일 입니다~! \n");
			sb.append("벌써 금요일이라니, 기분이 좋군요 \n");
			sb.append("다들 힘내서 공부합시다!!!");
			
			String content = sb.toString(); 
			
			// content 에 저장된 문자열을
			//  /io_test/20240926/출력테스트.txt 파일로 출력하기
			
			// 파일과 출력 스트림 연결(파일이 없으면 생성해줌)
			fw = new FileWriter("/io_test/20240926/출력테스트.txt");
			
			bw = new BufferedWriter(fw); 
			
			bw.write(content); // content에 저장된 내용을 연결된 파일에 출력
			
			//bw.flush();
			/* flush() : 버퍼에 있는 데이터를 파일로 밀어내는 작업을 수행합니다.
			 * 하지만 clase()를 호출하면 자동으로 flush()가 실행됩니다.
			 */
			
			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				// close() 구문에 flush() 가 내장되어 있음
				if(bw != null) bw.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}