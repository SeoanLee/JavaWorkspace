package Seoan_Argorithm.Programmers;

import java.util.HashMap;

public class Test2 {
	
	// Programmers 완주하지 못한 선수
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";
    	
    	// 참가자중에는 동명이인이 있을수 있다 = Integer O, Boolean X
    	HashMap<String, Integer> map = new HashMap<>();
    	
    	// 완주자
    	for (String person : completion) {
    		
    		map.put(person, map.getOrDefault(person, 0) + 1);
    		
    	}
    	
    	// 참여자
    	for (String person : participant) {
    		
    		map.put(person, map.getOrDefault(person, 0) - 1);
    		
    		if (map.get(person) < 0)
    			
    			return person;
    	}
    	
        return "";
    }

    public static void main(String[] args) {
	
	Test2 t2 = new Test2();
	
	String[]participant = {"leo", "kiki", "eden"};
	String[]completion = {"eden", "kiki"};
	
	System.out.println(t2.solution(participant, completion));

    }

	}









