package com.springbootProjects.bookcatalogservice.domain;

public class CatalogItem {

	private String name;
	private String author;
	private String publishdate;
	private int rating;
	
	
	
	public CatalogItem() {
		super();
	}
	
	public CatalogItem(String name, String author, String publishdate, int rating) {
		super();
		this.name = name;
		this.author = author;
		this.publishdate = publishdate;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
