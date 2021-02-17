package com.springframework.msscbookservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data //getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder //Builder Pattern
public class BookDto {
    // validation to NULL so that it cannot be set externally
    @Null
    private UUID id;
    @Null
    private Integer version;
    // Use OffsetDateTime to make times based on the UTC date
    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String bookName;
    @NotNull
    private BookGenreEnum bookGenre;
    @Positive
    @NotNull
    private long upc;
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;
}
