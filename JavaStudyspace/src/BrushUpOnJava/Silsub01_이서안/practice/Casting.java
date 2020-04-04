package BrushUpOnJava.Silsub01_이서안.practice;

import java.util.Scanner;

public class Casting {
	
	/* 형변환 */
	
	public void printUniCode(){
	/* 키보드로 문자 하나를 입력받아, 그 문자의 유니코드를 출력되게 함 
		▷ 입력예시
			문자 하나 입력 : A
				
		▷ 출력예시	
			A is unicode : 65
	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char word = sc.next().charAt(0);
		// 변수에 담아서 변환
		int uni = word;
		
		System.out.println("==========================");
		// 출력시 변환
		System.out.println(word + " is unicode : " + (int)word);
		// printf로 출력
		System.out.printf("%c is unicode : %d \n", word, uni);
		
	}
	
	public void calculatorScore(){
	/* 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균 계산하여 정수형으로 출력
		▷ 입력예시
			국어 : 90.0
			영어 : 90.0
			수학 : 90.0
				
		▷ 출력예시	
			총점 : 270
			평균 : 90
	*/
		
		Scanner sc = new Scanner(System.in);
		
		double kor, eng, math;
		
		System.out.print("국어 : ");
		kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		eng= sc.nextDouble();
		
		System.out.print("수학 : ");
		math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = total / 3;
		
		System.out.println("==========================");
		System.out.printf("총점 : %d \n", total);
		System.out.printf("평균 : %d \n", avg);
	}

}


