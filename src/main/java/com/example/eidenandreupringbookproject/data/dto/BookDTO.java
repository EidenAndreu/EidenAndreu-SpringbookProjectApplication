package com.example.eidenandreupringbookproject.data.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class BookDTO {
    private int id;
    private String title;
    private String author;
    private int pages;

    public BookDTO(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
