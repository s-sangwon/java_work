package book.mvc.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100000L;
	private int bookID;
	private String title;
	private String author;
	private String publisher;
	private Date publish_date;
	private int price;
	public Book() {
		super();
	}
	public Book(int bookID, String title, String author, String publisher, Date publish_date, int price) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publish_date = publish_date;
		this.price = price;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publish_date=" + publish_date + ", price=" + price + "]";
	}
	
	
}
