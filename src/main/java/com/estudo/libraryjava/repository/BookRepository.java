package com.estudo.libraryjava.repository;

import com.estudo.libraryjava.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {}
