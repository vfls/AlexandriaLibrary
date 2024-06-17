package com.project.BookOrganizer.books.entities;

import com.project.BookOrganizer.authors.entities.BookAuthor;
import com.project.BookOrganizer.users.entities.UserBook;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBOOK")
    private long idBook;

    @Column(name = "ISBN", unique = true, nullable = false, length = 13)
    private int isbn;

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "SYNOPSIS", nullable = false, length = 1000)
    private String synopsis;

    @Column(name = "PUBLISHER", nullable = false, length = 100)
    private String publisher;

    @Column(name = "PYEAR", nullable = false)
    private int pYear;

    @Enumerated(EnumType.STRING)
    @Column(name = "FORMAT", nullable = false)
    private Format format;

    @Column(name = "PAGES", nullable = false)
    private int pageCount;

    @Column(name = "COVER", nullable = true, length = 255)
    private String coverUrl;

    @Column(name = "VOL")
    private int vol;

    @OneToMany(mappedBy = "book")
    private Set<BookAuthor> bookAuthors;

    @OneToMany(mappedBy = "book")
    private Set<UserBook> userBooks;

    public Book() {

    }

    public Book(long idBook, int isbn, String title, String synopsis, String publisher, int pYear, Format format, int pageCount, String coverUrl, int vol, Set<BookAuthor> bookAuthors, Set<UserBook> userBooks) {
        this.idBook = idBook;
        this.isbn = isbn;
        this.title = title;
        this.synopsis = synopsis;
        this.publisher = publisher;
        this.pYear = pYear;
        this.format = format;
        this.pageCount = pageCount;
        this.coverUrl = coverUrl;
        this.vol = vol;
        this.bookAuthors = bookAuthors;
        this.userBooks = userBooks;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getpYear() {
        return pYear;
    }

    public void setpYear(int pYear) {
        this.pYear = pYear;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public Set<UserBook> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(Set<UserBook> userBooks) {
        this.userBooks = userBooks;
    }

}