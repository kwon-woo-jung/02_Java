package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>(); {
			
			nameList.add("철수");
			nameList.add("영희");
			nameList.add("다혜");
			
			nameList.remove(1);
			
			System.out.println("nameList 목록 : " + nameList);
		}
		
	}
	
}
