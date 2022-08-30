package book.mvc.model.dao;


import static common.JDBCTemplate.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import book.exception.BookException;
import book.mvc.model.vo.Book;


public class BookDao {

	private Properties prop = new Properties();
	
	public BookDao() throws BookException {
		try {
			prop.load(new FileReader("resources/query.properties"));
		} 
		 catch (IOException e) {
			 throw new BookException(e.getMessage());
		}
		
	}
	
	public int insertBook(Connection conn ,Book b) throws BookException {
		int result = 0;

		String query = prop.getProperty("insert");
		
		
		//Connection conn = getConnetion();
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);
			
			//? 에 값 적용
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setDate(4, b.getPublish_date());
			pstmt.setInt(5, b.getPrice());
			
			// 4. 쿼리문 전송 실행하고 결과받기
			result = pstmt.executeUpdate();


		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}
	
	
	public int updateBook(Connection conn ,Book b) throws BookException {
		int result = 0;


		
		String query = prop.getProperty("update");
		
		//Connection conn = getConnetion();
		PreparedStatement pstmt = null;

		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);

			//?
			pstmt.setInt(1, b.getPrice());
			pstmt.setInt(2, b.getBookID());
			
			// 4. 쿼리문 전송 실행하고 결과받기
			result = pstmt.executeUpdate();



		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}
	
	public int deleteBook(Connection conn, int bookID) throws BookException {
		int result = 0;
		String query = prop.getProperty("delete");

		//Connection conn = getConnetion();
		PreparedStatement pstmt = null;

		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);
			//?
			pstmt.setInt(1, bookID);
			
			// 4. 쿼리문 전송 실행하고 결과받기
			result = pstmt.executeUpdate();

	
		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}
	
	public ArrayList<Book> selectAllBooks(Connection conn) throws BookException {
		ArrayList<Book> bList = new ArrayList<Book>();
		String query = prop.getProperty("selectall");
		//Connection conn = getConnetion();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);

			// 4. 쿼리문 전송 실행하고 결과받기
			rset = pstmt.executeQuery();
			
			// 5. 받은 결과 처리하기
			while (rset.next()) {
				Book b = new Book();
				
				b.setBookID(rset.getInt("book_id"));
				b.setTitle(rset.getString("title"));
				b.setAuthor(rset.getString("author"));
				b.setPublisher(rset.getString("publisher"));
				b.setPublish_date(rset.getDate("publish_date"));
				b.setPrice(rset.getInt("price"));
				
				bList.add(b);
			}

		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return bList;
	}
	
	public ArrayList<Book> searchBookTitle(Connection conn, String bookTitle) throws BookException  {
		ArrayList<Book> bList = new ArrayList<Book>();
		//String query = "select * from book where title like '%" +bookTitle+"%'";
		String query = prop.getProperty("selecttitle");
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);

			//?
			pstmt.setString(1, "%"+bookTitle+"%");
			
			// 4. 쿼리문 전송 실행하고 결과받기
			rset = pstmt.executeQuery();

			// 5. 받은 결과 처리하기
			while (rset.next()) {
				Book b = new Book();

				b.setBookID(rset.getInt("book_id"));
				b.setTitle(rset.getString("title"));
				b.setAuthor(rset.getString("author"));
				b.setPublisher(rset.getString("publisher"));
				b.setPublish_date(rset.getDate("publish_date"));
				b.setPrice(rset.getInt("price"));


				bList.add(b);
			}

		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return bList;
	}
	
	public Book selectBook(Connection conn, int bookId) throws BookException {
		Book b = null;
		String query = prop.getProperty("selectbook");

				PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {

			// 3. 문장객체 생성
			pstmt = conn.prepareStatement(query);

			//?
			pstmt.setInt(1, bookId);
			
			// 4. 쿼리문 전송 실행하고 결과받기
			rset = pstmt.executeQuery();

			// 5. 받은 결과 처리하기
			while (rset.next()) {
				 b = new Book();

				b.setBookID(rset.getInt("book_id"));
				b.setTitle(rset.getString("title"));
				b.setAuthor(rset.getString("author"));
				b.setPublisher(rset.getString("publisher"));
				b.setPublish_date(rset.getDate("publish_date"));
				b.setPrice(rset.getInt("price"));

			}

		} catch (Exception e) {
			throw new BookException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return b;
	}
	
}
