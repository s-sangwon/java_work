package book.mvc.view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import book.mvc.controller.BookController;
import book.mvc.model.vo.Book;

public class BookMenu {
	// di
	private BookController bcontroll = new BookController();
	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		String menu = "\n*** 도서 관리 프로그램 ***\n\n" +

				"1. 도서 추가\n" + // => BookController 의 insertBook(Book객체) 호출
				"2. 도서 정보 수정\n" + // => BookController 의 updateBook(Book객체) 호출
				"3. 도서 삭제\n" + // =>BookController 의 deleteBook(책아이디) 호출
				"4. 도서 아이디로 조회\n" + // => BookController 의 searchBook(아이디) 호출
				"5. 도서 제목으로 조회\n" + // => BookController 의 searchBookTitle(제목) 호출
				"6. 도서 목록 전체 조회\n" + // => BookController 의 selectAll() 호출
				"9. 끝내기\n" + "번호 선택 : ";

		do {
			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				bcontroll.insertBook(inputBook());
				break;
			case 2:
				bcontroll.updateBook( inputBook( bcontroll.searchBook(inputBookId())));
				break;
			case 3:
				bcontroll.deleteBook(inputBookId());
				break;
			case 4:
				displayBook(bcontroll.searchBook(inputBookId()));
				break;
			case 5:
				displayBooks(bcontroll.searchBookTitle(inputBookTitle()));
				break;
			case 6:
				displayBooks(bcontroll.selectAllBooks());
				break;
			case 9:
				System.out.println("\n프로그램을 종료하시겠습니까?(y/n) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y') {
					return;
				} else
					break;

			default:
				System.out.println("\n잘못 입력하셨습니다.\n다시입력하세요.");
				break;
			}

		} while (true);

	}

	// 새로 등록할 책 정보 키보드 입력용 메소드

	public Book inputBook() {
		Book b = new Book();

		System.out.print("책제목 : ");
		b.setTitle(sc.next());
		System.out.print("저자명 : ");
		b.setAuthor(sc.next());

		System.out.print("출판사 : ");
		b.setPublisher(sc.next());
		System.out.print("출판날짜[yyyy-mm-dd] : ");
		b.setPublish_date(Date.valueOf(sc.next()));

		System.out.print("가격 : ");
		b.setPrice(sc.nextInt());

		return b;
	}

	public Book modifyBook() {
		Book b = new Book();

		System.out.print("수정할 책 번호 : ");
		b.setBookID(sc.nextInt());

//		System.out.print("책제목 : ");
//		b.setTitle(sc.next());
//		System.out.print("저자명 : ");
//		b.setAuthor(sc.next());
//		
//		System.out.print("출판사 : ");
//		b.setPublisher(sc.next());
//		System.out.print("출판날짜[yyyy-mm-dd] : ");
//		b.setPublish_date( Date.valueOf(sc.next()) );

		System.out.print("가격 : ");
		b.setPrice(sc.nextInt());

		return b;
	}
	public Book inputBook(Book b) {
		
		
		System.out.print("가격 : ");
		b.setPrice(sc.nextInt());

		return b;
	}
	
	
	public int inputBookId() {
		System.out.print("\n검색/삭제할 책 아이디 : ");
		return sc.nextInt();
	}

	public String inputBookTitle() {
		System.out.print("\n조회할 책 제목 : ");
		return sc.next();
	}

	public void displayBooks(ArrayList<Book> list) {
		if (list != null) {

			System.out.println("\n책수 : " + list.size());

			for (Book b : list) {
				System.out.println(b);
			}
		}
		else
			displayError("책이 존재하지 않습니다.");
	}

	public void displayBook(Book b) {
		if (b != null)
			System.out.println(b);
		else
			displayError("책이 존재하지 않습니다.");
	}

	public void displayError(String message) {
		System.out.println(message);
	}
}
