package com.oop.silsub.model;

import java.util.Scanner;

import com.oop.array3.model.Book;

public class BookManager {
	private Book[] bar=null;
	Scanner sc = new Scanner(System.in);
	private static int count=0;
	
	public BookManager() {
		super();
		bar = new Book[10];
	}
	
	public void menu() {
		String menu ="\n***** 도서 관리 메뉴 *****\n\n"+

				"1. 도서 정보 추가\n"	+//선택시 bookInput() 메서드 실행함
				"2. 모두 출력\n"	+//선택시 bookAllOutput() 메서드 실행함
				"7. 끝내기\n"+		//main() 으로 return함;
				"입력 : ";
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1: bookInput(); break;
			case 2: bookAllOutput(); break;
			case 7: return;
			}
			
		}while(true);
	}
	public void bookInput() {
		bar[count] = new Book();
		System.out.print("제목 : ");
		bar[count].setTitle(sc.next());
		System.out.print("저자 : ");
		bar[count].setAuthor(sc.next());
		System.out.print("가격 : ");
		bar[count].setPrice(sc.nextInt());
		System.out.print("할인율 : ");
		bar[count++].setDiscountRate(sc.nextDouble());
		
	}
	
	public void bookAllOutput() {
		for(int i=0; i<count; i++) {
			System.out.println(bar[i]);
		}
	}
	
}
