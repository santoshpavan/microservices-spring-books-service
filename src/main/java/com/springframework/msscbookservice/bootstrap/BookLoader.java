package com.springframework.msscbookservice.bootstrap;

import com.springframework.msscbookservice.domain.Book;
import com.springframework.msscbookservice.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/*
Runs as bookstrap i.e. before the application starts
*/

@Component
public class BookLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BookLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        loadBookObjects();
    }

    private void loadBookObjects() {
        if (bookRepository.count() == 0) {
            // if empty then create
            bookRepository.save(
                Book.builder()
                .bookName("Book 1")
                .bookGenre("Genre 1")
                .quantityToWrite(200)
                .minOnHand(10)
                .upc(1000001L)
                .price(new BigDecimal("15.50"))
                .build()
            );
            bookRepository.save(
                Book.builder()
                .bookName("Book 2")
                .bookGenre("Genre 2")
                .quantityToWrite(200)
                .minOnHand(10)
                .upc(1000002L)
                .price(new BigDecimal("10.00"))
                .build()
            );
        }
    }
}
