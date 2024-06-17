package com.project.AlexandriaLibrary.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@IdClass(UserBookId.class)
@Table(name = "USER_BOOK")
public class UserBook {
    @Id
    @ManyToMany
    @JoinColumn(name = "ID_BOOK", nullable = false)
    private Book book;

    @Id
    @ManyToMany
    @JoinColumn(name = "ID_USER", nullable = false)
    private User user;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

class UserBookId implements Serializable {
    private Long book;
    private Long user;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBookId that)) return false;

        return book.equals(that.book) && user.equals(that.user);
    }

    @Override
    public int hashCode() {
        int result = book.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}