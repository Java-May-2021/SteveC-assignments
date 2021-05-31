package com.steve.book.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steve.book.models.Book;
import com.steve.book.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
   private final BookRepository bRepo;
    
    public BookService(BookRepository repo) {
        this.bRepo = repo;
    }
    // returns all the books
    public List<Book> allBooks() {
        return this.bRepo.findAll();
    }
    // creates a book
    public Book createBook(Book book) {
        return bRepo.save(book);
    }
    // get single book
    public Book getSingleBook(Long id) {
    	return this.bRepo.findById(id).orElse(null);
    // delete book
   
    }
    public void deleteBook(Long id) {
    	this.bRepo.deleteById(id);
    }
    // update
    public Book updateBook(Book book) {
    	return bRepo.save(book);
    }
    
}
