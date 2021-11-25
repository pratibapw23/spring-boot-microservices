package com.springbootProjects.bookcatalogservice.domain;

public class Book {

	private String bookid;
	private String name;
	
	
	public Book() {
		super();
	}
	public Book(String bookid, String name) {
		super();
		this.bookid = bookid;
		this.name = name;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
