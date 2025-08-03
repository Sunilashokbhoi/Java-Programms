package com.java.demo.factory_method;

public class Book {
	private String authorBook;
	private String bookTitle;
	
	public Book(String authorBook, String bookTitle) {
		super();
		this.authorBook = authorBook;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [authorBook=" + authorBook + ", bookTitle=" + bookTitle + "]";
	}
	public static Book getBookObject() {
		return new Book("James Gosling","Java");
	}
	
}
