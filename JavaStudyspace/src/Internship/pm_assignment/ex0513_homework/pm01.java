package Internship.pm_assignment.ex0513_homework;

import java.util.Scanner;

public class pm01 {
	
	/*
	  	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
	  	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		문제의 갯수와 1번 문제부터 마지막 문제까지의 정답이 공백으로 구분되어 주어졌을때, 
		가장 많은 문제를 맞힌 사람이 누구인지 출력하는 프로그램을 작성하시오.
		
		* 시험은 최대 10,000 문제로 구성되어있습니다.
		* 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
		* 가장 높은 점수를 받은 사람이 여럿일 경우 값을 오름차순 정렬해 출력해주세요.
		
		[input]
		5 1 2 3 4 5
		[output]
		1
		
		[input]
		5 1 3 2 4 2
		[output]
		1
		2
		3
		
		[input]
		10 1 2 3 4 5 1 2 3 4 5
		[output]
		1
	*/

	public static void main(String[] args) {
		
		// 수포자 3인방 패턴
		int[] supoja1 = {1, 2, 3, 4, 5};
		int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		Scanner sc = new Scanner(System.in);
		
		// 총 문제수
		System.out.print("총 문제수 입력 ex) 5 : ");
		int examEa = sc.nextInt();
		
		if (examEa < 10001) {
			
			// 정답 배열
			int[] answer = new int[examEa];
			
			// 정답 배열에 담기
			System.out.print("정답입력 ex) 5 2 3 4 6 : ");
			for (int i = 0; i < examEa ; i++) {
				answer[i] = sc.nextInt();
			}
		
			// 수포자 패턴에 따라 정답 판별
			int[] result = new int[3];
			
		    for(int i=0; i < answer.length; i++){
		    	
		        int i1 = i % supoja1.length ;
		        int i2 = i % supoja2.length ;
		        int i3 = i % supoja3.length ;
	
		        if(answer[i] == supoja1[i1]){
		            result[0] = result[0] + 1;
		        }
		        
		        if(answer[i] == supoja2[i2]){
		            result[1] = result[1] + 1;
		        }
		        
		        if(answer[i] == supoja3[i3]){
		            result[2] = result[2] + 1;
		        }
		    }
	    
		    // 최고점 찾기
		    int max = 0;
		    
		    for (int i = 0; i < result.length; i++) {
		    	if(max < result[i]){
		    		max = result[i];
		    	}
		    }

		    // 최고점을 가진 index 출력..!
		    for (int i = 0; i < result.length; i++) {
		        if(max == result[i]){
		            System.out.println((i + 1) + "번 수포자" );
		        }
		    }
		    
		} else {
			System.out.print("최대 10,000문제 까지 등록 가능합니다.");	
		}	
	}
}
