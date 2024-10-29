package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("영희", 85);
		scores.put("철수", 92);
		scores.put("훈이", 88);
		scores.put("영희", 90);
		
		System.out.println(scores.get("영희"));
	}
}
