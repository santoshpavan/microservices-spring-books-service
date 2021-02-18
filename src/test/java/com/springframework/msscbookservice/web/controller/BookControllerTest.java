package com.springframework.msscbookservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springframework.msscbookservice.web.model.BookDto;
import com.springframework.msscbookservice.web.model.BookGenreEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BookController.class)
class BookControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBookById() throws Exception {
        mockMvc.perform(get("/api/v1/book/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
    }

    @Test
    void saveNewBook() throws Exception {
        BookDto bookDto = getValidBookDto();
        String bookDtoJson = objectMapper.writeValueAsString(bookDto);

        mockMvc.perform(
                    post("/api/v1/book/")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(bookDtoJson)
                ).andExpect(status().isCreated());
    }

    @Test
    void updateBookById() throws Exception {
        BookDto bookDto = getValidBookDto();
        String bookDtoJson = objectMapper.writeValueAsString(bookDto);

        mockMvc.perform(
                    put("/api/v1/book/" + UUID.randomUUID().toString())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(bookDtoJson)
                ).andExpect(status().isNoContent());
    }

    BookDto getValidBookDto(){
        return BookDto.builder()
                .bookName("bookname1")
                .bookGenre(BookGenreEnum.ACTION)
                .price(new BigDecimal("2.99"))
                .upc(123123123123L)
                .build();
    }
}