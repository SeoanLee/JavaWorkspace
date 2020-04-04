package BrushUpOnJava.Silsub03_이서안.practice;

import java.util.Scanner;

public class Loof {

	/* 반복문 */
	
	Scanner sc = new Scanner(System.in);
	
	public void printStar1(){
	/* 정수를 하나 입력받아, 그 수가 양수일 때만
	   입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 함
	   - if문과 이중 for문 사용
		
		▷ 예시1
		정수 하나 입력 : 5
		1
		*2
		**3
		***4
		****5
		
		▷ 예시2
		정수 하나 입력 : -5
		양수가 아닙니다. */
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			for(int i = 0; i < num + 1; i++) { // 입력 받은만큼 줄만들기
				
				for(int j = 0; j < i; j++) { // 별찍기 시작
				
					if(j == (i - 1)) {		 
						System.out.println(i);
					} else {
						System.out.print("*");
					}
				}
			}
			
		} else {
			
			System.out.println("양수가 아닙니다.");
		
		}
	
	}
	
	
	public void printStar2(){
	/* 정수를 하나 입력받아, 양수일 때와 0일때 음수일 때 각각 아래와 같이 출력되게 함.
	   - if문과 for문 사용
	   
	    ▷ 예시1
		정수 입력 : 5
		*
		**
		***			
		****
		*****
		
		▷ 예시2
		정수 입력 : -5
		*****
		****
		***
		**
		*
		
		▷ 예시3
		정수 입력 : 0
		출력 기능이 없습니다.	 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			for(int i = 0; i < num; i++) { // 줄만들기
				for(int j = 0; j < i + 1; j++) {
					System.out.print("*");
				} System.out.println(" ");
			}
			
		} else if (num < 0) {
			num *= -1;
			
			for(int i = 0; i < num; i++) { // 줄만들기
				for(int j = num; j > i; j--) {
					System.out.print("*");
				} System.out.println(" ");
			}
			
		} else {
			
			System.out.println("출력 기능이 없습니다.");
		
		}
		
	}	
	
	
	public void selectMenu(){
	/* 원하는 메뉴의 번호를 입력하여, 선택된 메뉴의 가격들과 수량을 곱하여 총 가격을 출력함.
		
		▷ 예시
		*** 메뉴를 선택하세요 ***

		햄버거 ***************
		1. 불고기버거	3500원
		2. 치킨버거	3200원
		추가 ****************
		3. 감자튀김	1000원
		4. 치즈스틱	400원
		5. 샐러드		2000원
		음료수 ***************
		6. 콜라		700원
		7. 에이드		1200원
		8. 커피		1000원
		********************
		메뉴 선택 : 1
		불고기버거를 선택하셨습니다.
		수량은 ? 3
		3개 주문하셨습니다.

		추가 주문하시겠습니까?(y/n) : y 입력시 메뉴화면 반복실행
								(계산된 가격은 계속 저장되어 있음)
					  			
					  			n 입력시 메뉴화면 종료
								(화면에 주문한 정보와 가격 출력)

		* 주문하신 정보는 다음과 같습니다. *
		-----------------------------------------------
		불고기버거 : 3개 - 10500원
		감자튀김 : 2개 - 2000원
		콜라 : 1개 - 700원
		커피 : 1개 - 1000원
		------------------------------------------------
		총 가격 : 14200원 */
		
		int bulgogi = 0, chicken = 0;
		int potato = 0, cheese = 0, salad = 0;
		int cola = 0, ade = 0, coffee = 0;
		
		int choice = 0, ea = 0;
		int totalPrice = 0;
		
		String menu = null;
		boolean sw = false;
		
		label :
		/* break label문 (이름을 가지는 반복문)
		일반적인 break문은 단 하나의 반복문만을 빠져나가지만, 
		여러 반복문이 중첩된 상황에서 한번에 모든반복문을 빠져나가거나, 특정 반복문까지만 빠져나가고싶을때 사용
		가장 바깥쪽 반복문이나 빠져나가고싶은 특정 반복문에 이름(label)을 설정한후, break 다음 해당이름을 명시 
	 	그러면 break 키워드는 현재 반복문이 아닌 해당 이름의 반복문 바로 다음으로 프로그램의 실행을 옮겨줌
		
		단, 이때 이름(label)은 가리키고자 하는 반복문의 키워드 바로 앞에 위치해야함
		만약 이름과 반복문의 키워드 사이에 명령문이 존재하면, 자바 컴파일러 오류발생
		*/
		
		do {
			
		System.out.println("*** 메뉴를 선택하세요 ***");
		System.out.println();
		System.out.println("햄버거 *****************");
		System.out.println("1. 불고기버거	3500원");
		System.out.println("2. 치킨버거	3200원");
		System.out.println("추가 ******************");
		System.out.println("3. 감자튀김	1000원");
		System.out.println("4. 치즈스틱	400원");
		System.out.println("5. 샐러드		2000원");
		System.out.println("음료수 *****************");
		System.out.println("6. 콜라		700원");
		System.out.println("7. 에이드		1200원");
		System.out.println("8. 커피		1000원");
		System.out.println("**********************");
		System.out.println("9. 주문 취소");
		System.out.println();
		
		System.out.print("메뉴 선택 : ");
		choice = sc.nextInt();
		System.out.println();
		
		switch (choice) {
		
		case 1 : menu = "불고기버거"; break;
		case 2 : menu = "치킨버거"; break;
		case 3 : menu = "감자튀김"; break;
		case 4 : menu = "치즈스틱"; break;
		case 5 : menu = "샐러드"; break;
		case 6 : menu = "콜라"; break;
		case 7 : menu = "에이드"; break;
		case 8 : menu = "커피"; break;
		case 9 : 
			if(ea == 0) {	
			System.out.println("주문이 취소되었습니다.");
			break label;
			
			} else {
				System.out.println("주문이 진행중입니다.");
				System.out.print("정말 취소하시겠습니까?(Y/N) : ");
				char cancle = sc.next().toUpperCase().charAt(0);
				System.out.println();
				
				if (cancle == 'Y') {
					System.out.println("주문이 취소되었습니다.");
					break label;
					
				} else {
					System.out.println("주문을 다시 진행해주세요.");
					break label;
				}
			}
			
		default : 
			System.out.println("에러발생!");
			System.out.println("주문을 다시 진행해주세요!");
			System.out.println();
			sw = true;
			
		} // 스위치문 끝
		
		System.out.println(menu + "을/를 선택하셨습니다.");
		System.out.print("수량은? ");
		ea = sc.nextInt();
		System.out.println();
		
		// 주문수량 확인
		if (ea <= 0) {
			System.out.println("에러발생!");
			System.out.println("주문을 다시 진행해주세요!");
			System.out.println();
			
		} else {
			if (menu == "불고기버거")
				bulgogi += ea;
			else if (menu == "치킨버거")
				chicken += ea;
			else if (menu == "감자튀김")
				potato += ea;
			else if (menu == "치즈스틱")
				cheese += ea;
			else if (menu == "샐러드")
				salad += ea;
			else if (menu == "콜라")
				cola += ea;
			else if (menu == "에이드")
				ade += ea;
			else if (menu == "커피")
				coffee += ea;
			
			System.out.println(ea + "개를 선택하셨습니다.");
			System.out.println();
				
		}
		
		System.out.print("추가 주문하시겠습니까?(y/n) : ");
		char plus = sc.next().toUpperCase().charAt(0);
		
		// 추가주문확인 및 주문정보 출력
		if (plus == 'Y')
			sw = true;
		
		else {
			sw = false;
			System.out.println();
			System.out.println("* 주문하신 정보는 다음과 같습니다. *");
			System.out.println("-----------------------------");
			
			if (bulgogi != 0) {
				System.out.printf("불고기버거 : %d개 - %,d원\n", bulgogi, (bulgogi * 3500));
				totalPrice += (bulgogi * 3500);
			}
			if (chicken != 0) {
				System.out.printf("치킨버거 : %d개 - %,d원\n", chicken, (chicken * 3200));
				totalPrice += (chicken * 3200);
			}
			if (potato != 0) {
				System.out.printf("감자튀김 : %d개 - %,d원\n", potato, (potato * 1000));
				totalPrice += (potato * 1000);
			}
			if (cheese != 0) {
				System.out.printf("치즈스틱 : %d개 - %,d원\n", cheese, (cheese * 400));
				totalPrice += (cheese * 400);
			}
			if (salad != 0) {
				System.out.printf("샐러드 : %d개 - %,d원\n", salad, (salad * 2000));
				totalPrice += (salad * 2000);
			}
			if (cola != 0) {
				System.out.printf("콜라 : %d개 - %,d원\n", cola, (cola * 700));
				totalPrice += (cola * 700);
			}
			if (ade != 0) {
				System.out.printf("에이드 : %d개 - %,d원\n", ade, (ade * 1200));
				totalPrice += (ade * 1200);
			}
			if (coffee != 0) {
				System.out.printf("커피 : %d개 - %,d원\n", coffee, (coffee * 1000));
				totalPrice += (coffee * 1000);
			}
		
			System.out.println("-----------------------------");
			System.out.printf("총 가격 : %,d원\n", totalPrice);
		}
			
		System.out.println();
			
		} while (sw);
	}	
	
	
	public void countInputCharacter(){
	/* 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
	   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
	   단, 영문자만 입력받도록 함.
	   
	   ▷ 예시1
		문자열 입력 : application
		문자 입력 : p
		포함된 갯수 : 2 개
	   
	   ▷ 예시2
		문자열 입력 : apple_test123
		영문자가 아닙니다. */
		
		boolean check = true;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			char alphabet = str.charAt(i);
			
			if ((alphabet < 'A' || alphabet > 'Z')
				&& (alphabet < 'a' || alphabet > 'z')) {
				
				check = !check;
				break;
			}
		}
		
		if(check) {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int count = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			
			System.out.printf("포함된 갯수 : %d개", count);
		
		} else {
			
			System.out.println("영문자가 아닙니다.");

		}
		
	}
	
}
