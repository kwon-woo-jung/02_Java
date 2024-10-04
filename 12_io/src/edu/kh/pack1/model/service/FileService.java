package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileService {
	
	
	
	
	
	/* File 클래스 O
	 *
	 * File 클래스는 파일과 디렉토리를 다루기 위한
	 * 핵심 클래스입니다. 이 클래스는 파일이나
	 * 디렉토리의 정보를 가져오거나, 파일을 생성,
	 * 삭제, 이동, 확인하는 등의 다양한 작업을
	 * 수행할 수 있게 해줍니다.
	 
	 * File 클래스는 파일 입출력의 핵심적인 역할을
	 * 담당하지는 않지만, 파일 시스템과 상호작용 하는데
	 * 필요한 기본적인 기능을 제공합니다.
	 
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리가 실제로 존재하지 않더라도
	 *   객체를 생성할 수 있습니다)
	 *   
	 * 
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 * 
	 * 
	 * 
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String           : 파일 이름 반환
	 * String   paregetName()nt()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	/* [개발자 상식!]
	 *
	 * OS : 운영 체제
	 *
	 *  (Windows)    /     (Linux, Mac)
	 *    폴더       /      디렉토리
	 * 
	 * - 경로 표기 방법(하위 폴더, 파일 표시)
	 *
	 * 백슬래시 (\, Windows)     -> C:\workspace\02_Java
	 * 슬래시   (/, Linux, Mac ) -> C:/workspace/02_Java
	 *
	 *
	 * - Java 언어의 특징 : 플랫폼(OS)에 독립적
	 * -> OS 관계 없이 똑같은 코드 작성이 가능
	 *
	 * -> 이 특징을 유지하기 위해 /, \ 둘다 호환 가능
	 *   (런타임 시 실행되는 OS에 맞게 자동으로 변경)
	 *
	 *
	 * -------------------------------------------------------------
	 *
	 * - 경로 표기 방법
	 *
	 * 1) 절대 경로 : 하나의(절대적인) 기준으로 부터
	 * 				 목표까지의 경로를 모두 표기하는 방법
	 *
	 * - 기준
	 * [Windows] :   C:/  , D:/
	 * [Linux, Mac] : /Users ,   /
	 *
	 *
	 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
	 *
	 *
	 * */
	
	
	/** 
	 * File 클래스로 객체 생성
	 * + 폴더가 존재하지 않으면 폴더 생성
	 * 
	 */
	public void method1() {
		
		// method1(): 디렉토리 생성
		/*	기능: 특정 경로에 디렉토리가 존재하지 않으면 해당 경로의 모든 디렉토리를 생성합니다
		 * 
		 * File 객체로 디렉토리 경로 /io_test/20240926을 지정합니다.
		 * 
		 * exists() 메서드를 통해 디렉토리의 존재 여부를 확인하고, 존재하지 않을 경루
		 * mkdirs() 메서드를 사용해 디렉토리를 생성합니다.
		 * 
		 * */
		// 제일 앞에 "/" 의 의미 : 최상위 폴더 (== root, 절대 경로의 기준점)
		
		//  C:/io_test/20240926 폴더를 지정
		// /io_test/20240926 경로를 가지는 File 객체를 생성합니다.
		
		/*	exists() 메서드로 디렉토리 존재 여부를 확인하고, 존재하지 않으면
			makdirs()로 경로 상의 모든 디렉토리를 생성합니다.
			
			3. 생성된 디렉토리의 이름과 전체 경로를 출력합니다.
		 */		
		
		
		
		File directory = new File("/io_test/20240926"); // C:/io_test/20240926
		
		// 존재하지 않는 폴더를 관리하는 File 객체 생성
		
		if( !directory.exists() ) { // 폴더가 존재하지 않으면
			
			
			
			// 폴더 모두 생성
			directory.mkdirs();
			
			System.out.println(directory.getName()); // 20240926
			System.out.println(directory.getPath()); // \io_test\20240926
			
		}
		
	}
	
	
	/**
	 * File 객체를 이용해서
	 * 지정된 위치에 파일 생성하기
	 * 
	 */
	public void method2() {
		// method2(): 파일 생성
		
		/* 작업 흐름:
		  File 객체로 파일생성.txt 파일의 경로를 지정합니다.
		  exists() 메서드를 통해 파일의 존재 여부를 확인하고, 파일이 없으면
		  createNewFile() 메서드를 통해 파일을 생성합니다.
		  IOException 예외가 발생할 수 있기 때문에 예외 처리를 해줍니다
		 * */
	
		
		
		// Java에서 역슬래시(\)는 이스케이프 문자로 사용됨
		// -> \n 줄바꿈, \t 탭과 같이 특정 문자 뒤에 특별한 의미를 부여하는 역할을 함
		// -> 역슬래시 자체를 문자로 사용하고 싶을땐 2개를 사용 \\
		
		// 문자열에서 "\" 표기하는 방법 : "\\"
		File file = new File("\\io_test\\20240926\\파일생성.txt");
		
		if( !file.exists() ) { // 존재하지 않으면
			
			// 파일을 생성한다..
			try {
				
				// File 클래스의 메서드는 대부분 IOException 발생 시킴
				// -> IOException은 반드시 예외처리를 해야하는 Checked Exception
				// -> 예외처리 필수
				if( file.createNewFile() ) { // 파일을 생성했다 , true 인 경우
					System.out.println(file.getName() + " 파일이 생성 되었습니다.");
				}
				
			} catch (IOException e) {
				e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 메서드 추적
			}
			
			
			
		}
		
		
	}
	
	
	/**
	 * File 클래스 제공 메서드 활용하기
	 */
	public void method3() {
		// method3(): 파일 및 디렉토리 목록 출력
		
		/*
		 기능: 지정된 디렉토리의 파일 및 폴더 목록을 출력합니다
		 직업 흐름:
		 
		 1. File 객체로 디렉토리 경로 \\workspace\\02_Java\\12_io를 지정합니다
		 2. listFiles() 메서드를 통해 디렉토리 내의 파일 및 디렉토리 목록을 가져옵니다.
		 3. 각 파일 또는 디렉토리의 이름, 마지막 수정일, 파일 유형(파일/폴더), 파일 크기를 출력합니다.
		 4. 폴더의 경우 크기는 빈 문자열로 설정됩니다.
		 마지막 수정일은 simpleDateFormat을 사용해 형식에 맞춰 출력합니다.
		 
		 3. 코드 사용 흐름
		 1. 디렉토리 생성: method1() 메서드를 호출해 디렉토리를 생성합니다.
		 2. 파일 생성: method2() 메서드를 호출해 파일을 생성합니다.
		 3. 디렉토리 내용 조회: method3() 메서드를 호출해
		 	지정된 경로에 있는 파일 및 폴더 정보를 출력합니다
		 */
		
		// File 객체 생성
		File directory = new File("\\workspace\\02_Java\\12_io");
		
		// 지정된 경로에 있는 모든 파일/디렉토리를 File[] 형태로 얻어오기
		File[] files = directory.listFiles();
		//System.out.println(Arrays.toString(files));
		/*
		 * [
		 * \workspace\02_Java\12_io\.classpath, 
		 * \workspace\02_Java\12_io\.project, 
		 * \workspace\02_Java\12_io\.settings, 
		 * \workspace\02_Java\12_io\bin, 
		 * \workspace\02_Java\12_io\src
		 * ]
		 * 
		 * 
		 * */
		
		// 향상된 for문 
		for( File f : files ) {
			
			// 파일명
			String fileName = f.getName();
			
			// 마지막으로 수정한 날짜
			long lastModified = f.lastModified();
			//System.out.println(lastModified); // 1727317020388
			
			// java.text.SimpleDateFormat : 간단히 날짜 형식을 지정할 수 있는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
												// 2024-09-26 오전 11:17
			
			// String SimpleDateFormat.format(long) : 
			// 매개변수 long 값을 지정된 패턴 형식으로 변환하여
			// 문자열 형태로 반환
			String date = sdf.format(lastModified);

			//System.out.println(date); // 2024-09-26 오전 11:17
			
			// 파일 유형
			String type = null;
			if(f.isFile()) type = "파일";
			else		   type = "폴더";
			
			/*exists(): 파일 또는 디렉토리가 존재하는지 확인합니다.
			  isFile(): 파일인지 여부를 확인합니다
			  isDirectory(): 디렉토리인지 여부를 확인합니다.
			*/
			
			
			// 파일 크기(byte)
			String size = f.length() + "B";
			if(f.isDirectory()) size = ""; // 폴더라면 사이즈 빈문자열로 변경
			// -> 폴더 크기를 구하는 메서드는 따로 존재하지 않음
			// -> 구하려면 폴더안의 모든 파일을 순회하여 각 파일 크기를 합산해서 써야함.
			
			
			String result = String.format("%-20s %-20s %-5s %10s", 
									fileName, date, type, size);
			
			System.out.println(result);
			
			
		}
		
		
		
		/* 요약 및 코드 흐름
		 
		   method1() : 디렉토리 생성 : 메서드를 호출해 디렉토리를 생성합니다.
		   method2() : 파일 생성 : 메서드를 호출해 파일을 생성합니다.
		   method1() : 디렉토리 내용 조회 : 메서드를 호츌해 지정된 겨올에 있는 파일 및 폴더 정보를 출력합니다.
		 
		 */
		
		/* 절대 경로와 상대 경로
		   절대 경로: 시스템의 최상위 경로부터 파일 또는 디렉토리까지의 전체 경로를 의미합니다.
		   예시: c:/workspace/project/file.txt
		 * 
		   상대 경로: 현재 작업 중인 위치를 기준으로 목표 파일 또는 디렉토리까지의 경로를 의미합니다
		   예시: ../file.txt(현재 경로의 상위 디렉토리에 있는 file.txt를 의미) 
		 * 
		   파일 크기는 length() 메서드를 사용해 바이트 단위로 구할 수 있습니다.
		   디렉토리 크기는 디렉토리내의 모든 파일을 순회해 각 파일의 크기를 합산 해야 구할 수 있으며,
		   file 클래스 자체에는 이를 위한 메서드가 제공되지 않습니다.
		 * 
		 * */		
		
		
	}
	
	
	/*
	 * 스트림은 파일이나 데이터의 입출력 작업을 위해서 사용됨
	 * 즉, 파일이나 폴더에 실제 데이터를 읽거나 쓸 때 스트림을 이용함.
	 * 하지만 폴더/파일 생성 및 삭제하는 것은 입출력 작업이 아닌
	 * 파일 시스템과의 일반적인 상호작용이기 때문에 스트림 사용할 필요가 없음.
	 * 
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
