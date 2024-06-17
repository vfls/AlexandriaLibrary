package com.project.BookOrganizer.authors.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "AUTHOR")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAUTHOR")
    private long idAuthor;

    @Column(name = "AUTHOR_NAME", nullable = false, length = 50)
    private String authorName;

    @Column(name = "PHOTO", length = 255, nullable = true)
    private String photoUrl;

    @OneToMany(mappedBy = "author")
    private Set<BookAuthor> bookAuthors;

    public Author() {

    }

    public Author(String authorName, long idAuthor, String photoUrl, Set<BookAuthor> bookAuthors) {
        this.authorName = authorName;
        this.idAuthor = idAuthor;
        this.photoUrl = photoUrl;
        this.bookAuthors = bookAuthors;
    }

    public long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
