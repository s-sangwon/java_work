package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner sc = new Scanner(System.in);
	  public void addDashToken(){
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			int i =0;
		  do {
			  System.out.print(str.charAt(i));
			  if(i+1 != str.length())
				  System.out.print('-');
		  } while(++i < str.length());
	  }
	  public void burgerKingMenu(){
		  
		  String str = "";
			int total = 0;
			char ch = 'y';
			do {
				String menu = "*** 메뉴를 선택하세요 ***\n" + "햄버거 ***************\n" + "1. 불고기버거	3500원\n" + "2. 치킨버거	3200원\n"
						+ "추가 ****************\n" + "3. 감자튀김	1000원\n" + "4. 치즈스틱	400원\n" + "5. 샐러드		2000원\n"
						+ "음료수 ***************\n" + "6. 콜라		700원\n" + "7. 에이드		1200원\n" + "8. 커피		1000원\n"
						+ "********************\n";
				System.out.println(menu);

				System.out.print("메뉴 선택 : ");
				int no = sc.nextInt();

				int price = 0;
				String name = null;
				switch (no) {
				case 1:
					price = 3500;
					name = "불고기버거";
					break;
				case 2:
					price = 3200;
					name = "치킨버거";
					break;
				case 3:
					price = 1000;
					name = "감자튀김";
					break;
				case 4:
					price = 400;
					name = "치즈스틱";
					break;
				case 5:
					price = 2000;
					name = "샐러드";
					break;
				case 6:
					price = 700;
					name = "콜라";
					break;
				case 7:
					price = 1200;
					name = "에이드";
					break;
				case 8:
					price = 1000;
					name = "커피";
					break;
				default:
					System.out.println("올바른 메뉴를 입력하세요.");
					continue;
				}
				System.out.println(name + "를 선택하셨습니다.");

				System.out.print("수량은 ? : ");
				int qt = sc.nextInt();
				System.out.println(qt + "개 주문하셨습니다.");
				int subTotal;
				total += subTotal = price * qt;
				str += name + " : " + qt + "개 - " + subTotal + "원\n";

				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				ch = sc.next().toLowerCase().charAt(0);
				if (!(ch == 'y' || ch == 'n')) {
					System.out.println("y또는 n만 입력하세요. 메뉴선택으로 돌아갑니다.");
					ch = 'y';
					continue;
				}

			} while (ch == 'y');

			System.out.println("\n* 주문하시 정보는 다음과 같습니다. *");
			System.out.println("----------------------------");
			System.out.print(str);
			System.out.println("----------------------------");
			System.out.println("총 가격 : " + total + "원");
		  
	  }
	//	=> "프로그램 종료"를 "이전메뉴로 이동"으로 변경할 것
	  public void isStringAlphabet(){
		  //. 문자열 입력받아, "모든 글자 영문자다"/"영문자 아니다." 출력하기
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			String result ="";
			int i =0;
		  do {
			  if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
						result = "모든 글자 영문자다.";
			  }
			  else {
				  result = "모든 글자 영문자 아니다."; break;
			  }
		  }while(++i < str.length());
		  System.out.println(result);
	  }
}
