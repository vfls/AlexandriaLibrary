package com.project.AlexandriaLibrary.entity;

import java.io.Serializable;

public class UserBookId implements Serializable {
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
