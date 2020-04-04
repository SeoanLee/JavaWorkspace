package BrushUpOnJava.Silsub02_이서안.practice;

import java.util.Scanner;

public class Operator {
	
	/* 연산자 */
	
	public void example1(){
	/* 국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언후
	   각 점수를 키보드로 입력받고, 합계(국어+영어+수학)와 평균(합계/3.0)을 계산후 
	   세 과목의 점수와 평균을 가지고 합격 여부 처리함
	   
	   합격의 조건 : 세 과목의 점수가 각각 40점이상이면서, 평균이 60점 이상이면 합격. 아니면 불합격 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double avg;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		// 일반 논리 연산자
		String result = ((kor >= 40) && (eng >=40) && (math >= 40) && (avg >= 60)) ? "합격" : "불합격" ;
		System.out.println("===============");
		System.out.println("평균 : " + avg);
		System.out.println("합격여부 : " + result);
	
	}
	
	
	public void example2(){
	/* 변수 선언하고, 아래 내용 키보드로 입력받고, 변수값을 화면에 출력하기
	   
	   학생이름 (문자열), 학년 (정수), 반 (정수), 번호 (정수), 
	   성별(M/F) (문자. 문자열로 입력받은 후, 문자하나 분리해야 함), 성적 (실수. 소숫점 아래 둘째자리까지 입력받음)
	   성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 
	   
	   ▷ 출력예시	
	   	   3학년 2반 24번 남학생 홍길동은 성적이 95.55이다. */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int grade, clas, num;
		char gender;
		double score;
		
		System.out.print("학생이름 : ");
		name = sc.next();
		
		System.out.print("학년 : ");
		grade = sc.nextInt();
		
		System.out.print("반 : ");
		clas = sc.nextInt();
		
		System.out.print("번호 : ");
		num = sc.nextInt();
		
		System.out.print("성별(M / F) : ");
		gender = sc.next().toUpperCase().charAt(0);
		
		System.out.print("성적 : ");
		score = sc.nextDouble();
		
		gender = (gender == 'F') ? '여' : '남';
		
		// 변수에 담긴 값 출력하기
		System.out.println("====================");
		System.out.printf("%d학년 %d반 %d번 %c학생 %s은/는 성적이 %.2f이다. \n", 
							grade, clas, num, gender, name, score);
		
	}
	
	
	public void example3(){
	/* 정수 변수 선언 ➝ 키보드로 부터 정수 하나 입력받음 
	   ➝ 입력받은 정수가 양수이면 "양수다." 출력, 양수가 아니면 "양수가 아니다." 출력 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();
		
		String result = (num > 0) ? "양수다." : "양수가 아니다.";
		
		// 변수에 담긴 값 출력하기
		System.out.println("결과 : " + result);
		System.out.println("====================");

	}
	
	
	public void example4(){
	/* 정수 변수 선언 ➝ 문자열 변수 선언 ➝ 키보드로 부터 정수를 하나 입력 받음
	   ➝ 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고, 짝수가 아니면 "홀수다"를 문자열변수에 기록
	   ➝ 문자열변수 값 출력 */
		
		// 변수 선언 없이 풀기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		System.out.println("결과 : " + ((sc.nextInt() % 2 == 0) ? "짝수" : "홀수"));
		
	}
	

}
