package com.springframework.msscbookservice.web.controller;

import com.springframework.msscbookservice.web.model.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/book")
@RestController
public class BookController {

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("bookId") UUID bookId) {
        //TODO
        return new ResponseEntity<>(BookDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBook(@RequestBody BookDto bookDto) {
        //TODO
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity updateBookById(@PathVariable("bookId") UUID bookId, @RequestBody BookDto bookDto) {
        //TODO
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
