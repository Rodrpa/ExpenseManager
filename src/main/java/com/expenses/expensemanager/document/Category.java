package com.expenses.expensemanager.document;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Category {

    private String id;
    private String name;
    private String description;

    private LocalDateTime dtCreated;
    private LocalDateTime dtUpdated;
}
