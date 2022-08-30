package book.mvc.controller;

import java.util.ArrayList;

import book.exception.BookException;
import book.mvc.model.dao.BookDao;
import book.mvc.model.service.BookService;
import book.mvc.model.vo.Book;

public class BookController {
	//의존성주입(di)
	private BookService bservice;
	
	public BookController () {
		try {
			bservice = new BookService();
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void insertBook(Book b)  // => dao의 insertBook(b) 호출
	{
		try {
			if(bservice.insertBook(b) > 0)
				System.out.println("\n책 등록 성공!");
			else 
				System.out.println("\n책 등록 실패!");
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateBook(Book b) // => dao의 updateBook(b) 호출
	{
		try {
			if(bservice.updateBook(b) > 0)
				System.out.println("\n책 수정 성공!");
			else 
				System.out.println("\n책 수정 실패!");
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteBook(int bookId) //=> dao의 deleteBook(bid) 호출
	{
		try {
			if(bservice.deleteBook(bookId) > 0)
				System.out.println("\n책 삭제 성공!");
			else 
				System.out.println("\n책 삭제 실패!");
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Book searchBook(int bookId) //=> dao의 selectBook(bid) 호출
	{
		Book b = null;
		try {
			b = bservice.selectBook(bookId);
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	public ArrayList<Book> searchBookTitle(String bookTitle) {
		//=> dao의 searchBookTitle(bookTitle) 호출
		ArrayList<Book> list = null;
		try {
			list = bservice.searchBookTitle(bookTitle);
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
		
	
	public ArrayList<Book> selectAllBooks() //=> dao의 selectAllBooks() 호출
	{
		ArrayList<Book> list = null;
		try {
			list= bservice.selectAllBooks();
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
