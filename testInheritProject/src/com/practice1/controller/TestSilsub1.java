package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book b1 = new Book("1번", "1저자", 5000);
		Book b2 = new Book("2번", "2저자", 2200);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("b1 == b2 :"+b1.equals(b2));
		
		Book c = (Book)b1.clone();
		
		System.out.println("b1 = " + b1);
		System.out.println("c = " + c);
		System.out.println("c == b1 : "+ c.equals(b1));

	}

}
