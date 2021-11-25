package com.springbootProjects.bookcatalogservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootProjects.bookcatalogservice.domain.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class BookCatalogcontroller {

	@RequestMapping("/{userid}")
	public List<CatalogItem> setCatalog(@PathVariable("userid") String userid){
		
		return Collections.singletonList(
				
				new CatalogItem("Java The Complete Reference","user","12/10/1998",5)
				//new CatalogItem("C++","user2","4/2/1977",5);
				
				);
	}
}
