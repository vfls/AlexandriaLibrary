package com.project.AlexandriaLibrary.dao;

import com.project.AlexandriaLibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Long, Book> {
}
