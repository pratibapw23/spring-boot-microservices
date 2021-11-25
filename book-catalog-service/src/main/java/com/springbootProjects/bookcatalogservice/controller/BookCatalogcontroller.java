package com.springbootProjects.bookcatalogservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springbootProjects.bookcatalogservice.domain.Book;
import com.springbootProjects.bookcatalogservice.domain.CatalogItem;
import com.springbootProjects.bookcatalogservice.domain.Ratings;

@RestController
@RequestMapping("/catalog")
public class BookCatalogcontroller {

	@RequestMapping("/{userid}")
	public List<CatalogItem> setCatalog(@PathVariable("userid") String userid){
		
		RestTemplate restTemplate=new RestTemplate();
		//
		//1. Get all Book ids
		
		List<Ratings> ratings=Arrays.asList(
				
				new Ratings("111",4),
				new Ratings("222",5)
				
				);
		
		return ratings.stream().map(rating -> {
			Book book=restTemplate.getForObject("http://localhost:8082/books/" + rating.getBookid(), Book.class);
		return new CatalogItem(book.getName(),"Author1","9/10/1990", rating.getRating());
	})
	.collect(Collectors.toList());
				
				
		//2. For each book id, get book details from book info service
		//3. combine
		
	}
}
