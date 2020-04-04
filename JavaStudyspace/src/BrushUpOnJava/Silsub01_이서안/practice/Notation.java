package BrushUpOnJava.Silsub01_이서안.practice;

import java.util.Scanner;

public class Notation {
	
	/* 진법변환 */
	
	/* Java 진수 변환시 Integer 클래스 활용
	   
	   int num10 = 1;
	   String num2 = Integer.toBinaryString(num10); ▷ 10진수 → 2진수
	   String num8 = Integer.toOctalString(num10);  ▷ 10진수 → 8진수
       String num16 = Integer.toHexString(num10);   ▷ 10진수 → 16진수

       int num2to10 = Integer.parseInt(num2, 2);    ▷ 2진수 → 10진수
       int num8to10 = Integer.parseInt(num8, 8);    ▷ 8진수 → 10진수
       int num16to10 = Integer.parseInt(num16, 16); ▷ 16진수 → 10진수
       
	 */
	
	public void test01() {
	// 다음 10진수를 2진수로 변경하세요. ▷ 12, 24, 130 
	
	// 값 직접 입력받아서 변환해보기
	Scanner sc = new Scanner(System.in);
	
	// 값 담을 배열생성
	int[] number = new int[3];
	
	// 배열 길이 담는 변수
	int size = number.length;
	
	
	// 배열 길이만큼 반복
	for (int i = 0; i < size; i++) {
		
		System.out.print("10진수 입력 : ");
		number[i] = sc.nextInt();
	
	}
		System.out.println("====================");
	
	// 2진수로 변환하여 출력
	for (int i = 0; i < size; i++) {
		
		System.out.println("입력한 값의 2진수 : " + Integer.toBinaryString(number[i]));
		
	}		
	
	}
	
	
	public void test02() {
	// 다음 10진수를 8진수로 변경하세요. ▷ 7, 15, 26 
		
	// 배열에 값 담아서 변환해보기
	int[] number = new int[] {7, 15, 26};
	
	// 8진수로 변환된 값 담을 배열 생성
	String[] num8 = new String[3];
	
	
	// 8진수 배열 길이만큼 반복, number배열 길이로 해도 상관은 없음
	for (int i = 0; i < num8.length; i++) {
		
		// number배열에 담긴 값 변환해서 8진수 배열에 담기
		num8[i] = Integer.toOctalString(number[i]);
		
	}
	
	// 출력하기 	
	for (int i = 0; i < num8.length; i++) {
			
		System.out.println(number[i] + "의 8진수 : " + num8[i]);
			
	}
		
	}

	
	public void test03() {
	// 다음 16진수를 10진수로 변경하세요. ▷ F, 3E, A5
	
	// 배열에 16진수 값 담기
	String[] num16 = new String[]{"F", "3E", "A5"};

	
	// 10진수로 변환하여 출력
	for (int i = 0; i < num16.length; i++) {
		
		System.out.println(num16[i] + "의 10진수 : " + Integer.parseInt(num16[i], 16));
		
	}
		
	}
	
	
	public static void main(String[] args) {
		
		//new Notation().test01();
		//new Notation().test02();
		//new Notation().test03();

	}

}

