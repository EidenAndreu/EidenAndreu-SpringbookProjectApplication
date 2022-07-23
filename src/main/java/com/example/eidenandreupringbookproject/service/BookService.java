package com.example.eidenandreupringbookproject.service;

import com.example.eidenandreupringbookproject.data.dao.Book;
import com.example.eidenandreupringbookproject.data.dto.BookDTO;
import com.example.eidenandreupringbookproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void getAllBook() {
        var allBooks = bookRepository.findAll();
        if (allBooks.size() == 0) {
            System.out.println("Still no books recorded");
        }
        for (Book book : allBooks) ;
        System.out.println(allBooks);
    }

    public void addBooktoDashboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        var title = scanner.nextLine();
        System.out.println("Enter author: ");
        var author = scanner.nextLine();
        System.out.println("Enter pages: ");
        var pages = scanner.nextInt();
        createBook(new BookDTO(title, author, pages));
    }

    public BookDTO createBook(BookDTO bookDTO) {
        var bookToSave = new Book(bookDTO.getTitle(), bookDTO.getPages(), bookDTO.getAuthor());
        var storedBook = bookRepository.save(bookToSave);
        var storedBookDTO = new BookDTO(storedBook.getId(), storedBook.getTitle(), storedBook.getAuthor(), storedBook.getPages());
        System.out.println();
        return storedBookDTO;
    }

}

