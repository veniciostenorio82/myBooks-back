package com.estudo.libraryjava.service;

import com.estudo.libraryjava.model.Book;
import com.estudo.libraryjava.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService (BookRepository repository) {
        this.repository = repository;

    }

    public List<Book> findAll(){
        return repository.findAll();

    }

    public Book findById(String id){
        Book existingBook = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return existingBook;
    }

    public Book create(Book book) {
        return repository.save(book); //Repository é o responsável pelo armazenamento.

    }
    
    public Book update(String id, Book book) {

        Book existingBook = repository.findById(id).orElseThrow();

        existingBook.setTitle(book.getTitle());
        existingBook.setGenre(book.getGenre());
        existingBook.setPublicationYear(book.getPublicationYear());

        return repository.save(existingBook);

    }

    public Book delete(String id, Book book) {
        repository.deleteById(id);
        return null;
    }
}
