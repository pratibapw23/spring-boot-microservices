package com.springbootProjects.ratingsdataservice.domain;

public class Ratings {
	
	private String bookid;
	private int rating;
	
	public Ratings(String bookid, int rating) {
		super();
		this.bookid = bookid;
		this.rating = rating;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
