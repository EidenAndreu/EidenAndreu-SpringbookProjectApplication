package com.example.eidenandreupringbookproject.manager;

import com.example.eidenandreupringbookproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BookDashboard {
    Scanner scanner = new Scanner(System.in);

@Autowired
BookService bookService;

    public void menu() {
        var input = "";
        while (!input.equals("exit")) {
            System.out.println("Welcome, what dou you want to do?");
            System.out.println(" - greet - read - create");
            input = scanner.nextLine();
            switch (input) {
                case "greet" -> System.out.println("Hello friend!");
                case "read" -> bookService.getAllBook();
                case "create" -> bookService.addBooktoDashboard();
                default -> System.out.println("not a valid choice.");
            }
        }
    }
}