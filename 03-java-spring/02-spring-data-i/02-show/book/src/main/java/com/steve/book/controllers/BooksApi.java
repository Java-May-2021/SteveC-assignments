package com.steve.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steve.book.models.Book;
import com.steve.book.services.BookService;

@RestController
@RequestMapping("/api")
public class BooksApi {
  @Autowired
  private BookService bService;
  
  @GetMapping("")
  public List<Book> getBooks(){
	  return this.bService.allBooks();
  }
  @GetMapping("/{id}")
  public Book getSingle(@PathVariable("id") Long id) {
	  return this.bService.getSingleBook(id);
  }
  @PostMapping("/create")
  public Book createBook(Book newBook) {
	  return this.bService.createBook(newBook);
	  
  }
  @PutMapping("/update/{id}")
  public Book edit(@PathVariable("id") Long id, Book updatedBook) {
	  return this.bService.updateBook(updatedBook);
  }
  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
	  this.bService.deleteBook(id);
  }
}
