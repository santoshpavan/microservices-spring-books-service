package com.springframework.msscbookservice.web.mappers;

import com.springframework.msscbookservice.domain.Book;
import com.springframework.msscbookservice.web.model.BookDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BookMapper {

    BookDto BookToBookDto(Book book);

    Book BookDtoToBook(BookDto bookDto);
}
