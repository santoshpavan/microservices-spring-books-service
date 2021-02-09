package com.springframework.msscbookservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data //getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder //Builder Pattern
public class BookDto {
    private UUID id;
    private Integer version;
    // Use OffsetDateTime to make times based on the UTC date
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String bookName;
    private BookGenreEnum bookGenre;
    private long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
