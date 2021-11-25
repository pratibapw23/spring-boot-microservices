package com.springbootProjects.ratingsdataservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootProjects.ratingsdataservice.domain.Ratings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
	
	@RequestMapping("/{bookid}")
	public Ratings getRatings(@PathVariable("bookid") String bookid) {
		
		return new Ratings(bookid,5);
	}

}
