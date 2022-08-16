package oop.practice.model;

public class Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
	}
	
	public Book(String title, int price, double dRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = dRate;
		this.author = author;
	}
	
	public String bookInfomation() {
		return title +"\t"+ price +"\t"+ discountRate +"\t"+ author;
	}

	// set,get
	public void setTitle(String title) { this.title = title; }
	public String getTitle() {return this.title;}
	
	public void setAuthor(String author) { this.author = author; }
	public String getAuthor() {return this.author;}
	
	public void setPrice(int price) { this.price = price; }
	public int getPrice() {return this.price;}
	
	public void setDiscountRate(double discountRate) { this.discountRate = discountRate; }
	public double getDiscountRate() {return this.discountRate;}
}
