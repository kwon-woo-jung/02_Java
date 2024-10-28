package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGradeSystem {

	List<String> studentList = new ArrayList<>();
	// 학생 이름을 key로, 성적을 Value로 저장할 Map
	
	Map<String, Integer> studentGrades = new HashMap<>();
	
	// 학생 정보 및 성적 초기 데이터 추가
	studentList.add("김영희");
	studentList.add("김영희");
	
	Scanner scanner = new Scanner(System.in);
	
}
