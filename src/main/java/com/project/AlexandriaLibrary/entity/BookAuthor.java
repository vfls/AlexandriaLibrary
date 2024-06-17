package com.project.AlexandriaLibrary.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@IdClass(BookAuthorId.class)
@Table(name = "BOOK_AUTHOR")
public class BookAuthor {
    @Id
    @ManyToMany
    @JoinColumn(name = "ID_BOOK", nullable = false)
    private Book book;

    @Id
    @ManyToMany
    @JoinColumn(name = "ID_AUTHOR", nullable = false)
    private Author author;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

class BookAuthorId implements Serializable {
    private Long book;
    private Long author;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookAuthorId that)) return false;

        return book.equals(that.book) && author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = book.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
