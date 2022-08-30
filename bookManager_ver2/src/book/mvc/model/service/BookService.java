package book.mvc.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import book.exception.BookException;
import book.mvc.model.dao.BookDao;
import book.mvc.model.vo.Book;

import static common.JDBCTemplate.*;

public class BookService {
	private BookDao bdao;
	
	public BookService() throws BookException {
		bdao = new BookDao();
	}
	
	
	public int insertBook(Book b) throws BookException {
		Connection conn = getConnetion();
		int result = bdao.insertBook(conn, b);
	
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		
		return result;
	}

	public int updateBook(Book b) throws BookException {
		Connection conn = getConnetion();
		int result = bdao.updateBook(conn, b);

		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		
		return result;
	}

	public int deleteBook(int bookId) throws BookException {
		Connection conn = getConnetion();
		int result = bdao.deleteBook(conn, bookId);
	
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		
		return result;
	}

	public Book selectBook(int bookId) throws BookException {
		Connection conn = getConnetion();
		Book b = bdao.selectBook(conn, bookId);
		close(conn);
		return b;
	}

	public ArrayList<Book> searchBookTitle(String bookTitle) throws BookException {
		Connection conn = getConnetion();
		ArrayList<Book> list = bdao.searchBookTitle(conn, bookTitle);
		close(conn);
		return list;
	}

	public ArrayList<Book> selectAllBooks() throws BookException {
		Connection conn = getConnetion();
		ArrayList<Book> list = bdao.selectAllBooks(conn);
		close(conn);
		return list;
	}

}
