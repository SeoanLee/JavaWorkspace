package Seoan_Argorithm.Programmers;

import java.util.Arrays;

public class Test1 {
	
	// Programmers 최솟값만들기
	public int solution(int []A, int []B) {
	    
		// 자바에서 제공하주는 Arrays.sort() 함수를 사용하여 배열 오름차순으로 정렬하기
		// 오름차순으로 정렬되므로 가장 첫번째 요소가 최솟값, 마지막요소가 최댓값이 된다.
		// 내림차순으로 정렬시 Arrays.sort(A,Collections.reverseOrder()) 
		// 단점 : 배열의 순서가 변경됨
		
		Arrays.sort(A);
		Arrays.sort(B);
				 
		int answer = 0;
		
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[A.length -i -1];
		}
		
		return answer;
		 
	    }	 
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		int[]A = {1, 4, 2};
		int[]B = {5, 4, 4};
		
		System.out.println(t1.solution(A, B));

	}
			
	}


