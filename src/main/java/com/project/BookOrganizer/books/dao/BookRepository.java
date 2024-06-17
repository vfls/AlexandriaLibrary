package com.project.BookOrganizer.books.dao;

import com.project.BookOrganizer.books.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
