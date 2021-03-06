package com.springframework.msscbookservice.services;

import com.springframework.msscbookservice.web.model.BookDto;

import java.util.UUID;

public interface BookService {
    BookDto getById(UUID bookId);

    BookDto saveNewBook(BookDto bookDto);

    BookDto updateBook(UUID bookId, BookDto bookDto);
}
