package com.project.AlexandriaLibrary.entity;

import java.io.Serializable;

public class BookAuthorId implements Serializable {
     Long book;
     Long author;

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
