package Internship.pm_assignment.ex0514;

import java.util.Scanner;

public class pm02 {
	
	/*
	 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	 * 각각의 알파벳에 대해서, 단어에 포함되어있는 경우에는 처음 등장하는 위치를, 
	 * 포함하지 않는 경우에는 -1을 출력하는 프로그램을 작성하세요.
	 * 
	 * 첫째줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지않으며, 알파벳 소문자로만 이루어져있다.
	 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ...z가 처음 등장하는 위치를 공백으로 구분해서 출력
	 * 만약, 어떤 알파벳이 단어에 포함되어있지 않다면 -1을 출력한다.
	 * 단어의 첫번째 글자는 0번째 위치이고, 두번째 글자는 1번째 위치이다.
	 * 
	 * [input]
	 * helloworld
	 * 
	 * [output]
	 * -1 -1 -1 9 1 -1 -1 0 -1 -1 -1 2 -1 -1 4 -1 -1 7 -1 -1 -1 -1 5 -1 -1 -1
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// indexOf 써서 풀었어함...	
		/*
			int arr[] = new int[26];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
	
			System.out.print("영단어를 입력해주세요(소문자로) : ");
			String s = sc.nextLine();
			
			for (int i = 0; i < s.length(); i++ ) { 
				char ch = s.charAt(i);
				
				if(arr[ch - 'a'] == -1) {
					arr[ch - 'a'] = i;
				}
			}
			
			for (int result : arr) {	
				System.out.print(result + " ");
			}
		*/
		
		// indexOf로 다시 풀어보기
		System.out.print("영단어를 입력해주세요(소문자로) : ");
		String s = sc.nextLine();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(s.indexOf(ch) + " ");
		}
	}
}
