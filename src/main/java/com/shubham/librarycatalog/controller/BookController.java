package com.shubham.librarycatalog.controller;

import com.shubham.librarycatalog.entity.Book;
import com.shubham.librarycatalog.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(bookService.addBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        boolean removed = bookService.deleteBook(id);
        return removed ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/availability")
    public ResponseEntity<Void> updateAvailability(@PathVariable int id, @RequestParam boolean available) {
        boolean updated = bookService.updateAvailability(id, available);
        return updated ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
