package Seoan_Argorithm.Basic.Practice;

import java.util.Scanner;

public class Day2_1 {

	
	Scanner sc = new Scanner(System.in);
	
	
	// 세 정수중 최대값 구하기
	public void test1() {
		
	System.out.println("세 정수를 입력해주세요");
	
	System.out.print("a의 값 : "); 
	int a = sc.nextInt();
	
	System.out.print("b의 값 : ");
	int b = sc.nextInt();
	
	System.out.print("c의 값 : ");
	int c = sc.nextInt();
	
	int max = a;
	
	if (b > max) max = b;
	if (c > max) max = c;
	
	System.out.print("최댓값은 " + max + "입니다.");
	
	}
	
	
	// 세 정수의 중앙값 구하기
	public void test2() {
	
	System.out.println("세 정수를 입력해주세요");
		
	System.out.print("a의 값 : "); 
	int a = sc.nextInt();
		
	System.out.print("b의 값 : ");
	int b = sc.nextInt();
		
	System.out.print("c의 값 : ");
	int c = sc.nextInt();
		
	
	if (a > b && a < c || a > c && a < b)
		
		System.out.println("세 정수의 중앙값 : " + a);
	
	else if (b > a && b < c || b > c && b < a )
		
		System.out.println("세 정수의 중앙값 : " + b );
	
	else 
		
		System.out.println("세 정수의 중앙값 : " +  c);
		
	}
	

	
	public static int test3 (int a, int b, int c) {
		
		// 결정트리..
		
		if (a >= b)
		 if (b >= c)
			 return b;    // ①, ②, ⑥, ⑦
		 else if (a <= c)
			 return a;    // ⑤, ⑥, ⑧
		 else
			 return c;    // ③
		
		else if (a > c)
			return a;     // ⑨
		else if (b > c)
			return c;     // ⑩, ⑪
		else
			return b;     // ⑫, ⑬

	}
	
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수를 입력해주세요");
		
		System.out.print("a의 값 : "); 
		int a = sc.nextInt();
			
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
			
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("세 정수의 중앙값 : " + test3(a, b, c));
		
	}

}
