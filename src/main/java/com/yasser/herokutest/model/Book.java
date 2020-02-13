package com.yasser.herokutest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data @NoArgsConstructor
public class Book {
    @Id
    private int Id;
    private String Title;
    private String Author;
}
