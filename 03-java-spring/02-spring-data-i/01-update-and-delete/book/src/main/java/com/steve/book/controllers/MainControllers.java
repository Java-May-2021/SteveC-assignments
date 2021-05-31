package com.steve.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.book.models.Book;
import com.steve.book.services.BookService;

@Controller
public class MainControllers {
	  @Autowired
	  private BookService bService;
	  @GetMapping("/")
	  public String index(Model viewModel) {
		  viewModel.addAttribute("books", this.bService.allBooks());
		  
		  return "index.jsp";
	  }
	  
	  @GetMapping("/add") 
	  public String add() {
		  return "new.jsp";
	  }
	  @RequestMapping("/books/{id}")
	    public String findBookByIndex(Model model, @PathVariable("id") Long id) {
	        Book book = bService.getSingleBook(id);
	        model.addAttribute("book", book);
	        return "showBook.jsp";
	  }
	 
}
