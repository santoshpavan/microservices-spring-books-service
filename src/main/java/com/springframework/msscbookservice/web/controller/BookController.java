package com.springframework.msscbookservice.web.controller;

import com.springframework.msscbookservice.services.BookService;
import com.springframework.msscbookservice.web.model.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
@RestController
public class BookController {

    private final BookService bookService;

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("bookId") UUID bookId) {
        return new ResponseEntity<>(bookService.getById(bookId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBook(@Validated @RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.saveNewBook(bookDto), HttpStatus.CREATED);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity updateBookById(@PathVariable("bookId") UUID bookId, @Validated @RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.updateBook(bookId, bookDto), HttpStatus.NO_CONTENT);
    }

}
