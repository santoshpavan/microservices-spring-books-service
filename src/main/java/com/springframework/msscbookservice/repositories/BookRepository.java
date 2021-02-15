package com.springframework.msscbookservice.repositories;

import com.springframework.msscbookservice.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BookRepository extends PagingAndSortingRepository<Book, UUID> {
}
