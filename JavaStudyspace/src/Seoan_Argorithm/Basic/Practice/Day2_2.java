package Seoan_Argorithm.Basic.Practice;

import java.util.Scanner;

public class Day2_2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
	
		System.out.println("========== 똑서 구구단표 ==========");
		System.out.print("   | ");
		
		for (int i = 1; i <= 9; i++) 
			System.out.printf("%3d", i);
			System.out.println("\n---+----------------------------");
		
		// 행 루프
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ", i);         // i 2자리로 출력
			
			// 열 루프
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);	// i * j 3자리로 출력
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
	}
	
	public void test2() {
		
		System.out.println("1~9사이의 숫자 한개 입력 : ");
		int a = sc.nextInt();
		
		if (a > 0 && a < 10) {
			
				for (int i = 1; i <= 9; i++) {
					System.out.println(a + " * " + i + " = " + a * i);
				}
			
			
		}
		
	}
	
	public void test3() {
		
		for (int i = 2; i <= 9; i++) {
			
			System.out.println();
			System.out.println(i + "단 \n" );
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.printf("%d * %d = %d \n", i, j, i * j);
				
			}
			
			System.out.println();
			System.out.println("==========");
			
		}
		
		
	}
	// 사각형
	public void test4() {
		
		// 행 -> 세로길이 
		// 3개의 행 만들기
		for (int i = 0; i < 3; i++) {
			
			// 열 -> 가로길이 
			// 행안에 별 4개 찍기
			for (int j = 0; j < 4 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 직각 이등변 삼각형 - 1
	public void test5() {
		
		// 4개의 행 만들기
		for (int i = 1; i < 5; i++) {
			
			// 행 순서만큼 별찍기 (1번째 행 = 별 1개, 2번째 행 = 별 2개)
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 직각 이등변 삼각형 - 2
	public void test6() {
		
		// 4개의 행 만들기
		for (int i = 1; i < 5; i++) {
			
			// 행 순서만큼 별찍기
			// 행이 4개이므로, 4에서부터 줄어면서 반복하기 
		 	for (int j = 4; j > 0; j--) {
		 		
		 		// j가 행 순서보다 큰경우, 공백 출력
		 		if (j > i) {
		 			System.out.print(" ");
		 			
		 		// j가 행 순서보다 작거나 같은경우, 별 출력 
		 		} else {
		 			System.out.print("*");
		 		}
		 	}
		 	
		 	System.out.println(); // 줄바꿈
		}
		
	}
	
	// 피라미드 (0부터 시작)
	public void test7() {
	
		// 줄 4개 만들기
		for (int i = 0; i < 4; i++) {
			
			// 첫번째줄 공백 3개 : (3-0 = 3), j < 3 까지만 반복 (0, 1, 2)
			// 두번째줄 공백 2개 : (3-1 = 2), j < 3 까지만 반복 (0, 1)
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
				
			}
			// 첫번째줄 별 1개 : (0*2+1 = 1)
			// 두번째줄 별 2개 : (1*2+1 = 2)
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

	// 피라미드 (1부터 시작)
	public void test8() {
		
		// 줄 4개 만들기
		for (int i = 1; i < 5; i++) {
			
			// 첫번째줄 공백 3개 : (5-1 = 4), j < 4 까지만 반복 (1, 2, 3)
			// 두번째줄 공백 2개 : (5-2 = 3), j < 3 까지만 반복 (1, 2)
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
				
			}
			// 첫번째줄 별 1개 : (1 * 2 = 2), k < 2 까지만 반복 (1)
			// 두번째줄 별 3개 : (2 * 2 = 3), k < 3 까지만 반복 (1, 2)
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
	// 입력받은 숫자 만큼 피라미드
	public void test9() {
		
		System.out.print("숫자를 입력해주세요 : " );
		int n = sc.nextInt();
		
		// 줄 n개 만들기 (입력받은 수가 4일경우 0, 1, 2, 3 => 4줄)
		for (int i = 0; i < n; i++) {
			
			// 첫번째줄 공백 : n-i (=4-0 = 4), j < 4 (0, 1, 2, 3)   
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			// 첫번째줄 별찍기 : i*2+1 (=0*2+1 = 1), k < 1 (0)
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	// 역삼각형
	public void test10() {
		
		System.out.print("숫자를 입력해주세요 : " );
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
					  
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}	
			
			for (int k = i * 2 - 1; k > 0; k--) {
				System.out.print("*");			
			}
				
			System.out.println();
		}
	}
		
	
	
	
	// 마름모(다이아몬드)
	public void test11() {
		

		
	}
	
	// 나비
	
	// 모래시계
	
}








