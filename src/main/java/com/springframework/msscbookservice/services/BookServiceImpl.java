package com.springframework.msscbookservice.services;

import com.springframework.msscbookservice.domain.Book;
import com.springframework.msscbookservice.repositories.BookRepository;
import com.springframework.msscbookservice.web.mappers.BookMapper;
import com.springframework.msscbookservice.web.model.BookDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @SneakyThrows
    @Override
    public BookDto getById(UUID bookId) {
        return bookMapper.bookToBookDto(bookRepository.findById(bookId).orElseThrow(ChangeSetPersister.NotFoundException::new));
    }

    @Override
    public BookDto saveNewBook(BookDto bookDto) {
        return bookMapper.bookToBookDto(bookRepository.save(bookMapper.bookDtoToBook(bookDto)));
    }

    @SneakyThrows
    @Override
    public BookDto updateBook(UUID bookId, BookDto bookDto) {
        Book book = bookRepository.findById(bookId).orElseThrow(ChangeSetPersister.NotFoundException::new);

        book.setBookName(bookDto.getBookName());
        book.setBookGenre(bookDto.getBookGenre().name());
        book.setPrice(bookDto.getPrice());
        book.setUpc(bookDto.getUpc());

        return bookMapper.bookToBookDto(bookRepository.save(book));
    }
}
