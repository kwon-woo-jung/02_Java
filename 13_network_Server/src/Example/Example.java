package Example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Example {

	// 파일을 복사할 수 있는 메서드
	
	
	/* BufferedReader와 BufferedWriter는 각각 파일에서
	   데이터를 빠르게 읽고 쓸 수 있도록 도와줍니다. 이로 인해 파일
	   입출력 작업의 성능이 크게 향상됩니다.
	   
	   버퍼 크기는 기본적으로 설정되어 있지만, 필요하다면 버퍼 크기를
	   조절할 수 있습니다. 
	*/
	
	/* BufferedReader : FileReader 를 기반으로 더 빠르게 데이터를 읽어올수 있는
	보조 스트림 입니다. readLine() 메서드를 통해 한 줄씩 읽을 수 있습니다
	파일에서 읽어올 내용이 없을 때까지 반복해서 한 줄씩 읽어와 출력합니다.
	*/
	
	//작업 흐름 : FileReader : 파일에서 문자 데이터를 읽는 기본 스트림입니다.
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
//		BufferedReader br = null; // 문자 기반 보조 스트림 
//		FileReader fr = null; // 문자 기반 파일 입력 스트림
		
		try {
			
			// 보조 스트림 생성
			
			
//			br= new BufferedReader(new FileReader("test.txt"));
			
			
			fr = new FileReader ("test.txt");
			br = new BufferedReader(fr);
			
			String line = null;
		
			
			
			while(br.readLine() != null) {
				System.out.println(br.readLine());
				
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		
		}

	}

}
