package com.shubham.librarycatalog.service;

import com.shubham.librarycatalog.entity.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    private final Map<Integer, Book> bookMap = new HashMap<>();
    private int currentId = 1;

    public Book addBook(Book book) {
        book.setId(currentId++);
        bookMap.put(book.getId(), book);
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    public Book getBookById(int id) {
        return bookMap.get(id);
    }

    public boolean deleteBook(int id) {
        return bookMap.remove(id) != null;
    }

    public boolean updateAvailability(int id, boolean availability) {
        Book book = bookMap.get(id);
        if (book != null) {
            book.setAvailable(availability);
            return true;
        }
        return false;
    }
}

