package Internship.pm_assignment.ex0514;

import java.util.Scanner;

public class pm03 {

	/*
	 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
	 * 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
	 * 상근이는 세자리 수 두개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
	 * 
	 * 상수는 수를 다른사람들과 다르게 거꾸로 읽는다.
	 * 예를들어 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
	 * 따라서, 상수는 두 수중 큰수은 437을 큰수라고 말할것이다.
	 * 
	 * 두 수가 주어졌을때, 상수의 대답을 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
	 * 두수는 같지않은 세자리 수 이며, 0이 포함되어있지않다.
	 * 
	 * [input]
	 * 734 893
	 * 
	 * [output]
	 * 437 398
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		String ab = sc.nextLine();
		
		for (int i = ab.length()-1; i >= 0; i--) {
			
			System.out.print(ab.charAt(i));
		}
	
	}

}
