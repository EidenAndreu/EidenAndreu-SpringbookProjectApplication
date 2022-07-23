package com.example.eidenandreupringbookproject.data.dao;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private int pages;

    @NotNull
    private String title;
    @CreationTimestamp
    private Instant creationTime;
    @UpdateTimestamp
    private Instant lastUpdateTime;


    public Book(String author, int pages, String title) {
        this.author = author;
        this.pages = pages;
        this.title = title;
    }
}

