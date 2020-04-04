package Seoan_Argorithm.CodeUp100;

import java.util.Scanner;

public class Day1 {
	
	// Hello 출력
	public void test1001() {	
		System.out.println("Hello");
	}
	
	// Hello World 출력
	public void test1002() {
		System.out.println("Hello World");
	}
	
	/* Hello
	   World 출력 */
	public void test1003() {
	    System.out.println("Hello \nWorld"); 
	}
	
	// 'Hello' 출력
	public void test1004() {
		System.out.println("'Hello'");
	}
	
	// "Hello World" 출력
	public void test1005() {
		System.out.println("\"Hello World\"");
	}
	
	// "!@#$%^&*()" 출력
	public void test1006() {
		System.out.println("\"!@#$%^&*()\"");
	}
	
	// "C:\Download\hello.cpp" 출력
	public void test1007() {
		System.out.println("\"C:\\Download\\hello.cpp\"");
	}
	
	/* ┌┬┐
	   ├┼┤
       └┴┘ 출력 */
	public void test1008() {
	    System.out.printf("\u250C\u252C\u2510 \n");
	    System.out.printf("\u251C\u253C\u2524 \n");
	    System.out.printf("\u2514\u2534\u2518");
	    
		// 참고하라고 제공해주는 코드표 참조해서 풀면 됌
		// 근데 이걸 왜풀지..?
	}
	
	// 정수형으로 변수를 선언하고, 변수에 정수값을 저장한후, 변수에 저장되어있는값 출력
	public void test1010(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
	}
	
	// 문자형으로 변수를 선언하고, 변수에 문자를 저장한후, 변수에 저장되있는문자 출력
	public void test1011(){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		// 실행용

	}

}
