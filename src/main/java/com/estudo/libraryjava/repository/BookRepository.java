package com.estudo.libraryjava.repository;

import com.estudo.libraryjava.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
