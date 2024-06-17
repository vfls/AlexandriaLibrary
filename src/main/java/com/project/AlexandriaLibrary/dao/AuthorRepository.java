package com.project.AlexandriaLibrary.dao;

import com.project.AlexandriaLibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
