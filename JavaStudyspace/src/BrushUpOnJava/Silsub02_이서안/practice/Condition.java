package BrushUpOnJava.Silsub02_이서안.practice;

import java.util.Scanner;

public class Condition {

	/* 조건문 */
	
	public void test1(){
	/* 국, 영, 수 세 과목(int)의 점수를 키보드로 입력받고, 합계와 평균을 계산하고,
	   세 과목의 점수와 평균을 가지고 합격 여부 처리함
	   
	   합격의 조건 : 세 과목의 점수가 각각 40점이상이고, 평균이 60점 이상이면 합격. 아니면 불합격 처리함
				  합격인 경우에는 과목별 점수와 합계, 평균을 출력하고, 불합격인 경우는 "불합격" 출력함 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		kor = sc.nextInt();  
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3;
		
		if (kor >=40 && eng >= 40 && math >= 40 && avg >= 60) {
			
			System.out.printf("국어 : %3d / 영어 : %3d / 수학 : %3d \n", kor, eng, math);
			System.out.printf("총점 : %3d / 평균 : %.2f \n", total, avg);
			System.out.println("합격!");
			
		} else {
			
			System.out.print("불합격ㅠㅠ");
		}
		
	}
	
	
	public void test2(){
	/* 아래 내용 화면에 출력하고, 메뉴번호 입력받은후
		*** 초기 메뉴 ***
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴번호 입력 : 
		
		다음과 같이 출력처리 하기. 
		1 입력시 → "입력메뉴가 선택되었습니다."
		2 입력시 → "수정메뉴가 선택되었습니다."
		3 입력시 → "조회메뉴가 선택되었습니다."
		4 입력시 → "삭제메뉴가 선택되었습니다."
		7 입력시 → "프로그램이 종료됩니다."
		다른값 입력시 → "번호가 잘못 입력되었습니다."
				     "다시 입력하십시오." */
		
		Scanner sc = new Scanner(System.in);
		
		int select;
			
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴번호 입력 : ");
		select = sc.nextInt();
		System.out.println("=============");
		
		
		switch(select) {
		case 1 :
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
			
		case 2 : 
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		
		case 3 :
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
			
		case 4 :
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		default :
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
			break;	
		}
		
	}
	
	
	public void test3(){
	/* 1. 정수 변수 선언
  	   2. 키보드로 부터 정수 하나 입력받음
  	   3. 입력받은 정수가 양수이면 "양수다." 출력, 양수가 아니면 "양수가 아니다." 출력 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();
		
		if (num > 0)
			System.out.println("양수다.");
		
		else
			System.out.println("양수가 아니다.");
		
	}
	
	
	public void test4(){
	/* 1. 정수 변수 선언
   	   2. 문자열 변수 선언
       3. 키보드로 부터 정수를 하나 입력 받음 (양수만)
   	   4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열에 기록하고 출력. 아닐시 "홀수다"를 문자열에 기록하고 출력 */
	
		Scanner sc = new Scanner(System.in);
		
		int num;
		String result;
		
		System.out.print("정수 하나 입력(양수만) : ");
		num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 2 == 0) {
				result = "짝수다";
			} else {
				result = "홀수다";
			}
			
			System.out.println(result);
		
		} else {
			
			System.out.println("양수가 아닙니다");
			
		}
	
	}
	
	
	public void test5(){
	/* 1. 이름(String), 나이(int), 키(double) 변수 선언
   	   2. 각 값을 키보드로 입력받아, 각 변수에 저장함
       3. 이름이 null이 아니면서 글자갯수가 0보다 크고, 나이와 키가 양수일 때만 화면에 출력
		
		▷ 입력예시
		이름 : 홍 길동
		나이 : 25
		키 : 187.5
		
		▷ 출력예시
		확인 : 홍 길동의 나이는 25세이고, 키는 187.5 cm 이다. */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.print("이름 : ");
		name = sc.nextLine(); // 띄어쓰기 포함하여 문자열 입력받음
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		if (name != null && name.length() > 0 && age > 0 && height > 0) {
			
			System.out.printf("%s의 나이는 %d세 이고, 키는 %.1f cm 이다.", name, age, height);
			
		}
			
	}
	
	
	public void test6(){
	/* 1. 두 개의 정수 변수 선언
	   2. 키보드로 두 개의 정수를 입력받아, 두 수의 합, 차, 곱, 몫을 출력함
	      (단, 두 수 모두 양수일 때만)
	   	
	   	▷ 입력예시
			첫번째 정수 : 25
			두번째 정수 : 7
			
		▷ 출력예시
			25 + 7 = 32
			25 - 7 = 18
			25 * 7 = 175
			25 / 7 = 3
			25 % 7 = 4 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			
			System.out.println(); // System.out.print는 괄호 안에 공백 사용X
			System.out.printf("%d + %d = %d \n", num1, num2, (num1 + num2));
			System.out.printf("%d - %d = %d \n", num1, num2, (num1 - num2));
			System.out.printf("%d * %d = %d \n", num1, num2, (num1 * num2));
			System.out.printf("%d / %d = %d \n", num1, num2, (num1 / num2));
			System.out.printf("%d %% %d = %d", num1, num2, (num1 % num2));
			
		} else {
			
			System.out.println("양수를 입력해주세요.");
			
		}
		
	}
	
	
	public void test7(){
	/* 1. 정수변수와 문자변수 선언
       2. 키보드로 점수를 입력받아, 정수변수에 저장 (단, 점수는 반드시 0 이상의 값이여야 함)
  	   3. 다중 if문으로 점수가 90 이상이면 문자변수에 'A'
						   80 이상 90 미만	 'B'
						   70 이상 80 미만	 'C'
						   60 이상 70 미만	 'D'
						   60 미만		 'F' 대입함
  	   4. 점수와 학점 출력 확인 */
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score >= 0) {
			
			if(score >= 90) {
				
				grade = "A";
				
			} else if (score >= 80) {
				
				grade = "B";
				
			} else if (score >= 70) {
				
				grade = "C";
				
			} else if (score >= 60) {
				
				grade = "D";
				
			} else {
				
				grade = "F";
			}
		
			System.out.printf("점수 : %d, 학점 : %s", score, grade);
			
		} // if문 끝
		
	} 
	
	
}
