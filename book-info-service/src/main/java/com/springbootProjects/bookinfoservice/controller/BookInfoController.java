package com.springbootProjects.bookinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootProjects.bookinfoservice.domain.Book;

@RestController
@RequestMapping("/books")
public class BookInfoController {
	
	@RequestMapping("/{bookid}")
	public Book getBookDetails(@PathVariable("bookid") String bookid) {
		
		return new Book(bookid,"C for beginners");
		
	}

}
