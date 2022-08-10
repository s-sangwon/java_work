package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		
		System.out.println(b1.bookInfomation());
		System.out.println(b2.bookInfomation());
		
		b1.setTitle("자바의 정석");
		b1.setPrice(35000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		System.out.println(b1.bookInfomation());
		
		System.out.println("도서명 : " + b1.getTitle());
		System.out.println("할인된 가격 : " + (b1.getPrice() - (int)(b1.getPrice()*b1.getDiscountRate()))+" 원");
		
		System.out.println("도서명 : " + b2.getTitle());
		System.out.println("할인된 가격 : " + (b2.getPrice() - (int)(b2.getPrice()*b2.getDiscountRate()))+" 원");
	}

}
