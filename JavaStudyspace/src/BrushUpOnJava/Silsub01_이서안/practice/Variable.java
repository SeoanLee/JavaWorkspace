package BrushUpOnJava.Silsub01_이서안.practice;

import java.util.Scanner;

public class Variable {

	/* 변수 */
	
	public void example1(){
	// 본인의 신상정보 변수에 기록하고 출력하기
	// 이름, 나이, 키(소수점 아래 첫째자리), 몸무게(소수점 아래 첫째자리), 성별(남 : M, 여 : F) 전화번호, 이메일
		
		/* 변수에 신상정보 기록하기 */
		String name = "똑서";
		int age = 0;
		double height = 170.0;
		double weight = 00.0;
		char gender = 'F';
		String tel = "010-1234-5678";
		String email = "kis.seoan@gmail.com";
		
		/* 변수에 담은 값 출력하기 */
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("성별 : " + gender);
		System.out.println("연락처 : " + tel);
		System.out.println("이메일 : " + email);
		
	}
	
	
	public void example2(){
	/* 정수 두개 입력받아 두수의 합, 차, 곱, 나누기한 몫과 나머지 출력
		▷ 입력예시
			첫번째 정수 : 23
			두번째 정수 : 7
				
		▷ 출력예시	
			더하기 결과 : 30  
			빼기 결과 : 16  
			곱하기 결과 : 161 
			나누기한 몫 : 3   
			나누기한 나머지 : 2  
	*/
	
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 결과 출력하기 : 일회성
		System.out.println("==========================");
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 한 몫 : " + (num1 / num2));
		System.out.println("나누기 한 나머지 : " + (num1 % num2));
		
	}
	
	
	public void example3(){
	/* 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레 계산하여 출력
		▷ 입력예시
			가로 : 13.5
			세로 : 41.7
		
		▷ 출력예시
			면적 : 562.95
			둘레 : 110.4
	 */
		
		Scanner sc = new Scanner(System.in);
		
		// 가로, 세로값 실수로 입력받기
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
	
		// 결과 출력하기 : 재사용
		double area = width * height;
		double round = (width + height) * 2;
		
		System.out.println("==========================");
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
		
	}
	
	
	public void example4(){
	/* 영어단어를 키보드로 입력받아 각 자리의 문자 출력 (3개까지만)
		▷ 입력예시
			영어단어를 입력하세요(5자 이상) : apple
		
		▷ 출력예시
	 		첫번째 문자 : a
			두번째 문자 : p
			세번째 문자 : p
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어단어를 입력하세요(5자 이상) : ");
		String word = sc.nextLine();
		// sc.nextLine() : 문자열 한줄
		
		System.out.println("==========================");
		System.out.printf("첫번째 문자 : %c %n", word.charAt(0));
		System.out.printf("두번째 문자 : %c \n", word.charAt(1));
		System.out.printf("세번째 문자 : %c %n", word.charAt(2));
		
	}

}


