package Seoan_Argorithm.Programmers;

public class Test3 {
	
	// Programmers 행렬의 덧셈
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		// 행의 길이
		int A = arr1.length;
		
		// 열의 길이
		int B = arr1[0].length;
		
		// A행 B열의 원소를 가지는 answer 행렬 만들기
		int[][] answer = new int[A][B];
		
		// 행렬의 행만큼 반복
		for (int i = 0; i < A; i++) {
			
			//  행렬의 열만큼 반복
			for (int j = 0; j < B; j++) {
				
				answer[i][j] = arr1[i][j] + arr2[i][j];
				
			// 확인용
			System.out.print(answer[i][j] + " ");
			
			}	
		}
		
		return answer;
	}
			
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		// 행렬에 원소 담기
		int[][] arr1 = new int[][] {{1,2},{2,3}};
		int[][] arr2 = new int[][] {{3,4},{5,6}};
		
		int[][] answer = t3.solution(arr1, arr2);
		
	}
}


