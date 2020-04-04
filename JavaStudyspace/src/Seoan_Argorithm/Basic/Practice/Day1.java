package Seoan_Argorithm.Basic.Practice;

import java.util.Scanner;

public class Day1 {
	
	Scanner sc = new Scanner(System.in); 
	// Scanner 클래스 프로그램에 포함시키기
	// System.in은 키보드와 연결된 표준 입력 스트림, sc는 System.in에서 문자나 숫자를 꺼내는 역할

	// 1부터 n까지 정수의 합 구하기
	
	public void test1() {
		
	// 1. while문으로 풀기
		
	int n = sc.nextInt();  // sc에 입력된 값을 int형 변수 n에 담기
                           // sc.nextInt가 호출되면 키보드로 입력한 정수값을 얻을수있음
						   // 호출하는 메소드는 자료형에 따라 달라짐

	int sum = 0;           // 합을 저장하는 변수
	int i = 1;         	   // 반복을 제어하기위한 변수
	 
	while ( i <= n ) {      // i가 n이하면 반복
	sum += i;               // sum에 i 더하기
	i++;                    // 값을 1만큼 증가
	}

	System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}



	public void test2() {
	
	// 2. for문으로 풀기

	int n = sc.nextInt(); 

	int sum = 0;

	for ( int i = 1; i <= n; i++ )
	sum += i;

	System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	
	}
	

	
	public void test3() {
	
	// 3. 가우스 덧셈 교환법칙으로 풀기 : n * (n + 1) / 2

	int n = sc.nextInt(); 
	
	int sum = 0;
	
	// int는 소수점을 포함할수없기때문에 홀수, 짝수 나눠서 계산
	
	if (n % 2 == 0 ) {         // 짝수일경우
	sum = n * (( n + 1 ) / 2);

	} else {                   // 홀수일경우
	sum =  n * (( n + 1 ) / 2) - n / 2;
	}

	System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	
	}
	
	
	
	public void test4() {
	
	// 4. 응용 : do-while문을 활용해서 입력값 양수로 제한하기

	int n;
	
	do {
		System.out.println("n의 값 : ");
		n = sc.nextInt();
		
	} while (n <= 0);     // n이 0보다 클때까지 반복

	
	int sum = 0;
	
	for (int i = 1; i <= n; i++) {
		
		sum += i;
	}
	
	System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	
	}

}
